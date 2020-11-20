import java.util.*;
public class MethodLesson6{
	public static void main(String[] args){
		System.out.print("言葉>");
		String str = new Scanner(System.in).nextLine();
		System.out.print("数字>");
		int num = new Scanner(System.in).nextInt();
		System.out.println(decorateStr(str,num));
	}
	static String decorateStr(String str,int num){
		if(num % 2 == 0){
			return "***" + str + "***";
		}else{
			return "---" + str + "---";
		}
/*
		if(true){
			return "***" + str + "***";
		}
*/
	}
		static void methodA(int a){
			if(a<0){
				return;
			}
			System.out.println(a);
		}
}
