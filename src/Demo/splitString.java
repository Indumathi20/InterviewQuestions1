package Demo;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
public class splitString {
	public static void main(String[] args) {
//		1) string class split method 
//		2) pattern.compiler(regex.splitAsStream(String);
//		regex- regular expression
//		3) String tokenizer
//		4) StringUtils.split(String,"expression")
//		5) Splitter.on("expression").split("1234");
		String s = "0144-8374678438";
		String s1[] = s.split("-"); //string split method
		System.out.println(Arrays.toString(s1));
		System.out.println("------------------------");
		//2nd method
		List<String> str = Pattern.compile("-").splitAsStream(s).collect(Collectors.toList());
		for(String st : str)
		{
			System.out.println(st);
		}
		System.out.println("------------------------");
		//3rd method
		StringTokenizer strings = new StringTokenizer(s,"-");
		while(strings.hasMoreTokens())
		{
			String sii = strings.nextToken();
			System.out.println(sii);
		}
		
		
		
		
	}
 
}
