var idade=22

console.log(`Você tem ${idade} anos.`)

if(idade>18 && idade<60){
	console.log('Voto obrigatório.')
}else if(idade<18 && idade>16){
	console.log('Voto opcional.')
}else{
	console.log('Não vota.')
}