package model;

public class CalculatorStandardModel implements CalculatorStandardModelInterface {

	@Override
	public double addition(double summand1, double summand2) {

		double result;	
		result = summand1 + summand2;
			
		return result;
	}

	@Override
	public double subtration(double minus1, double minus2) {
		
		double result;
		result = minus1 - minus2;

		return result;
	}

	@Override
	public double division(double disor, double dividend) {

		double result;
		result = dividend / disor; 
		
		return result;
	}

	@Override
	public double multiplikatio(double multi1, double multi2) {

		double result = multi1 * multi2;
		
		return result;
	}

	@Override
	public double OneByX(double x) {

		double result;
		result = 1 / x;
		
		return result;
	}

	@Override
	public double quadratwurzel(double x) {

		double result;	
		result = Math.sqrt(x);
		
		return result;
	}

	@Override
	public double quadrat(double x) {

		double result = Math.pow(x, 2);	
		
		return result;
	}
}