package cz.zomer.calculator

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource


internal class GeometricSumKtTest {

    @Test
    fun arithmeticSum() {
        val service1 = GeometricSum(1,2,3)
        val service2 = GeometricSum(1,2,3)

        assertThat(service1.arithmeticSum()).isEqualTo(service2.arithmeticSum())
    }
    @ParameterizedTest()
    @CsvSource(
        "1, 3, 2, 4",
        "2, 1, 4, 15"
    )
    fun arithmetic(first: Int, second: Int, third: Int, result: Int){
        val asum = GeometricSum(first, second, third)
        assertThat(asum.arithmeticSum()).isEqualTo(result)
    }
    @ParameterizedTest()
    @CsvSource(
        "1, 1, 1, 1",
        "1, 2, 2, 3",
        "2, 3, 4, 80"
    )
    fun geometric(first: Int, second: Int, third: Int, result: Int){
        val gsum = GeometricSum(first, second, third)
        assertThat(gsum.geometricSum()).isEqualTo(result)
    }

}