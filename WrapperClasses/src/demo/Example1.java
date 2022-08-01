package demo;

public class Example1 {
	public static void main(String[] args) {
		int i=100;
		
		Integer i1=i;//autoboxing
		Integer i2=new Integer(i) ;//boxing
		Integer i6=new Integer(i);
		Integer i3=20;
		int i4=i3;//auto unboxing 
		int i5=i3.intValue();//unboxing 
		Float f=10.0f;
		Float f1=f;//it is allowed for respective premetive data type.
		//Short f2=f;//it is not applicable for diff primitive data type.
		Float f2=f.floatValue();
		short s=f.shortValue();
		System.out.println(s);
		long l=f.longValue();
		System.out.println(i1.equals(i2));//equals check contains.
		System.out.println(i1==i3);//==check the memory location.
	}

}
