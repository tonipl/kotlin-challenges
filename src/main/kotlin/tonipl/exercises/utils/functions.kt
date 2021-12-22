package tonipl.exercises.utils

import tonipl.exercises.dto.DataDTO

fun solution(number: Int): Int {
    val three = 3
    val five = 5

    var multiplier = 1
    var threeFinished = false
    var fiveFinished = false

    val dataDTO = DataDTO(number)

    while (!threeFinished || !fiveFinished) {
        if (!sumIfNextMultiple(dataDTO, three, multiplier)) {
            threeFinished = true
        }
        if (!sumIfNextMultiple(dataDTO, five, multiplier)) {
            fiveFinished = true
        }

        multiplier++
    }

    return dataDTO.sum
}

fun sumIfNextMultiple(dataDTO: DataDTO, baseMultipleNumber: Int, multiplier: Int): Boolean {
    val nextMultiple = multiplier * baseMultipleNumber
    if (nextMultiple < dataDTO.limit) {
        if (dataDTO.list.none { it == nextMultiple }) {
            dataDTO.sum += nextMultiple
            dataDTO.list.add(nextMultiple)
        }
        return true
    }
    return false
}
