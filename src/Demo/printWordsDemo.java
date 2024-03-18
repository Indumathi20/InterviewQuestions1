package Demo;
import java.util.*;
public class printWordsDemo {
	public static void main(String[] args) {
		//to print the no of words,vowels,characters and uppercase in string
		String str = "Learn With Krishna Sandeep.";
		printWordsDemo p = new printWordsDemo();
		p.getWordVowelCount(str);
		p.frequency(str);
	}

	private void frequency(String str) {
		int wordcount = 0,vowels = 0,uppercase = 0;
		for(int i=0;i<str.length();i++)
		{
			char c = str.charAt(i);
			switch(c)
			{
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				vowels++;
			}
			switch(c)
			{
			case ' ':
			case '.':
			
				wordcount++;
			}
			if(c >= 65 && c<=90)
			{
				uppercase++;
			}
		}
		System.out.println("word count is "+wordcount);
		System.out.println("vowels count is "+vowels);
		System.out.println("uppercase count is "+uppercase);
		
	}

	private void getWordVowelCount(String str) {
		TreeMap<Character,Integer> map = new TreeMap<>();
		for(int i=0;i<str.length();i++)
		{
			Integer c = map.get(str.charAt(i));
			if(map.get(str.charAt(i)) == null)
			{
				map.put(str.charAt(i), 1);
			}else
			{
				map.put(str.charAt(i), ++c);
			}
		}
		for(Map.Entry<Character,Integer> entry: map.entrySet())
		{
			System.out.print("character = "+entry.getKey()+ " ");
			System.out.print("frequency = "+entry.getValue());
			System.out.println();
		}
		
	}

}
