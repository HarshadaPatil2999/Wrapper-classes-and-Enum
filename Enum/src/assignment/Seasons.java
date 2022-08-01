package assignment;

public enum Seasons {
	
	
	
	SPRING,SUMMER,AUTUMN;
	
public static void main(String[] args) {
		
	System.out.println(Seasons.AUTUMN);
	System.out.println(Seasons.AUTUMN.ordinal());
	System.out.println();
	
		for(Seasons s:Seasons.values())
		{
			System.out.println(s);
		}
	}

}
