import tonipl.exercises.utils.solution
import kotlin.test.assertEquals
import org.junit.jupiter.api.Test

class TestExercise {

    @Test
    fun test1() {
        assertEquals(3, solution(3.0, 0.66, 1.5))
    }

    @Test
    fun test2() {
        assertEquals(15, solution(30.0, 0.66, 1.5))
    }

    @Test
    fun test3() {
        assertEquals(-1, solution(3.0, 1.0, 1.5))
    }

    @Test
    fun test4() {
        assertEquals(-1, solution(3.0, 3.0, 1.5))
    }

    @Test
    fun test5() {
        assertEquals(-1, solution(3.0, -1.0, 1.5))
    }

    @Test
    fun test6() {
        assertEquals(-1, solution(3.0, 0.0, 1.5))
    }

    @Test
    fun test7() {
        assertEquals(-1, solution(0.0, 0.66, 1.5))
    }

    @Test
    fun test8() {
        assertEquals(-1, solution(-0.1, 0.66, 1.5))
    }

    @Test
    fun test9() {
        assertEquals(-1, solution(3.0, 0.66, 3.5))
    }

    @Test
    fun test10() {
        assertEquals(-1, solution(3.0, 0.66, 3.0))
    }

    @Test
    fun test11() {
        assertEquals(1, solution(3.0, 0.66, 2.0))
    }
}
