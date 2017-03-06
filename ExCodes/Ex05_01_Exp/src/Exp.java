

public class Exp {
	double base;
	int exp;
	
	double power(double b, int e) {
		if(e==1) return b;
		if(e<1) return 1.0;		
		else {
			double t = power(b,e/2);
			return t*t*((e%2==0)?1:b);
		}
	}
	
	double getValue() {
		return power(base,exp);
	}
	
	public static void main(String[] arg) {
		Exp exp1 = new Exp();
		exp1.base = 1.0000000000001;
		exp1.exp = 1000000000;
		
		System.out.println("value = " + exp1.getValue());
	}
}
