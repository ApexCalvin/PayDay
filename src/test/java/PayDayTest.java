import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;
//import static org.junit.jupiter.api.Assertions;

public class PayDayTest {

    @Test
    public void testPay()
    {
        //create obj your going to test, pay day obj in this example
        PayDay paydaytestThing = new PayDay();

        //call pay on the payday object, put the input parameters, output will be a string
        // take result, put into a local string
        java.lang.String codeOutput = paydaytestThing.pay("Kris", 21.5, 10.0, 0.05);

        //assertequal with the string you're looking for vs the string you got from your code
        assertEquals("Kris 215.00 10.75 204.25", codeOutput);
        //assertTrue(codeOutput.equals("Kris 215.00 10.75 204.25"));

    }
}