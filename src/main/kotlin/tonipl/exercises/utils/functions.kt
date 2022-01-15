package tonipl.exercises.utils

fun solution(pp0: Int, percent: Double, aug: Int, p: Int): Int {
    return generateSequence(pp0){ it + (percent/100.0 * it).toInt() + aug}.indexOfFirst { it >= p }
}
