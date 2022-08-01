package assignments;

public class Example1 {
	public static void main(String[] args) {
		int a=20;
		Integer i=new Integer(a);//boxing:means wrappering the primitive data contain in to object
		System.out.println(i);
		Integer i1=a;//Auto Boxing
		System.out.println(i1);
		
		
		Integer i2=30;
		int a1=i2.intValue();//Unboxing:means unwrappering the object into primitive data type.
		System.out.println(a1);
		int a2=i2;//Auto Unboxing
		System.out.println(a2);
		float f23=Float.parseFloat("3.6");
		System.out.println(f23);
		
		Integer i3=Integer.valueOf("80");
		System.out.println(i3);
		Float f=4.5f;
		Float f1=Float.valueOf(f);
		float f2=Float.valueOf(f);
		System.out.println(f2);
		String s="100";
		byte b=Byte.valueOf(s);
		System.out.println(b);
		
	}

}
