package ssa;
import java.util.Stack;
public class RPNCalculator {
	
	char[] problem = new char [] {'8', '2', '/', '9', '*', '1', '-', '7', '/'};
	Stack<Integer> stk = new Stack<Integer>();
	
	public void doMath(){
		
		for(char ch:problem){
			int num = Character.getNumericValue(ch);
			if (num != -1) {
				
				System.out.print(" " + num);
				stk.push(num);
			}else{
				System.out.print(" " + ch);
				
				int val1 = stk.pop();
				int val2 = stk.pop();
				
				
				switch(ch){
				case '+':
					stk.push(val1 + val2);
					break;
					
				case '-':
					stk.push(val2 - val1);
					break;
					
				case '*':
					stk.push(val1 * val2);
					break;
					
				case '/':
					stk.push(val2 / val1);
					break;
				}
				
				
			}
				
			}
		
		int answer = stk.pop();
		System.out.println("  Answer is " + answer);
			
	}
	
	
	
	
	public static void main(String[] args) {
		RPNCalculator rpnCalculator = new RPNCalculator();
		System.out.print("Calculating ");
		rpnCalculator.doMath();
	}

}
