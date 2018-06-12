package stack;

import java.util.Stack;

public class ReverseStringStack {
	
	public String reverseString(String str) {
		Stack<String> stack = new Stack<String>();
		int length = str.length();
		for(int i=0;i<length;i++) {
			stack.push(""+str.charAt(i));
		}
		str = "";
		while(!stack.isEmpty()) {
			str = str+stack.pop();
		}
		return str;
	}
	
	public String halfLoop(String str) {
		char charArray[]  = str.toCharArray();
		int length = charArray.length;
		for(int i=0;i<length/2;i++) {
			char temp = charArray[i];
			charArray[i] = charArray[length-1-i];
			charArray[length-1-i] = temp;
		}
		str = charArray.toString();
		return str;
	}

	public static void main(String[] args) {
		String str = "Hello";
		ReverseStringStack reverseStringStack = new ReverseStringStack();
		System.out.println(reverseStringStack.reverseString(str));
		System.out.println(reverseStringStack.halfLoop(str));
	}
	
}
