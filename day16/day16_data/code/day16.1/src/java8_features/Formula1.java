package java8_features;

public class Formula1 implements Formula {

	
	//overiding inherited method calculate, we can also override other methdos too
	@Override
	public double calculate(double a, double b) {
		System.out.println(getClass() +" implements method");
		Formula.show();
		
		return a+b;
	}
	@Override
	public  double squareIt(double a) {
		System.out.println("in i/f haha method "+getClass());
		return a * a;
	}

}
