import tonipl.exercises.utils.solution
import kotlin.test.assertEquals
import org.junit.jupiter.api.Test

class TestExercise {

    @Test
    fun testSolution() {
        assertEquals(5, solution("abracadabra"))
        assertEquals(1, solution("test"))
        assertEquals(3, solution("example"))
    }
}
