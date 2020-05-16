package cz.zomer.calculator

fun main(args: Array<String>) {



    println("select 1 for geometric sum, select 2 for arithmetic sum")
    val selectFunction = readLine()!!.toInt()
    if (selectFunction == 1) {
        println("Enter value a")
        val a = readLine()!!.toInt()
        println("Enter value q")
        val q = readLine()!!.toInt()
        println("Enter value n")
        val n = readLine()!!.toInt()
        val service = GeometricSum(a, q, n)
        val geos = service.geometricSum()
        println("geometric sum of a ($a) q ($q) n ($n) = $geos")
    }
    if (selectFunction == 2){
        println("Enter value a")
        val a = readLine()!!.toInt()
        println("Enter value diff")
        val q = readLine()!!.toInt()
        println("Enter value n")
        val n = readLine()!!.toInt()
        val service = GeometricSum(a, q, n)
        val aris = service.arithmeticSum()
        println("Arithmetic sum of a ($a) q ($q) n ($n) = $aris")
    }
}