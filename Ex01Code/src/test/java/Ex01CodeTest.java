import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class Ex01CodeTest {
        @Test
        public void test() {
            //given
            Ex01Code c1 = new Ex01Code();

            //when
            int result = c1.Calculator(5, 3, 1);

            //then
            assert result == 1;
        }

        @Test
        public void test1(){
            //given
            Ex01Code c2 = new Ex01Code();

            //when
            int result2 = c2.Calculator(5, 3, 1);

            //then
            assertEquals(result2,1) ;
        }

        @Test
    public void test3(){
            //given
            Ex01Code c3 = new Ex01Code();

            //when
            Boolean result3 = c3.estePar(10);

            //then
            assertTrue(true);

        }


    }

