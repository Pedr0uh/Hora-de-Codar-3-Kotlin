fun main(){

    var i = 0
    var notas: Double
    var soma = 0.0

    while(i != 6){
        println("Insira a ${i+1}° nota: ")
        notas = readln().toDouble()
        while(notas < 0 || notas > 10){
            println("Nota inválida, insira uma nota entre 0 e 10: ")
            notas = readln().toDouble()
        }
        soma += notas
        i++
    }

    val media = (soma/6)

    if(media >= 7) {
        println("aluno Aprovado")
    }
    else{
        println("aluno Reprovado")
    }

}