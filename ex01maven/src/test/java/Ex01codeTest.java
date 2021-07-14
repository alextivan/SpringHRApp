
//import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class Ex01codeTest {
    @Test
    public void test(){
        //given
        Ex01code  c1 = new Ex01code();

        //when
        int result = c1.Calculator(5, 3, 1);

        //then
        assert result == 1;
    }


}
