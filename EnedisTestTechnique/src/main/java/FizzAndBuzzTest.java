
import org.junit.Assert;
import org.junit.Test;

public class FizzAndBuzzTest {

	@Test   
	public void testNotDevidibleByAnyOf(){     
		Assert.assertEquals("1", FizzAndBuzz.dividibleBy(1));
	    Assert.assertEquals("2", FizzAndBuzz.dividibleBy(2));    
	}
	
	@Test
	 public void testDevidibleBy15() {      
		Assert.assertEquals("fizzbuzz", FizzAndBuzz.dividibleBy(15));
	    Assert.assertEquals("fizzbuzz", FizzAndBuzz.dividibleBy(30));
	 }
	
	@Test
	public void testDevidibleBy5() {       
		Assert.assertEquals("buzz", FizzAndBuzz.dividibleBy(5));
	    Assert.assertEquals("buzz", FizzAndBuzz.dividibleBy(20));  
	 }	  
}
