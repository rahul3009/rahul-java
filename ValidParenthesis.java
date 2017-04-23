package com.niit.database;

import java.util.*;
public class ValidParenthesis{
public static boolean isValid(String s) {
	Stack<Character> stack = new Stack<Character>();
	for (char c : s.toCharArray()) {
		if (c == '(')
			stack.push(')');
		else if (c == '{')
			stack.push('}');
		else if (c == '[')
			stack.push(']');
		else if (stack.isEmpty() || stack.pop() != c)
			return false;
	}
	return true;
}
	

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String st=s.next();
		System.out.println(isValid(st));

		s.close();
	}

}
