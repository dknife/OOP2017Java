
public class Ex2017_03_01_Multiplications {

	public static void main(String[] s) {
		int i=2; int j=2;
		while(i<=9) {
			System.out.print(j+++"*"+i+" ");
			if(j>9) {
				j=2;i++;
				System.out.println("");
			}			
		}
	}
}
