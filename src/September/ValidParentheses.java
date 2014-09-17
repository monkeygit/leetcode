package September;

import java.util.Stack;

public class ValidParentheses {
	
	public boolean isValid(String s){
		Stack<Character> stack = new Stack<Character>();
		int i = 0;
		while( i < s.length()){
			if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
				stack.push(s.charAt(i));
			else if(s.charAt(i) == ')' && !stack.isEmpty() && stack.peek() == '(' 
					|| s.charAt(i) == ']' && !stack.isEmpty() && stack.peek() == '['
					|| s.charAt(i) == '}' && !stack.isEmpty() && stack.peek() == '{')
					stack.pop();
			else return false;
			i++;
		}
		
		return stack.isEmpty();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidParentheses test = new ValidParentheses();
		System.out.println(test.isValid("((({{[]}}({[]}))))"));
	}

}
