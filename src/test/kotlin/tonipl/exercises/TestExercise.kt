import tonipl.exercises.utils.solution
import io.kotlintest.matchers.shouldBe
import org.junit.jupiter.api.Test

class TestExercise {
    @Test
    fun testSolution() {
        solution(listOf(1,5,87,45,8,8)) shouldBe listOf(45, 87)
        solution(listOf(6,5,83,5,3,18)) shouldBe listOf(18, 83)
    }
}
