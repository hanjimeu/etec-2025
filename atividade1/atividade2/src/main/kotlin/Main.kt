fun main(args: Array<String>) {
    println("Exercício 1")
    val name = "Mariana" //a mais mais
    println("Meu nome é $name")
    println()

    println("Exercício 2")
    val name2 = "Mariana"
    println("Meu nome é $name2")//mostra o meu nome
    println()

    println("Exercício 3")
    val a = 5
    val b = 8
    val c1 = 5 + 8
    val c2 = 5 - 8
    val c3 = 5 / 8
    val c4 = 5 * 8
    println("$a + $b = $c1 ")
    println("$a - $b = $c2 ")
    println("$a / $b = $c3 ")
    println("$a * $b = $c4 ")
    println()

    println("Exercício 4")
    val base = 33
    val altura = 9
    val area = base*altura
    println("Base:$base\r\nAltura:$altura")
    println("Área do retangulo: " + area)
    println()

    println("Exercício 5:")
    fun show(resultado: String) {
        println(resultado)
    }
    val show = "Este é o resultado da função!"
    show(show)
    println()

    println("Exercício 6:")
    val arrayInt:Array<Int> = arrayOf(1,2,3,4,5,6,7,8,9,10)
    val x = arrayInt[4]
    println(x)
    println()
    println("Exercício 7:")
    val lista = mutableListOf(1,2,3,4,5,6,7,8,9)
    lista.add(10)
    println(lista)
    println()

    println("Exercício 8:")
    val senha = "050708"
    if (senha == "050708") {
        println("Acesso permitido.")
    } else {
        println("Acesso negado.")
    }
    println()


    println("Exercício 9:")
    val d = 41
    val e = 56
    if( d > e ) {
        println( "$d é maior que $e" )
    } else {
        println("$d é menor que $e")
    }
    println()

    println("Exercício 10:")
    val lista2 = listOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15)
    for (i in lista2) {
        println("Item: $i")
    }
}