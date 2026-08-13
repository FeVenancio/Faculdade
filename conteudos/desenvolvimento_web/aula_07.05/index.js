console.log('Hello, World!')
//alert('Hello, World')

function soma (valor1, valor2) {
    return valor1 + valor2
}

console.log(soma(2,2))

function mult (valor1, valor2) {
    return valor1 * valor2
}

console.log(mult(2,5))

let n1 = "4"
let n2 = "10"
const resultado = soma(n1, n2)


console.log(n1 + " + " + n2 + " = " + resultado)

/*
if(resultado % 2 == 0) {
    alert("Par")
} else {
    alert("Impar")
}
*/

let notas = [10.0, 5.9, 6.5]

let somatorio = 0.0

for (let i = 0; i < 3; i++) {
    somatorio += notas[i]
    console.log(notas[i])
}

const media = (total, qtdElementos) => {
    if (qtdElementos == 0) {
        return -1
    }
    return total / qtdElementos
}
let valorMedia = media(somatorio, 3)

console.log("Média das notas: " + valorMedia)
