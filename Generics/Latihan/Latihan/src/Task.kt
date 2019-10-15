// Coming Soon
fun main() {
    val stringResult = getResult("Kotlinawaddw")
    val intResult = getResult(100)

    // TODO 2

    //stringresult
    println(stringResult)

    //intresult
    println(intResult)
}

// TODO 1
fun <T> getResult(args: T): Int {

    return when(args){
        is Int -> args * 5
        is String -> args.length

        else -> return 0
    }
}