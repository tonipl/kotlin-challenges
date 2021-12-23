package tonipl.exercises.utils

fun solution(str: String): Int {
    val listOfVowels = listOf("a", "e", "i", "o", "u")

    // String is converted to a String array so that it can be compared to each String vowel:
    val strArray: Array<String> = str.toCharArray().map { it.toString() }.toTypedArray()

    var count = 0
    for (vowel in listOfVowels) {
        for (character in strArray)
            if (character == vowel) {
                count++
            }
    }
    return count
}
