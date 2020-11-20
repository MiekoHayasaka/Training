import java.util.*;
public class MethodLesson4{
	public static void main(String[] args){
		System.out.print("言葉１>");
		String word1 = new Scanner(System.in).nextLine();
		System.out.print("言葉２>");
		String word2 = new Scanner(System.in).nextLine();
		compareLength(word1,word2);
	}

	static void compareLength(String a, String b){
		if(a.length() > b.length()){
			System.out.println(a+"の勝ち");
		}else if(a.length() < b.length()){
			System.out.println(b+"の勝ち");
		}else{
			System.out.println("引き分け");
		}
	}
}
