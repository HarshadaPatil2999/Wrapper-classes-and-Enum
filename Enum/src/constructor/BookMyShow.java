package constructor;

public enum BookMyShow implements A{
	//SILVER(150),GOLD(200),PLATINUM(250);
	
	SILVER(150)
	{
		public void discription()
		{
			System.out.println("rate of silver tickes is:"+150);
		}
		
	},
	
	GOLD(200)
	{
		public void discription()
		{
			System.out.println("rate of gold tickes is:"+200);
		}
		
	},
	PLATINUM(250)
	{
		public void discription()
		{
			System.out.println("rate of platinum tickes is:"+250);
		}
		
	};
	
	
	
	int rate;
	private BookMyShow(int rate)
	{
		this.rate=rate;
	}
	
//	public void discription()
//	{
//		System.out.println("rate of tickes is:"+rate);
//	}
	

}
