package assignment;

import java.util.Arrays;

public class ExampleOnEnum {
	
	enum Enums {
		A,B,C,D
	}
	
public static void main(String[] args) {
	System.out.println(ExampleOnEnum.Enums.A);
	
	ExampleOnEnum.Enums e[]=ExampleOnEnum.Enums.values();
	for(ExampleOnEnum.Enums e1:e)
	{
		System.out.print(e1+" ");
	}
		System.out.println();
	System.out.println(Arrays.toString(e));
	}
	

}
