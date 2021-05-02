from selenium import webdriver
import time
import keyboard
from webdriver_manager.chrome import ChromeDriverManager
from selenium.webdriver.common.keys import Keys

driver = webdriver.Chrome(ChromeDriverManager().install())
driver.get('https://web.whatsapp.com/')

with open('Pesquisa.txt', 'r', encoding='utf-8') as contato:
    contatos = contato.readlines()

nomeGetSet = ""

def get_nome():
    return nomeGetSet

def pesquisar_campo():
    contato_novo = open('Pesquisa_andamento.txt', 'a', encoding='utf-8')
    contato_novo.write(get_nome() + "\n")
    contato_novo.close()
    print("Próximo")

def lista_andamento():
    with open('Pesquisa_andamento.txt', 'r', encoding='utf-8') as contato_atual:
        arquivo = contato_atual.readlines()
    nomes = ""
    for linha in arquivo:
        nomes = nomes + linha
    
    print("\n\n\n === Andamento da Lista ===\n" + nomes)

def sair():
    contatos.clear()

def erro():
    contato_novo = open('Erros/Pesquisa_erro.txt', 'a', encoding='utf-8')
    contato_novo.write(get_nome() + "\n")
    contato_novo.close()
    pesquisar_campo()

def repetido():
    contato_novo = open('Erros/Pesquisa_repetidos.txt', 'a', encoding='utf-8')
    contato_novo.write(get_nome() + "\n")
    contato_novo.close()
    pesquisar_campo()

def caso(op):
    opcoes = {
    1: pesquisar_campo,
    2: erro,
    3: repetido,
    4: sair
    }

    return opcoes.get(op, "Opção inválida")

input('\n\n\n**** Quando a página carregar dê um "ENTER" ****\n\n\n')

for pessoas in contatos:
    nomeGetSet = pessoas.strip()

    campo_pessoa = driver.find_element_by_xpath('//div[contains(@class, "copyable-text selectable-text")]')
    campo_pessoa.click()
    campo_pessoa.clear()
    campo_pessoa.send_keys(get_nome())

    pesquisa = input('\n\n\n -------- Para prosseguir com próximo nome digite "1" --------\n -------- Caso esse nome não apareça digite "2" --------\n -------- Se tem nome repetido digite "3" --------\n -------- Para Sair da Aplicação digite "4" --------\n\n\n')
    pesquisa_int = int(pesquisa)

    output = caso(pesquisa_int)
    output()
    
    lista_andamento()

