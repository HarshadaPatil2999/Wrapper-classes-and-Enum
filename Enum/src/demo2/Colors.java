package demo2;

public enum Colors {
	ORANGE("Red","Yellow")
	{
		public String toString()
		{
			return "orange is mixure of 2 colours:"+"Red"+" "+"Yellow";
		}
	},
	
	GREEN("Blue","Yellow")
	{
		public String toString()
		{
			return "green is mixure of 2 colours:"+"Blue"+" "+"Yellow";
		}
	},
	
	PINK("Red","White")
	{
		public String toString()
		{
			return "green is mixure of 2 colours:"+"Red"+" "+"White";
		}
	},
	BROWN("Red","Black")
	{
		public String toString()
		{
			return "green is mixure of 2 colours:"+"Red"+" "+"White";
		}
	},
	
	PURPLE("Blue","Pink")
	{
		public String toString()
		{
			return "green is mixure of 2 colours:"+"Blue"+" "+"Pink";
		}
	};
	
	String s1,s2;
	private  Colors(String s1,String s2)
	{
		this.s1=s1;
		this.s2=s2;
	}
	

}
