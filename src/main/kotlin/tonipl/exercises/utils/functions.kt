package tonipl.exercises.utils

fun solution(h: Double, bounce: Double, window: Double):Int {
    if (compareValues(h, 0.0) <= 0
        || (compareValues(bounce, 0.0) <= 0 || compareValues(bounce, 1.0) >= 0)
        || compareValues(window, h) >= 0.0) {

        return -1
    }

    var times = 1
    var ballHeightWithBonces = h * bounce

    while (window < ballHeightWithBonces) {
        times += 2

        ballHeightWithBonces *= bounce
    }

    return times
}
