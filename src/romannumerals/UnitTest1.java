package romannumerals;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class UnitTest1 {

	public class CalculatorTest {
		  @Test
		  public void evaluatesExpression() {
		    Calculation calculator = new Calculation();
		    int sum = calculator.evaluate("1+2+3");
		    assertEquals(6, sum);
		  }
		}
}