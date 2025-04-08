package kotlin10

fun main() {
    val c1 = Computer("Intel Core i5", 3000.0, 8192)
    val c2 = Computer("AMD Ryzen 3", 3500.0, 4096)
    val c3 = Computer("Intel Core i3") // второй конструктор

    val ac1 = AdvancedComputer("Intel Core i7", 3600.0, 16384, 512)
    val ac2 = AdvancedComputer("AMD Ryzen 5", 3700.0, 8192, 256)
    val ac3 = AdvancedComputer("Intel Xeon", 2800.0, 12288, 1024)

    val tester = ComputerTester()

    println("== Базовые компьютеры ==")
    tester.testDisplay(c1)
    println()
    tester.testDisplay(c2)
    println()
    tester.testDisplay(c3)
    println()

    println("== Продвинутые компьютеры ==")
    tester.testDisplay(ac1)
    println()
    tester.testDisplay(ac2)
    println()
    tester.testDisplay(ac3)
}
