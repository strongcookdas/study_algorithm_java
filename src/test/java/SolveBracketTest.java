import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import algorithm.Like_lion.week3.algorithm_1021.stack.SolveBracket;

import static org.junit.jupiter.api.Assertions.*;

class SolveBracketTest {

    @Test
    @DisplayName("괄호가 잘 풀리는지")
    void bracket(){
        SolveBracket sb = new SolveBracket();
        assertTrue(sb.solution("()()"));
        assertTrue(sb.solution("((()))()"));
        assertFalse(sb.solution(")()("));

    }
}