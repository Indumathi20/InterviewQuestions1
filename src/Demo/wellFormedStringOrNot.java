package Demo;
import java.util.*;
public class wellFormedStringOrNot {
	public static void main(String[] args) {
//		A string is considered well-formed if the parentheses are 
//		properly nested and closed in the correct order.
		
//		Here are the criteria for a well-formed string:
//
//		1) Each opening parenthesis must have a corresponding
//		closing parenthesis of the same type.
//		2)The parentheses must be properly nested, meaning each opening parenthesis
//		must be closed by its corresponding closing parenthesis, 
//		and no two pairs of parentheses can overlap or interleave.
//		"()" and "{}" are well-formed strings.
//		"(}" and "{[}]" are not well-formed because they have mismatched closing parentheses.
		String str = "{()}]";
		Stack<Character> st = new Stack<>();
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(st.empty())
			{
				st.push(ch);
			}
			else if(ch == '{' || ch == '(' || ch == '[')
			{
				st.push(ch);
			}
			else if(ch == '}' && st.peek() == '{')
			{
				st.pop();
			}
			else if(ch == ')' && st.peek() == '(')
			{
				st.pop();
			}
			else if(ch == ']' && st.peek() == '[')
			{
				st.pop();
			}
		}
		if(st.empty())
		{
			System.out.println("it is a wellformed string");
		}
		else
		{
			System.out.println("not wellformed");
		}
		
	}

}
