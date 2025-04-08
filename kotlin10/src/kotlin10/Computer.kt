package kotlin10

open class Computer : ComputerBase {
    // Первый конструктор
    constructor(cpuName: String, cpuFrequencyMHz: Double, ramMB: Int)
            : super(cpuName, cpuFrequencyMHz, ramMB)

    // Второй конструктор — с вводом только имени CPU
    constructor(cpuName: String) : super(cpuName, 0.0, 0)

    override fun quality(): Double {
        return (0.1 * cpuFrequencyMHz) + ramMB
    }

    override fun displayInfo() {
        println("Компьютер:")
        println("Процессор: $cpuName")
        println("Частота (МГц): $cpuFrequencyMHz")
        println("ОЗУ (Мб): $ramMB")
        println("Качество (Q): ${quality()}")
    }
}
