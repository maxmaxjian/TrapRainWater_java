import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(Parameterized::class)
class SolutionTest(
    private val expected: Int,
    private val input: IntArray
) {
    private val soln = Solution1()

    companion object {
        @Parameterized.Parameters
        @JvmStatic
        fun param() = arrayOf(
                arrayOf(6, intArrayOf(0,1,0,2,1,0,1,3,2,1,2,1))
        )
    }

    @Test
    fun test() {
        assertEquals(expected, soln.trap(input))
    }
}