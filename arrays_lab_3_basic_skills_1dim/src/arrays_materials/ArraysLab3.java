package arrays_materials;
import java.util.Arrays;

//Takahiro Mollenkamp 11/2/16
//This class contains 5 methods that manipulate arrays

public class ArraysLab3 
{
	public static void main(String[] args) 
	{
		int[] a1={5,10,15,20,25,30,35,40};
		int[] a2={7,14,21,28,35,42,49,56};
		int[] sumArr=sum(a1,a2);
		int appendNum=200;
		int[] appendArr=append(a1,appendNum);
		int removeIdx=5;
		int[] removeArr=remove(a2,removeIdx);
		int sumOfEvens=sumEven(appendArr);
		rotateRight(a1);
		System.out.println(Arrays.toString(sumArr));
		System.out.println(Arrays.toString(appendArr));
		System.out.println(Arrays.toString(removeArr));
		System.out.println(sumOfEvens);
		System.out.println(Arrays.toString(a1));
		
	}
	
	
	
	/*
	 * Write a method named sum that accepts two arrays of integers arr1 and arr2 
	 * and returns an array of integers, 
	 * in which every element is the sum of the elements at that index for the arrays arr1 and arr2. 
	 * You can assume arrays arr1 and arr2 have at least one element each and are the same length.
	 */
	public static int[] sum(int[] arr1, int[] arr2)
	{
		assert (arr1.length > 0);
		assert (arr2.length > 0);
		assert (arr1.length == arr2.length);
		int[] newArray = new int [arr1.length];//same length
		for (int i=0; i<newArray.length; i++){
			newArray[i]=arr1[i]+arr2[i];//add values at a specific index
		}
		return newArray;
	}
	
	/*
	 * Write a method named append that accepts an array of integers arr of length n 
	 * and an integer num, and returns an array of integers of length n+1 
	 * that consists of the elements of arr with num appended to the end.  
	 * You can assume array arr has at least one element.
	 */
	public static int[] append(int[] arr, int num)
	{
		assert (arr.length > 0);
		int[] newArray=new int [arr.length+1];
		for (int i=0;i<(newArray.length-1);i++){
			newArray[i]=arr[i];//same array up until last number
		}
		newArray[newArray.length-1]=num;//attach num at the end
		return newArray;
	}
	
	/*
	 * Write a method named remove that accepts an array of integers arr and an integer idx 
	 * and returns an array of integers consisting of all of the elements of arr 
	 * except for the element at index idx (thus, the returned array has a length of arr.length – 1).  
	 * You can assume arr has at least two elements.
	 */
	public static int[] remove(int[] arr, int idx)
	{
		assert (arr.length >= 2);
		int[] newArray=new int [arr.length-1];
		for (int i=0;i<idx;i++){
			newArray[i]=arr[i];
		}
		for (int i=idx;i<newArray.length;i++){//skip the value at idx
			newArray[i]=arr[i+1];
		}
		return newArray;
		
	}
	
	/*
	 * Write a method sumEven that accepts an array of integers arr 
	 * and returns an integer containing the sum of the elements at the even indices of arr.  
	 * (That means elements at indices 0,2,4,6,8.)  You can assume arr has at least one element.
	 */
	public static int sumEven(int[] arr)
	{
		assert (arr.length > 0);
		int sum=0;
		for(int i=0;i<arr.length;i+=2){//only values at even index
			sum+=arr[i];
		}
		return sum;
	}
	
	/*
	 * Write a method rotateRight that accepts an array of integers arr 
	 * and does not return a value.  
	 * The rotateRight method moves each element of arr one index to the right 
	 * (element 0 goes to element 1, element 1 goes to element 2, …, element n-1 goes to element 0).  
	 * You can assume arr has at least one element.
	 */
	public static void rotateRight(int[] arr)
	{
		assert (arr.length > 0);
		int lastValue=arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--){//right shift from the back
			arr[i]=arr[i-1];
		}
		arr[0]=lastValue;//the end element is moved to the beginning
	}
	
}
