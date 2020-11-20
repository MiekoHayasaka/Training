import java.util.*;
public class MethodLesson8{
	public static void main(String[] args){
		System.out.print("繰り返す文字>");
		String str = new Scanner(System.in).nextLine();
		System.out.print("繰り返す回数>");
		int num = new Scanner(System.in).nextInt();
		System.out.println(repStr(str,num));
	}

	static String repStr(String a, int b){
		String strs = "";
		for(int i=0; i<b; i++){
			strs += a;
		}
		return strs;
	}
}
