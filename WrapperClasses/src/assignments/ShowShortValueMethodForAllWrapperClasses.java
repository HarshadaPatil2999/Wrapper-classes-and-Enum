package assignments;

public class ShowShortValueMethodForAllWrapperClasses {
	public static void main(String[] args) {
		
		Short s=23567;
		short s1=s.shortValue();
		System.out.println(s1);
		long l=s.shortValue();
		System.out.println(l);
		//byte b=s.shortValue(); not applicable
		int i=s.shortValue();
		System.out.println(i);
		double d=s.shortValue();
		System.out.println(d);
		
		Integer i1=23;
		Short s2=i1.shortValue();
		System.out.println(s2);
		Float f2=34.07f;
		Short s3=f2.shortValue();
		System.out.println(s3);
		Long l2=(long) 345;
		
		Short s4=l2.shortValue();
		System.out.println(s4);
		Double d2=34.89d;
		Short s5=d2.shortValue();
		System.out.println(s5);
	}

}
