package assignment;

public enum Seasons2   {
	
	RAINY,SPING,SUMMER,WINTER;
	
	public static void environment(Seasons2 s)
	{
		switch(s)
		{
		case SUMMER:System.out.println("use cap");
		break;
		case WINTER:System.out.println("use sweter");
		break;
		case RAINY:System.out.println("use umbrella");
		break;
		default:
			System.out.println("no need to use anything special ");
		}
	}
	public static void main(String[] args) {
		Seasons2 d=Seasons2.RAINY;
		environment(d);
		
		
	}

}
