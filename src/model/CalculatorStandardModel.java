package model;

public class CalculatorStandardModel implements CalculatorStandardModelInterface {

	@Override
	public double add(double summand1, double summand2) {

		double result;	
		result = summand1 + summand2;
			
		return result;
	}

	@Override
	public double subtract(double minus1, double minus2) {
		
		double result;
		result = minus1 - minus2;

		return result;
	}

	@Override
	public double divide(double disor, double dividend) {

		double result;
		result = dividend / disor; 
		
		return result;
	}

	@Override
	public double multiply(double multi1, double multi2) {

		double result = multi1 * multi2;
		
		return result;
	}

	@Override
	public double oneDivideBy(double x) {

		double result;
		result = 1 / x;
		
		return result;
	}

	@Override
	public double squareRoot(double x) {

		double result;	
		result = Math.sqrt(x);
		
		return result;
	}

	@Override
	public double potencySquare(double x) {

		double result = Math.pow(x, 2);	
		
		return result;
	}
}