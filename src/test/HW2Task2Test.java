import main.HW2Task2;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class HW2Task2Test {

    @Test
    void evaluatesTrue(){
        HW2Task2 hw2Task2 = new HW2Task2();
        assertThat(hw2Task2.numberInInterval(26)).isTrue();
    }

    @Test
    void evaluatesFalse(){
        HW2Task2 hw2Task2 = new HW2Task2();
        assertThat(hw2Task2.numberInInterval(23)).isFalse();
    }

}
