package assignments;

public class ShowValueofPrimitimeDataType {
	public static void main(String[] args) {
		
		//valueof method of Each wrapper classes.
		Integer i=Integer.valueOf(10);
		System.out.println(i);
		Float f=Float.valueOf(20.0f);
		System.out.println(f);
		Double d=Double.valueOf(20.45d);
		System.out.println(d);
		Byte b=Byte.valueOf((byte)5);
		System.out.println(b);
	    Short s=Short.valueOf((short) 1);
	    System.out.println(s);
		String st=String.valueOf(123);
		System.out.println(st);
		Character c=Character.valueOf('D');
		System.out.println(c);
		Boolean bo=Boolean.valueOf(true);
		System.out.println(bo);
		
		//Examples on valueof method on string.
		Integer i1=Integer.valueOf("20");
		System.out.println(i1);
		Float f1=Float.valueOf("20.0f");
		System.out.println(f1);
		Double d1=Double.valueOf("20.45d");
		System.out.println(d1);
		Byte b1=Byte.valueOf("2");
		System.out.println(b1);
	    Short s1=Short.valueOf("24");
	    System.out.println(s1);
		String st1=String.valueOf("123");
		System.out.println(st);
		Boolean bo1=Boolean.valueOf("gujiq");
		System.out.println(bo1);
		
		
		//Example on valueof String,radix method
		
		Integer i3=Integer.valueOf("111", 2);
		System.out.println(i3);
		Byte b3=Byte.valueOf("12", 3);
		System.out.println(b3);
		Short s3=Short.valueOf("123", 5);
		System.out.println(s3);
		Long l3=Long.valueOf("123456", 8);
		System.out.println(l3);
		
		
		
		
		
	}

}
