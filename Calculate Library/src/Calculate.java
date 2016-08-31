
public class Calculate {
	
	public static int square(int number){
		return(number * number);
	}
	
	public static int cube(int number){
		return(number*number*number);
	}
	public static double average(double num1, double num2){
		return((num1+num2)/2);
	}
	public static double average(double num1, double num2, double num3){
		return((num1+num2+num3)/3);
	}
    public static double toDegrees(double num){
    	return(num/3.14159*180);
    }
    public static double toRadians(double num){
    	return(num*3.14159/180);
    }
    public static double discriminant(double a, double b, double c){
    	return(b*b - 4*a*c);
    }
    public static String toImproperFrac(int a, int b, int c){
    	int numerator =a*c+b;
    	String answer = (numerator + "/" + c);
    	return(answer);
    }
    public static String toMixedNum(int a, int b){
    	int coef = a/b;
    	int remainder = a % b;
    	String answer = (coef + "_" + remainder + "/" + b);
    	return(answer);
    }
    public static String foil(int a, int b, int c, int d, String n){
    	int big = a*c;
    	int med = a*d + b*c;
    	int tiny = b * d;
    	String answer = (big + n + "^2 + (" + med + n + ") + (" + tiny +")");
    	return(answer);
    }
    
    
    
}
