package tonipl.exercises.utils

object ASum {
    fun solution(m: Long): Long {
        var numberOfCubes: Long = 0
        var sumOfVolumes: Long = 0

        while (sumOfVolumes < m) {
            sumOfVolumes += numberOfCubes * numberOfCubes * numberOfCubes
            numberOfCubes++
        }

        return if (sumOfVolumes == m) numberOfCubes - 1 else -1
    }
}
