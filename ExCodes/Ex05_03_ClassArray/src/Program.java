
public class Program {
	
	public static void main(String[] arg) {
		Exp[] expArr = new Exp[10];
		int i=0;
		for(Exp e : expArr) {
			e = new Exp();
			i++;
			e.base = expArr.length-i;
			e.exp = i;
			System.out.println(e.base + "^" + e.exp + "=" + e.getValue());
		}
	}
}
