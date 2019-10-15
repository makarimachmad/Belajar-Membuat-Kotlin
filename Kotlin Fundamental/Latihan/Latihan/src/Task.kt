fun main() {
    val valueA = 65
    val valueB = 52
    val valueC = 78

    val result = calculate(valueA, valueB, valueC)
    val resultB = calculate(valueA, valueB, null)


    println("ResultA is "+"$result" + "\n" + "ResultB is "+"$resultB")

}

fun calculate(valueA: Int, valueB: Int, valueC: Int?): String {
    // TODO 1
    val valc = valueC ?: 100
    val result = valueA + (valueB - valc)
    return generateResult(result)
}

// TODO 2
fun generateResult(result: Int) :String= "$result"