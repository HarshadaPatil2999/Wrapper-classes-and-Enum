package assignments;

public class ShowIntvValueMethodForAllWrapperClasses {
	public static void main(String[] args) {
		
		Integer i=34;
		int i1=i.intValue();
		System.out.println(i1);
		//short s1=i.intValue(); not applicable
		//byte b1=i.intValue(); not applicable
		float f1=i.intValue();
		System.out.println(f1);
		double d1=i.intValue();
		System.out.println(d1);
	//	String s=i.intValue();not applicable
		//boolean bo1=i.intValue(); not applicable
		
		Byte b=20;
		int i2=b.intValue();
		System.out.println(i2);
		Short s=10;
		int i3=s.intValue();
//		Long l1=349000;    not applicable
//		int i4=l1.intValue();
		Float f2=23.11f;
		int i4=f2.intValue();
		System.out.println(i4);
		Double d2=34.06d;
		int i5=d2.intValue();
		System.out.println(i5);
		
//		
		
	}

}
