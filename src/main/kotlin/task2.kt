import kotlin.system.exitProcess

//ToDoList
fun main() {
    println("Enter names using comma (,) as separator")
    val names = readln()

    val namesArray = names.split(",")

    println("Enter salaries using comma (,) as separator")
    val salaries = readln()

    val salariesArray = salaries.split(",")

    if (namesArray.size != salariesArray.size){
        println("Names list be the same as salaries list")
        exitProcess(0)
    }

    validateLength(namesArray, 10, "Name")
    validateLength(salariesArray, 6, "Salary")

    printTable(namesArray, salariesArray)
}

fun printTable(namesArray: List<String>, salariesArray: List<String>) {
    println("-".repeat(23))

    for (name in namesArray){
        val index = namesArray.indexOf(name)
        val salary = salariesArray[index]
        val f1 = (10 - name.length) / 2
        val f2 = 10 - name.length - f1
        val s1 = (6 - salary.length) / 2
        val s2 = 6 - salary.length - s1

        println("|" + " ".repeat(f1) + name + " ".repeat(f2) + "|" + " ".repeat(s1) + salary + " ".repeat(s2) + "|")
    }

    println("-".repeat(23))
}

fun validateLength(namesArray: List<String>, maxSize: Int, entity: String) {
    for (name in namesArray) {
        if (name.length > maxSize) {
            println("$entity must be up to $maxSize characters")
            exitProcess(0)
        }
    }
}
