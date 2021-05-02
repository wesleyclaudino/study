from selenium import webdriver
import time
import keyboard
from webdriver_manager.chrome import ChromeDriverManager
from selenium.webdriver.common.keys import Keys

driver = webdriver.Chrome(ChromeDriverManager().install())
driver.get('https://web.whatsapp.com/')

with open('Nomes.txt', 'r', encoding='utf-8') as contato:
    contatos = contato.readlines()

nomeGetSet = ""
texto = ""

def get_nome():
    return nomeGetSet

def enviar_promocao():
    with open('Mensagem.txt', 'r', encoding='utf-8') as texto:
        mensagem = texto.read()

    campo_mensagem = driver.find_elements_by_xpath('//div[contains(@class, "copyable-text selectable-text")]')
    campo_mensagem[1].click()
    campo_mensagem[1].send_keys(mensagem)
    input('\n\n\n === Enviou? aperte "ENTER" === \n\n\n')
    campo_mensagem[1].send_keys(Keys.ENTER)

    with open('Promoção.txt', 'r', encoding='utf-8') as texto:
        promocao = texto.read()

    clip = driver.find_element_by_css_selector("span[data-icon='clip']")
    clip.click()

    attach = driver.find_element_by_css_selector("input[type='file']")
    attach.send_keys(promocao)
    
    input('\n\n\n === Link carregou? aperte "ENTER" === \n\n\n')
    
    send = driver.find_element_by_css_selector("span[data-testid='send']")
    send.click()

    contato_andamento = open('Envio_andamento.txt', 'a', encoding='utf-8')
    contato_andamento.write(get_nome() + "\n")
    contato_andamento.close()

    print("Próximo")

def enviar_mensagem():

    with open('Mensagem.txt', 'r', encoding='utf-8') as texto:
        mensagem = texto.read()

    campo_mensagem = driver.find_elements_by_xpath('//div[contains(@class, "copyable-text selectable-text")]')
    campo_mensagem[1].click()
    campo_mensagem[1].send_keys(mensagem)
    input('\n\n\n === Enviou? aperte "ENTER" === \n\n\n')
    campo_mensagem[1].send_keys(Keys.ENTER)

    enviar_promocao()

    contato_andamento = open('Envio_andamento.txt', 'a', encoding='utf-8')
    contato_andamento.write(get_nome() + "\n")
    contato_andamento.close()

    print("Próximo")

def lista_andamento():
    with open('Envio_andamento.txt', 'r', encoding='utf-8') as contato_atual:
        arquivo = contato_atual.readlines()
    nomes = ""
    for linha in arquivo:
        nomes = nomes + linha
    
    print("\n\n\n === Andamento da Lista ===\n" + nomes)

def sair():
    contatos.clear()

def erro():
    contato_andamento = open('Envio_erro.txt', 'a', encoding='utf-8')
    contato_andamento.write(get_nome() + "\n")
    contato_andamento.close()

    contato_andamento = open('Envio_andamento.txt', 'a', encoding='utf-8')
    contato_andamento.write(get_nome() + "\n")
    contato_andamento.close()

    print("Envio cancelado!")

def repetido():
    contato_andamento = open('Pesquisa_repetidos.txt', 'a', encoding='utf-8')
    contato_andamento.write(get_nome() + "\n")
    contato_andamento.close()

    contato_andamento = open('Envio_andamento.txt', 'a', encoding='utf-8')
    contato_andamento.write(get_nome() + "\n")
    contato_andamento.close()

    print("Envio cancelado!")

def caso(op):
    opcoes = {
    1: enviar_mensagem,
    2: enviar_promocao,
    3: erro,
    4: repetido,
    5: sair
    }

    return opcoes.get(op, "Opção inválida")

input('\n\n\n**** Quando a página carregar dê um "ENTER" ****\n\n\n')

for pessoas in contatos:
    nomeGetSet = pessoas.strip()

    campo_pessoa = driver.find_element_by_xpath('//div[contains(@class, "copyable-text selectable-text")]')
    campo_pessoa.click()
    campo_pessoa.clear()
    campo_pessoa.send_keys(get_nome())
    campo_pessoa.send_keys(Keys.ENTER)

    opcao = input('\n\n\n -------- Para prosseguir com próximo envio de mensagem digite "1" --------\n  -------- Para prosseguir com próximo envio de promoção digite "2" --------\n -------- Caso esse nome não seja o pesquisado digite "3" --------\n -------- Se tem nome repetido digite "4" --------\n -------- Para Sair da Aplicação digite "5" --------\n\n\n')
    opcao_int = int(opcao)

    output = caso(opcao_int)
    output()
    
    lista_andamento()

