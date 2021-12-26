fun main() {
    val angka: Array<Int> = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    print("Data array = ")
    println(angka.toList())

    println("\nlooping lewat genap dimulai dari 6")
    var total = 0
    for (i in angka) {
        if (i >= 1 && i % 2 == 0) {
            println(i)
            total++
        }
    }

    for (num in angka) {
        total = total + num
    }
    println("\nJumlah nilai didalam array = " + total)
}