var now = new Date()
var hour = now.getHours()

console.log(`Agora são ${hour} horas.`)

if(hour>=1 && hour<6){
	console.log('Ainda acordado? Vá dormir, é madrugada.')
}else if(hour>=6 && hour<12){
	console.log('Bom dia!!!')
}else if(hour>=12 && hour<18){
	console.log('Boa tarde.')
}else{
    console.log('Boa noite.')
}