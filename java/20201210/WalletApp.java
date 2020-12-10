import java.util.*;
public class WalletApp{
	public static void main(String[] args){
		Wallet wallet=new Wallet(1000);
		VendingMachine vend=new VendingMachine(3);
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("現在の入金額："+vend.getMoney());
			System.out.print("1. 硬貨投入 / 2. 商品購入 / 3. 硬貨取出 / 4.商品投入 / 5.所持金表示 / 6.終了>");
			int select=sc.nextInt();
			int money;
			switch(select){
				case 1:
					System.out.println("投入する金額を入力して下さい >");
					money=sc.nextInt();
					wallet.takeOutMoney(money);
					vend.setMoney(money);
					break;
				case 2:
					vend.purchase();
					break;
				case 3:
					money=vend.cancel();
					wallet.insertMoney(money);
					break;
				case 4:
					System.out.print("投入する個数を入力して下さい >");
					int n=sc.nextInt();
					vend.insertGoods(n);
					break;
				case 5:
					wallet.display();
					break;
				default:
					System.out.println("アプリケーションを終了します。");
					return;
			}
		}
	}
}
