package tonipl.exercises.utils

fun solution(str: String): Int {
    return str.count { it in "aeiou" }
}
