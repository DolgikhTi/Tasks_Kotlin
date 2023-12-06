//console calculator
fun main() {
    println("Hello! It`s calculator!")

    while (true) {
        println("Enter a number")

        val first = readln().toDoubleOrNull()

        println("Enter one more number")

        val second = readln().toDoubleOrNull()

        println("Enter an operator (+, -, *, /")

        val operator = readLine()

        if (first == null || second == null || operator.isNullOrEmpty()){
            println("Enter valid data")
        }else {
            val result = calculate(first, second, operator)

            println("Result is $result")
        }
    }
}

fun calculate(fir: Double, sec: Double, op: String): Double {
    var res = 0.0

    when(op) {
        "+" -> res = fir + sec
        "-" -> res = fir - sec
        "*" -> res = fir * sec
        "/" -> res = fir / sec
    }
    return res
}