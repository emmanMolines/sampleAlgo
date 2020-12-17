import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

/***
 * 
 * @author Molines, Emmanuel D.
 * @author Garcia, Joshua D.
 * @version 1.0
 *
 */

public class CoverageTest {


	Calculator calculator = new Calculator();
	RelQuantifier relquantifier = new RelQuantifier();
    @Test
    public void addTest() {
        assertNotSame(5,calculator.addition(10,2));
    }
    
    @Test
    public void subtractTest() {
        assertNotSame(5,calculator.subtract(10,2));
    }
    @Test
    public void greaterThanTest() {
    	 assertNotSame(false,relquantifier.greaterThanOrEqualTo(5, 1));
    }
    
    @Test
    public void lesserThanTest() {
    	 assertNotSame(true,relquantifier.lesserThan(5, 1));
    }

}



