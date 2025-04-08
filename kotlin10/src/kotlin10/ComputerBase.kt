package kotlin10

abstract class ComputerBase(
    val cpuName: String,
    val cpuFrequencyMHz: Double,
    val ramMB: Int
) : InfoDisplay {
    abstract fun quality(): Double
}