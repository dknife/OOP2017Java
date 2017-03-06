
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
}