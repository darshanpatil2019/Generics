import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMaximum {
        @Test
        public void maximumNumberInteger() {
            FindMaximum maxNum = new FindMaximum();
            Integer maxNumInteger = maxNum.maxInteger(20,50,80);
            Assert.assertEquals(80,maxNumInteger.intValue());
        }
    }

