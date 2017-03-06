
public class Arguments {
	
	public static void main(String[] args) {
		if(args.length < 3) return;
		
		double operand1=0, operand2=0;
		try{
			operand1 = Double.parseDouble(args[0]);
			operand2 = Double.parseDouble(args[2]);
			if(args[1].equals("+")) System.out.println(operand1+operand2);
			if(args[1].equals("x")) System.out.println(operand1*operand2);
			if(args[1].equals("/")) System.out.println(operand1/operand2);
			if(args[1].equals("-")) System.out.println(operand1-operand2);
		}
		catch (NumberFormatException e) {
			System.out.println("잘못된 인자를 입력했습니다");
		}
	
	}

}