package assignments;

public class Example2 {
	public static void main(String[] args) {
		//Boxing and AutoBoxing Examples for all primitive data types.
		int i=30;
		Integer i1=new Integer(i);
		Integer i2=i;
		System.out.println(i1);
		
		byte b=2;
		Byte b1=new Byte(b);
		Byte b2=b;
		System.out.println(b1);
		float f=3.0f;
		Float f1=new Float(f);
		Float f2=f;
		
		System.out.println(f1);
		long l=480000;
		Long l1=new Long(l);
		Long l2=l;
		
		System.out.println(l1);
		short s=3;
		Short s1=new Short(s);
		Short s2=s;
		System.out.println(s1);
		double d=5.5d;
		Double d1=new Double(d);
		Double d2=d;
		System.out.println(d1);
		char c='C';
		Character c1=new Character(c);
		Character c2=c;
		System.out.println(c1);
		String str="ABCD";
		String str1 =new String(str);
		String str2=str;
		System.out.println(str1);
		
		
		
		
	}

}
