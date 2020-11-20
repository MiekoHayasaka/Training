import java.util.*;
public class MethodLesson7{
	public static void main(String[] args){
		System.out.print("月を入力してください>");
		int month = new Scanner(System.in).nextInt();
		System.out.println(month+"月の日数は"+addDays(month));
	}

	static int addDays(int a){
		int sums;
		switch(a){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				sums= 31;
				break;
			case 2:
				sums= 28;
				break;
			default:
				sums= 30;
				break;
		}
		return sums;
	}

}

