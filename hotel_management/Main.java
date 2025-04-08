package hotel_management;

public class Main {
	public static void main(String[] args) {
		
		DeluxRoom dr=new DeluxRoom("deluxe-12",10,150.50,35.25);
		dr.roominfo();
		
		StandardRoom sr=new StandardRoom("standard-20", 20, 2000.50, true);
		sr.roominfo();
		
		Customer cu=new Customer("150","rajesh","8282",dr);
		cu.rentroom();
		cu.show();
	}

}
