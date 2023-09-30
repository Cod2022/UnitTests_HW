import main.HW3Task2;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class HW3Task2Test {

    @Test
    void evaluatesTrue(){
        HW3Task2 hw3Task2 = new HW3Task2();
        assertThat(hw3Task2.numberInInterval(26)).isTrue();
    }

    @Test
    void evaluatesFalse(){
        HW3Task2 hw3Task2 = new HW3Task2();
        assertThat(hw3Task2.numberInInterval(23)).isFalse();
    }

}
