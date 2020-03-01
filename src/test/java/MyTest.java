import multiply.BigIntegerMultiplier;
import multiply.BigNumberMultiplier;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.*;

public class MyTest {
    String num1 = "20409034209492049020349";
    String num2 = "51651654949898949849898949494998";
    String result = "1054160392849366994797265430386764115082239994175714302";

    @Test
    public void assertResults(){
        assertEquals(BigNumberMultiplier.multiply(num1, num2), BigIntegerMultiplier.multiply(num1, num2));
    }

    @Test
    public void multiplyBigIntegers(){
        assertEquals(BigIntegerMultiplier.multiply(num1, num2), new BigInteger(result));
    }

    @Test
    public void multiplyBigNumbers(){
        assertEquals(BigNumberMultiplier.multiply(num1, num2), new BigInteger(result));
    }
}
