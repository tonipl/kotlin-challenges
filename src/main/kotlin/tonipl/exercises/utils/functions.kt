package tonipl.exercises.utils

fun solution(ages: List<Int>): List<Int> {
    return ages.sorted().takeLast(2)
}
