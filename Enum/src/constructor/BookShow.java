package constructor;

public enum BookShow {
	
	SILVER(150)//we can use variable,methods,constructor
	{
		public String toString()//we can overload the toString method.if we can send the massage for each enum.
		{
			return "rate of silver ticket is:"+150;
		}
	},
	
	GOLD(200)
	{
		public String toString()
		{
			return "rate of gold ticket is:"+200;
		}
	
	},
			PLATINUM(250)
			{
				public String toString()
				{
					return "rate of platinum ticket is:"+250;
				}
			
			};
	
	//SILVER(150),GOLD(200),PLATINUM(250);
	int rate;//enum are public,static,final
	
	private BookShow(int rate)//constructor are private only
	{
		this.rate=rate;
	}

//	void message()
//	{
//		System.out.println("rate of ticket is:"+rate);
//	}
}
