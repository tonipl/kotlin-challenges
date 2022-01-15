package tonipl.exercises.utils

fun solution(ages: List<Int>): List<Int> {
    var twoOldestNumbers = mutableListOf(0, 0)

    for (age in ages) {
        for ((index, oldestNumber) in twoOldestNumbers.withIndex()) {
            if (age > oldestNumber) {
                twoOldestNumbers = twoOldestNumbers.sorted() as MutableList<Int>
                twoOldestNumbers[index] = age
            }
        }
    }
    return twoOldestNumbers.sorted()
}
