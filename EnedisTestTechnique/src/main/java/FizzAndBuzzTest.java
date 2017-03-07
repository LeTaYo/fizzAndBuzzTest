import org.junit.Assert;
import org.junit.Test;

public class FizzAndBuzzTest {

	@Test   
	public void testNotDevidibleByAnyOf(){     
		Assert.assertEquals("1", FizzAndBuzz.dividibleBy(1));
	    Assert.assertEquals("2", FizzAndBuzz.dividibleBy(2));
	    
	}

	   

}
