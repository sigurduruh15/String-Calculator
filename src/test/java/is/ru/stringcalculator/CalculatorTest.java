package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testEmptyString() {
		assertEquals(0, Calculator.add(""));
	}
	@Test
	public void testOneNumber(){
		assertEquals(1, Calculator.add("1"));
	}
	@Test
	public void testTwoNumbers(){
		assertEquals(3, Calculator.add("1,2"));
	}
	@Test
	public void testManyNumbers(){
		assertEquals(6, Calculator.add("1,2,3"));
	}
	@Test
	public void testNewLine(){
		assertEquals(6, Calculator.add("1\n2,3"));
	}
	@Test
	public void negativeNumber(){
		RuntimeException ex = null;
		try {
		assertEquals(2, Calculator.add("-1,2"));
		} catch(RuntimeException e) {
			ex = e; 
			System.out.println(ex);}
	}
	@Test
	public void negativeNumber2(){
		RuntimeException ex = null;
		try {
			assertEquals(1, Calculator.add("2,-4,3,-5"));
		} catch(RuntimeException e) {
			ex = e; 
			System.out.println(ex);}
	}
	@Test
	public void testNumberOverTh(){
		assertEquals(2, Calculator.add("1001,2"));
	}
	@Test
	public void testDeli(){
		assertEquals(3, Calculator.add("//;\n1,2"));
	}
}