package assignment;

public enum Car {
	
	Innova
	
	{
		int p=800000;
//		 void displayInnova()
//		{
//			System.out.println("price:"+p);
//		}
		
		public String toString()
		{
			return "price"+p;
		}
	},
	
	Hundai
	{
		 int c=800000;
//		 void displayHundai()
//		{
//			System.out.println("price:"+c);
//		}
		public String toString()
		{
			return "price:"+c;
		}
	};
	

}
