import tonipl.exercises.utils.ASum
import kotlin.test.assertEquals
import org.junit.jupiter.api.Test

class TestExercise {
    @Test
    fun testSolution() {
        assertEquals(-1, ASum.solution(56396345062501))
        assertEquals(2225, ASum.solution(6132680780625))
        assertEquals(-1, ASum.solution(28080884739601))
    }
}
