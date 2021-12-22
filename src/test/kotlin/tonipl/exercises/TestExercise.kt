import tonipl.exercises.utils.solution
import kotlin.test.assertEquals
import org.junit.jupiter.api.Test

class TestExercise {

    @Test
    fun testSolution() {
        assertEquals(23, solution(10))
        assertEquals(78, solution(20))
        assertEquals(9168, solution(200))
        assertEquals(0, solution(-1))
        assertEquals(0, solution(0))
        assertEquals(0, solution(1))
        assertEquals(0, solution(3))
        assertEquals(3, solution(4))
    }
}
