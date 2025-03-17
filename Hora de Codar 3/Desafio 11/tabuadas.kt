fun main(){

    var i = 0
    var j = 0

    println("Insira um numero: ")
    val num = readln().toInt()

    while(i <= num){

        println("\n-- Tabuada do $i --\n")

        while(j <= 10){
            println("$i x $j = ${i*j}")
            j++

        }

        j = 0
        i++

    }

}