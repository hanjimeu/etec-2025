fun main() {
    ex1(17) //valor de exemplo
    ex2(9)
    ex3(30)
    ex4(arrayOf(6, 7, 8, 9,10,11))
    ex5(arrayOf(-3, 0, 3, 6, 9, 13))
    ex6(10)
    ex7(10, 6)
    ex8(10, 6)
    ex9(10, 6)
    ex10(10, 2)

}
fun ex1(idade: Int) {
    println("Exercício 1")
    if (idade >= 18) {
        println("Maior de idade")
    } else {
        println("Menor de idade")
    }
    println()
}

fun ex2(dia: Int) {
    println("Exercício 2")
    when (dia) {
        1 -> println("Domingo")
        2 -> println("Segunda-feira")
        3 -> println("Terça-feira")
        4 -> println("Quarta-feira")
        5 -> println("Quinta-feira")
        6 -> println("Sexta-feira")
        7 -> println("Sábado")
        else -> println("Dia inválido")
    }
    println()
}

fun ex3(limite: Int) {
    println("Exercício 3")
    for (i in 1..limite) {
        println(i)
    }
    println()
}

fun ex4(array: Array<Int>) {
    println("Exercício 4")
    for (item in array) {
        println(item)
    }
    println()
}

fun ex5(array: Array<Int>) {
    println("Exercício 5")
    if (array.size >= 6) {
        println(array[5])
    } else {
        println("Array não possui 6 elementos")
    }
    println()
}
fun ex6(inicio: Int) {
    println("Exercício 6")
    var numero = inicio
    while (numero >= 0) {
        println(numero)
        numero--
    }
    println()
}

fun ex7(a: Int, b: Int): Int {
    println("Exercício 7")
    val soma = a + b
    println(soma)
    return soma
    println()
}

fun ex8(a: Int, b: Int): Int {
    println("Exercício 8")
    val subtracao = a - b
    println(subtracao)
    return subtracao
    println()
}

fun ex9(a: Int, b: Int): Int {
    println("Exercício 9")
    val multiplicacao = a * b
    println(multiplicacao)
    return multiplicacao
    println()
}

fun ex10(a: Int, b: Int): Double {
    println("Exercício 10")
    val divisao = a.toDouble() / b.toDouble()
    println(divisao)
    return divisao
    println()
}
