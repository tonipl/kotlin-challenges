package tonipl.exercises.utils


object RemovedNumbers {
    fun solution(n: Long): Array<LongArray> {
        val result = mutableListOf<LongArray>()
        val sequence = LongArray(n.toInt()) { it.toLong() + 1 }
        val sumTotal = sequence.sum()

        sequence.forEach { value ->
            val y = (sumTotal - value) / (value + 1)
            if (y <= n && value * y == sumTotal - value - y) {
                result.add(longArrayOf(value, y))
            }
        }
        return result.toTypedArray()
    }
}
