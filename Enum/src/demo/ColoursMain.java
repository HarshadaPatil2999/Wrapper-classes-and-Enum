package demo;

import java.util.Arrays;

public class ColoursMain {
public static void main(String[] args) {
	
	System.out.println(Colors.BLACK);//call with class name
	Colors c=Colors.BLACK;// call with create object
	System.out.println(c);
	Colors d=Colors.BLUE;
	System.out.println(d);
	System.out.println(c.ordinal());//check for position of enum constant.start from zero ordinal (index)
	Colors cr[]=Colors.values();//create array also.
	
	for(Colors s:cr)
	{
		System.out.print(s+" ");
	}
	System.out.println();
	System.out.println(Arrays.toString(cr));
	System.out.println(c.compareTo(d));
}
}
