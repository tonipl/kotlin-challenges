package tonipl.exercises.utils

object RemovedNumbers {
    fun solution(n: Long): Array<LongArray> {
        val result = mutableListOf<LongArray>()
        val sequence = LongArray(n.toInt()) { it.toLong() + 1 }
        val total = sequence.sum()

        sequence.forEachIndexed  { i, firstValue ->
            sequence.forEachIndexed  { j, secondValue ->
                if (i != j) {
                    val sum = total - firstValue - secondValue
                    val product = firstValue * secondValue

                    if (sum == product) {
                        val pair = longArrayOf(firstValue, secondValue)
                        result.add(pair)
                    }
                }
            }
        }
        return result.toTypedArray()
    }
}
