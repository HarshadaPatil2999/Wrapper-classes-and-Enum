package assignments;

public class ShowLongValueMethodToAllWrapperClasses {
	public static void main(String[] args) {
		
		Long l=(long) 3450;
		//int i=l.longValue();not applicable
		long l2=l.longValue();
		System.out.println(l2);
		float f=l.longValue();
		System.out.println(f);
		double d=l.longValue();
		System.out.println(d);
		//byte b=l.longValue(); not applicable
		//short s=l.longValue(); not applicable
		
		Integer i=23;
		long l3=i.longValue();
		System.out.println(l3);
		Float f2=23.03f;
		long l4=f2.longValue();
		System.out.println(l4);
		Double d2=34.88d;
		long l5=d2.longValue();
		System.out.println(l5);
		Short s1=23;
		long l6=s1.longValue();
		System.out.println(l6);
		
	}

}
