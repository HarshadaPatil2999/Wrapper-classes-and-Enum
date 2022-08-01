package assignment;

public enum Level {
	TOP
	{
//		 void showLevel()//we can not use display method locally.
//		{
//			System.out.println("level at top");
//		}
		public String toString()
		{
			return "level at top";
		}
	},
	
	MIDDLE,
	
	LAST
	{
//	      void showLevel()
//		{
//			System.out.println("level at last");
//		}
		public String toString()
		{
			return "level at last";
		}
	};
	public static void main(String[] args) {
		Level l=Level.LAST;
		
		System.out.println(l);
	}

}
