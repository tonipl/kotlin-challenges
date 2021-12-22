package tonipl.exercises.utils

import tonipl.exercises.dto.DataDTO

fun solution(number: Int): Int {
    // Other solution:
    //return ((0 until number step 3) + (0 until number step 5)).distinct().sum()

    return (1 until number).filter { it % 3 == 0 || it % 5 == 0 }.sum()
}
