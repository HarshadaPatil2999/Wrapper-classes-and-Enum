package assignment;

public enum CreateInstantVariable {
	
	
	APPLE(60),MANGO(70),BANANA(20),GREAPES(40);
	
	public String toString()
	{
		return price+" Rs perkg";
	}
	int price;
	private  CreateInstantVariable(int price)
	{
		this.price=price;
	}

	public static void main(String[] args) {
		
		System.out.println(CreateInstantVariable.APPLE);
		System.out.println(CreateInstantVariable.BANANA);
		
	}
}
