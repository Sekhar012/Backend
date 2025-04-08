package arr_str;
import java.util.Arrays;

public class arr_methods {

	public static void main(String[] args) {
		
		//tostring()-->covert array to string
		int [] num= {91,9,93,98,9,89,39,92};
		System.out.println(Arrays.toString(num));
		
		//sort()
		int [] num1= {91,9,93,98,9,89,39,92};
		Arrays.sort(num1);
		System.out.println(Arrays.toString(num1));
		
		//copyof()-->copy and resize the array
		String [] raj= {"abc","bcd","cde"};
		String[] cp=Arrays.copyOf(raj, 9);   //raj->old arrayname;9->new arrsize
		System.out.println(Arrays.toString(cp));
		
		//equals()-->compare two arrays equal or not
		int [] ar1= {23,2323,98,323,123,99};
		int []ar2= {23,98,2323,323,99,123};
		int []ar3= {23,98,2323,323,99,123};
		System.out.println("both are same or not :"+Arrays.equals(ar1, ar2));
		System.out.println("both are same or not :"+Arrays.equals(ar2, ar3));

		//fill()-->filling specific method
//		int[] values=new int[5];
//		Arrays.fill(values, 32,23,32,23,3,3,98);

		
//		int[] arr = {1, 2, 3};       //  clone() – Creates a copy of the array
//		int[] copy = arr.clone();     // copy the varaiable
//		System.out.println(arr[2]);   //index value
//		System.out.println(copy[2]);
//	
//		
//		int[] arr1 = {10, 50,20, 30, 40};
//		int index = Arrays.binarySearch(arr1, 20);
//		System.out.println(index); // Output: 2
	}

}
