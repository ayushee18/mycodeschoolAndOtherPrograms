package stack;

import java.util.Stack;

public class BalancedParantheses {
	
	public boolean arePair(String opening, String closing) {
		if(opening.equals("{") && closing.equals("}")) 
			return true;
		
		if(opening.equals("(") && closing.equals(")")) 
			return true;
		
		if(opening.equals("[") && closing.equals("]")) 
			return true;
		
		return false;
	}
	
	public boolean balancedParanthese(String str) {
		Stack<String> stack = new Stack<>(); 
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == '{' || str.charAt(i) == '(' || str.charAt(i) == '[') {
				stack.push(""+str.charAt(i));
			}
			
			if(str.charAt(i) == '}' || str.charAt(i) == ')' || str.charAt(i) == ']') {
				
				if(stack.isEmpty() || !arePair(stack.peek(), str.charAt(i)+""))
					return false;
				
				else
					stack.pop();
			}
			
		}
		
		return stack.isEmpty()? true:false;
	}
	
	public static void main(String[] args) {
		
		BalancedParantheses balancedParantheses = new BalancedParantheses();
		String str1 = "[{}{}]";
		System.out.println(balancedParantheses.balancedParanthese(str1));
		String str2 = "[{]}";
		System.out.println(balancedParantheses.balancedParanthese(str2));
		String str3 = "[[] {}(";
		System.out.println(balancedParantheses.balancedParanthese(str3));
		String str4 = "]}";
		System.out.println(balancedParantheses.balancedParanthese(str4));
		String str5 = "[{(A+B)}{(C+D)}]";
		System.out.println(balancedParantheses.balancedParanthese(str5));



	}
}
