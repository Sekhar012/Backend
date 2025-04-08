package arr_str;

public class arraya {

	public static void main(String[] args) {
		

		//by using literal way
		
		//Initialization
		String[]  arr= {"raj","siva","sai"};
		//print
		System.out.println("print given array :"+arr[1]);
		System.out.println("print given array :"+arr[2]);
		
		
		
		//by using new key word
		//Initialization
		String arr1[]=new String[4];   //size=4
		arr1[0]="rajesh";
		arr1[1]="sekhar";
		arr1[2]="raju"; 
		arr1[3]="rajasekhar";
		//print
		System.out.println("Given arr1 print :"+arr1[0]);
		System.out.println("Given arr1 print :"+arr1[1]);
		System.out.println("Given arr1 print :"+arr1[2]);
		System.out.println("Given arr1 print :"+arr1[3]);
		
		//enhanced for loop  or for each loop
		for (String val:arr1) {
			System.out.println("for each loop using print arr1 values:"+val);
		}
	}

}
