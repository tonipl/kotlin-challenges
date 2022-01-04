package tonipl.exercises.utils

fun solution(h: Double, bounce: Double, window: Double):Int {
    if (h <= 0 || bounce <= 0 || bounce >= 1 || window >= h) {
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
