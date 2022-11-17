import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMaximum {
    // UC1- testing maximum value of 3 Integers
    @Test
    public void maximumNumberInteger() {
        FindMaximum maxNum = new FindMaximum();
        Integer maxNumInteger = maxNum.maxInteger(20, 50, 80);
        Assert.assertEquals(80, maxNumInteger.intValue());
    }

    // UC2- testing maximum value of 3 floats
    @Test
    public void maximumNumberFloat() {
        FindMaximum maxNumber = new FindMaximum();
        Float maxNumFloat = maxNumber.maxFloat(20.20f, 50.50f, 80.80f);
        Assert.assertEquals(80.00f, maxNumFloat.intValue());
    }

    // UC3- testing maximum value of 3 Strings
    @Test
    public void maximumString() {
        FindMaximum max = new FindMaximum();
        String maxNumString = max.maxString("Apple", "Peach", "Banana");
        Assert.assertEquals("Peach", maxNumString);
    }
}



