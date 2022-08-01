package assignments;

public class Example3 {
	public static void main(String[] args) {
		//Examples on UnBoxing and AutoUnBoxing
		
		Integer i=3000000;
		int i1=i.intValue();//unBoxing
		int i2=i;//Auto UnBoxing
		byte b=i.byteValue();
		long l=i.longValue();
		float f=i.floatValue();
		double d=i.doubleValue();
		short s=i.shortValue();
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(b);
		System.out.println(f);
		System.out.println(d);
		System.out.println(l);
		System.out.println(s);
		
		Byte by=23;
		byte by1=by.valueOf(by);
		 int in=by.valueOf(by);
		byte by2=by;
		int in1=by;//we directly use means Auto unBoxing to with other primitive data type.
		System.out.println();
		
		
		
		
		
		
	}

}
