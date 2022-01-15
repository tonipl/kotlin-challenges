import tonipl.exercises.utils.solution
import kotlin.test.assertEquals
import org.junit.jupiter.api.Test

class TestExercise {

    @Test
    fun testSolution() {
        assertEquals(3, solution(1000, 2.0, 50, 1200))
        assertEquals(15, solution(1500, 5.0, 100, 5000))
        assertEquals(10, solution(1500000, 2.5, 10000, 2000000))
    }
}
