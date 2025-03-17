import kotlin.system.exitProcess

var aprovados = 0
var reprovados = 0

fun main(){

    println("Insira a primeira nota: ")
    var nota1 = readln().toDouble()

    println("Insira a segunda nota: ")
    var nota2 = readln().toDouble()

    val media = (nota1 + nota2) / 2

    if (media >= 9.5){
        println("Aluno Aprovado")
        aprovados++
    }
    else {
        println("Aluno Reprovado")
        reprovados++
    }

    calcularNovamente()

}

fun calcularNovamente(){

    println("deseja calcular a media de outro aluno? \n1 - sim \n2 - não")
    val escolha = readln().toInt()

    when (escolha){
        1 -> main()
        2 -> sair()
    }

}

fun sair(){
    println("Número de alunos Aprovados: $aprovados \nNúmero de alunos Reprovados: $reprovados")
    exitProcess(0)
}
