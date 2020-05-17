package cz.zomer.calculator

class GeometricSum(val a: Int, val q: Int, val n: Int) {

    fun geometricSum(): Int {
        var sum: Int
        sum = 0

            var x = a
            var y = q
            var z = n

        while (z > 0) {
            sum += x
            x *= y
            z--
        }
        return sum
    }

    fun arithmeticSum(): Int {
        var sum: Int
        sum = 0
        var x = a
        var y = q
        var z = n

        while (z > 0) {
            sum = sum + x
            x = x + y
            z--
        }
        return sum
    }


}