import main.HW3Task1;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class HW3Task1Test {

    @Test
    void getEvaluatesTrue() {
        HW3Task1 evenNum = new HW3Task1();
        assertThat(evenNum.evenOddNumber(4)).isTrue();
    }

    @Test
    void getEvaluatesFalse() {
        HW3Task1 oddNum = new HW3Task1();
        assertThat(oddNum.evenOddNumber(5)).isFalse();
    }
}
