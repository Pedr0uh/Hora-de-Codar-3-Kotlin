fun main () {

    var cont = 30

    while (cont != 0){
        println("Bomba vai explodir em $cont")
        Thread.sleep(1000)
        cont--
    }

    println("BOOOOOM!!")

}