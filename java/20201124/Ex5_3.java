public class Ex5_3{
	public static void main(String[] args){
		System.out.println(calcTriangleArea(10.0,5.0)+"㎠");
		System.out.println(calcCircleArea(5.0)+"㎠");
	}
	static double calcTriangleArea(double bottom, double height){
		return bottom * height /2;
	}
	static double calcCircleArea(double radius){
		return radius * radius * 3.14;
	}
}
