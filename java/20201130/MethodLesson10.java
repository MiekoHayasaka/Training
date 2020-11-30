import java.util.*;
public class MethodLesson10{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("消費税は何％ですか>");
		int tax = s.nextInt();
		int price;
		int total=0;
		while(true){
			System.out.print("価格を入力(0でお会計)>");
			price = s.nextInt();
			if(price == 0){
				break;
			}else{
				total += price;
			}
		}
		int taxPrice = taxPrice(total,tax);
		System.out.printf("お買い物の合計金額%d円(税込み)です。%n",taxPrice);
	}

	static int taxPrice(int totalPrice, int tax){
		double ratio = 1 + (tax/100.0);
		return (int)(totalPrice*ratio);
	}
}
