
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
    public static boolean isDivisibleBy(int a, int b){
    	int x = a%b;
    	if(x==0){
    		return true;
    	}
    	else{return false;}
    }
    
   public static double absValue(double num){
	   if(num>0){
		   return num;
	   } else{
		   return (num * -1);
	   }
   }
   public static int max(int a, int b){
	   if(a>b){ return a;
	   }
	   else {return b;}
   }
   public static double max(double a, double b, double c){
	   if (a>b){
		  if (a>c){return a;  
		  } else {return c;}
	   }
	   else {if (b>c){return b;
	   } else {return c;}
	   }   
   }
   public static int min(int a, int b){
	   if(a<b){
		   return a;
	   }
	   else{return b;
	   }
   }
   public static double round2(double num){
	   int a =(int) (num*100);
	   double x;
	   if ((a+.5)>= (num * 100)){
	   x = a/100.0;
	   return(x);
	   } else{ x=(a+1)/100.0;
	   return (x);
	   
	   }
   }
}
