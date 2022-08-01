package assignments;

public class ConvertStringtoPrimitiveDataType {
	public static void main(String[] args) {
		int i=Integer.parseInt("100");
		short s=Short.parseShort("100");
		long l=Long.parseLong("100");
		Double d=Double.parseDouble("100");
		float f=Float.parseFloat("100");
		byte b=Byte.parseByte("100");
		System.out.println(i);
		System.out.println(l);
		System.out.println(d);
		System.out.println(f);
		System.out.println(b);
	}

}
