fun main(){

    var i = 0
    var dentro = 0
    var fora = 0


    while(i != 10){
        println("Insira um número: ")
        var num = readln().toInt()
        if(num in 24..42){
            dentro++
        }
        else{
            fora++
        }
        i++
    }

    println("Quantidade de números dentro do intervalo de 24 a 42: $dentro")
    println("Quantidade de números fora do intervalo: $fora")

}