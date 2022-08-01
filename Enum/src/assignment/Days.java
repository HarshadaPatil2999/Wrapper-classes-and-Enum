package assignment;

public enum Days {
	SUNDAY,MUNDAY,THUESDAY,WENDSDAY,THURSDAY,FRIDAY,SATURDAY;
	public static void main(String[] args) {
		Days s[]=Days.values();
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]+" "+s[i].ordinal());
		}
	}

}
