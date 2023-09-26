import main.HW2Task1;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class HW2Task1Test {

    @Test
    void getEvaluatesTrue() {
        HW2Task1 evenNum = new HW2Task1();
        assertThat(evenNum.evenOddNumber(4)).isTrue();
    }

    @Test
    void getEvaluatesFalse() {
        HW2Task1 oddNum = new HW2Task1();
        assertThat(oddNum.evenOddNumber(5)).isFalse();
    }
}
