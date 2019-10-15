fun main() {
    var i=5

    factorial(i)
}

fun factorial(n: Int): Int {
    return if (n == 1) {
        n
    } else {
        var result = 1
        for (i in 1..n) {
            result *= i
        }
        result
    }
}