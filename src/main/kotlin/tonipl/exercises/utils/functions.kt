package tonipl.exercises.utils

fun solution(pp0: Int, percent: Double, aug: Int, p: Int): Int {
    val newPercent = percent/100
    var newPopulation = pp0

    newPopulation = (newPopulation + newPopulation * newPercent + aug).toInt()

    var count = 1
    if (newPopulation < p) {
        while (newPopulation < p) {
            count++
            newPopulation = (newPopulation + newPopulation * newPercent + aug).toInt()
        }
    }
    return count
}
