package kotlin10

class AdvancedComputer(
    cpuName: String,
    cpuFrequencyMHz: Double,
    ramMB: Int,
    private val hddGB: Int
) : Computer(cpuName, cpuFrequencyMHz, ramMB) {

    override fun quality(): Double {
        return super.quality() + 0.5 * hddGB
    }

    override fun displayInfo() {
        println("Продвинутый компьютер:")
        println("Процессор: $cpuName")
        println("Частота (МГц): $cpuFrequencyMHz")
        println("ОЗУ (Мб): $ramMB")
        println("HDD (Гб): $hddGB")
        println("Качество (Qp): ${quality()}")
    }
}