package assignment;

public class Nature {
	public static void main(String[] args) {
		Season s=Season.SPRING;
		System.out.println(s);
	}
	

}
enum Season  //can not extends class or other enum .only implements the interface
{
	RAINY,WINTER,SPRING,SUMMER,AUNTOM;
}
