import java.util.*;
public class MethodLesson5{
	public static void main(String[] args){
		int n=sumOf(3,5);
		System.out.println(n);
		System.out.print("言葉>");
		String str = new Scanner(System.in).nextLine();
		String decorated = decorateStr(str);
		System.out.println(decorated);
		System.out.print("整数a>");
		int a = new Scanner(System.in).nextInt();
		System.out.print("整数b>");
		int b = new Scanner(System.in).nextInt();
		System.out.println("大きいほうは"+maxOf(a,b));
	}
	//戻り値のあるメソッド
	static int sumOf(int a, int b){
		return a+b;
	}
	static String decorateStr(String s){
		return "***"+ s +"***";	
	}
	static int maxOf(int a, int b){
		return a>b ? a:b;
	}
}
