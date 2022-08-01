package assignment;

public class WeekDays{
	
	public enum Days{
		MON,TUE,WED,THU,FRI,SAT
	}
	
	public static void main(String[] args) {
		for(Days d:Days.values())
		
		{
			System.out.print(d+" ");
		}
		System.out.println();
		Days d2[]=Days.values();
		for(int i=0;i<d2.length;i++)
		{
			System.out.print(d2[i]+" ");
		}System.out.println();
		System.out.println(d2[2]);
	}
	
	
}
//public class A {
//
//}
//enum Enums extends A
//{
//	A,B,C
//}