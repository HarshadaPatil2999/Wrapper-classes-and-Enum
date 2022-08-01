package assignment;

public enum Colors {
	
	BLUE,RED,PINK,GREEN,YELLOW,PURPULE;
	
	int d=2379;
	int price=20;
	public void price()
	{
		System.out.println("price:"+price);
	}
	
	public static void main(String[] args) {
		
		Colors c=Colors.BLUE;
		c.price();    //for display concrete method or variable call by with reference only.
		System.out.println(c.d);
		Colors c1=Colors.PINK;
		c1.price();
		System.out.println(c1.d);
		
//		System.out.println(Colors.price());
//		System.out.println(Colors.d);           //not allowed 
		
		
		
	}

}
