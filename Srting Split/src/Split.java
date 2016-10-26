import java.util.Arrays;

public class Split 
{

	public static void main(String[] args) 
	{
		//String.split();
		//It's a method that acts on a string, <StringName>.split(<String sp>);
		//Where sp is the string where the string splits
		//And it returns an array
		// Example: "I like apples!".split(" "); 
		//		it will split at spaces and return an array of ["I","like","apples!"]
		// Example 2: "I really like really red apples"split("really")
		//		it will split at the word "really" and return an array of ["I "," like "," apples!"]
		
		//play around with String.split! what happens if you "I reallyreally like apples".split("really") ?
		
		
		//Your task:
		/*Write a method that take in a string like "applespineapplesbreadlettustomatobaconmayohambreadcheese" describing a sandwich
		 * use String.split to split up the sandwich by the word "bread" and return what's in the middle of the sandwich and ignores what's on the outside
		 * What if it's a fancy sandwich with multiple pieces of bread?
		*/
		
		
		//Your task pt 2:
		/*Write a method that take in a string like "apples pineapples bread lettus tomato bacon mayo ham bread cheese" describing a sandwich
		 * use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of the sandwich and ignores what's on the outside
		 * Again, what if it's a fancy sandwich with multiple pieces of bread?
		*/
		String a=breadSplit("abreadbread");
		System.out.println(a);
		
		}
	public static String breadSplit2(String original){//part 2 code
		
		String[] array=original.split(" ");//trim out spaces
		String trimmed="";
		for(int i=0;i<array.length;i++){
			trimmed+=array[i];
		}
		String answer =breadSplit(trimmed);
		return answer;
	}
	public static String breadSplit(String original){//part 1 code
		original=original.substring(original.indexOf("bread"));
		String answer="";
		int breadCount=0;
		String copy=original;//use to find if there are at least 2 breads
		while(copy.indexOf("bread")!=-1){
			int y=copy.indexOf("bread");
			copy=copy.substring(y+4);
			breadCount++;
		}
		String[] array =original.split("bread");
		String copy2=original;//use for empty sandwich
		copy2=copy2.replace("bread", "");
		if (breadCount>=2){
			if(copy2.equals("")){
				answer="nothing inside";
			}
		
			else{
				for(int i=1; i<array.length;i++){//ignore the first and last array so two less
					answer+=array[i-1];//skip first element
				}	
				if(original.endsWith("bread")){
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

