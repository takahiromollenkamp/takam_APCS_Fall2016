import java.util.Arrays;
//Takahiro Mollenkamp 10/27/16
//the program has methods that use string.split

public class Split 
{

	public static void main(String[] args) 
	{   System.out.println("String split example code");
		exampleCode();
		System.out.println("Part 1 tester code");
		System.out.println(breadSplit("apple"));
		System.out.println(breadSplit("applebread"));
		System.out.println(breadSplit("breadapplebread"));
		System.out.println(breadSplit("breadbread"));
		System.out.println(breadSplit("breadbreadbanana"));
		System.out.println(breadSplit("breadbananabreadapple"));
		System.out.println(breadSplit("beefbreadberriesbread"));
		System.out.println(breadSplit("beefbreadliontigerbreadgiraffe"));
		System.out.println(breadSplit("applebreadberriesplumbreadknifeorangecheesebreadlettusbread"));
		
		System.out.println("Part 2 tester code");
		System.out.println(breadSplit2("bread  apple  lettus bread"));
	    System.out.println(breadSplit2("cheese bread pine      apple bread"));
	    System.out.println(breadSplit2("bread   cheeese"));
	    System.out.println(breadSplit2("gorilla bread beef chicken bread   turkey ham pork bread steak hamburger bread cheese tomato bread juice"));
		
		
	}
	public static String breadSplit2(String original){//part 2 code, similar to part 1 but it also trims out spaces

		String[] array=original.split(" ");//trim out spaces
		String trimmed="";
		for(int i=0;i<array.length;i++){
			trimmed+=array[i];
		}
		String answer =breadSplit(trimmed);
		return answer;
	}
	public static String breadSplit(String original){//part 1 code splits the original string by bread and returns the inside
		if(original.indexOf("bread")!=-1){
			original=original.substring(original.indexOf("bread"));
		}
		int breadCount=0;
		String copy=original;//use to find if there are at least 2 breads
		while(copy.indexOf("bread")!=-1){
			int y=copy.indexOf("bread");
			copy=copy.substring(y+4);
			breadCount++;
		}
		String[] array =original.split("bread");
		String answer="";
		String copy2=original;//use for empty sandwich
		copy2=copy2.replace("bread", "");
		if (breadCount>=2){
			if(copy2.equals("")){
				answer="nothing inside";
			}

			else{
				for(int i=1; i<array.length;i++){//come back to last array element later
					answer+=array[i-1];//skip first element
				}	
				if(original.endsWith("bread")){//check if the original string ends with bread
					answer+=array[array.length-1];
				}
			}
		}
		else{
			answer="not enough pieces of bread. need 2 for sandwich";
		}
		if(answer.equals("")){
			answer="nothing inside";
		}
		return answer;
	}
	public static void exampleCode(){//play around with string.split
		String[] array="I like apples!".split(" ");
		System.out.println(Arrays.toString(array));
		String[] array2="I really like really red apples like apples".split("really");
		System.out.println(Arrays.toString(array2));		
	}
}

