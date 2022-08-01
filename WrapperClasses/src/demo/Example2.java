package demo;

public class Example2 {
	public static void main(String[] args) {
		
		Integer i1=new Integer(20);//constructor by using int value directly or string
		Integer i2=new Integer("20");
		
		
		Character c=new Character('s');
		Float f=new Float(3.5f);//float value
		Float f1=new Float(3.5);//double
		Float f2=new Float("3.5");//string
		
		Integer i3=Integer.valueOf(20);//for backend we use value of methods
		Integer i4=Integer.valueOf("20");//we use mostly string for backend
		Integer i5=Integer.valueOf("111",2);//we use string and radix;always take string value no less than radix.
		System.out.println(i5);
		Integer a=Integer.valueOf("176",8);
		System.out.println(a);
		Integer b=Integer.valueOf("321",4);// 3*4^2+2*4^1+1*4^0=57
		System.out.println(b);
		int c1=Integer.parseInt("12");//only int value is allowed
		System.out.println(c1);
		//int d=Integer.parseInt("abc");//it is not allowed
		float c2=Float.parseFloat("3.5");
		float c3=Float.parseFloat("3");
		System.out.println(c2);
		System.out.println(c3);
		//float c3=Float.parseFloat("abc");//it is not allowed.show numberFormatException.
//		System.out.println(c3);
	}

}
