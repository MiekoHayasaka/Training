import java.util.*;
public class MethodLesson6{
	public static void main(String[] args){
		System.out.print("一文字入れてください>");
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		//Stringの１文字目をcharとして取り出す
		char c = s.charAt(0);
		System.out.print("幅を入れてください>");
		int width = scan.nextInt();
		printSquare(c,width);
	}
	static void printSquare(char c,int width){
		for(int i=0;i<width;i++){
			for(int j=0;j<width;j++){
				System.out.print(c);
			}
			System.out.println();
		}
	}
}
