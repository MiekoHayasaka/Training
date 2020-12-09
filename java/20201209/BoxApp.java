import java.util.*;
public class BoxApp{
	public static void main(String[] args){
		Box b1=new Box("赤","円形",1);
		Box b2=new Box("青","四角",2);
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.print("1. ボール投入 / 2. ボール取出 / 3. ボール総数表示 / 4. 終了>");
			int n=sc.nextInt();
			switch(n){
				case 1:
					b1.displayInfo(0);
					b2.displayInfo(1);
					System.out.print("ボールを投入する箱の番号を入力して下さい>");
					int boxNum1=sc.nextInt();
					if(boxNum1!=0 && boxNum1!=1){
						error();
						break;
					}
					System.out.print("投入するボールの個数を入力して下さい>");
					int ballNum1=sc.nextInt();
					if(boxNum1==0){
						b1.insertBalls(ballNum1);
					}else{
						b2.insertBalls(ballNum1);
					}
					newLine();
					break;
				case 2:
					b1.displayInfo(0);
					b2.displayInfo(1);
					System.out.print("ボールを取り出す箱の番号を入力して下さい>");
					int boxNum2=sc.nextInt();
					if(boxNum2!=0 && boxNum2!=1){
						error();
						break;
					}
					System.out.print("取り出すボールの個数を入力して下さい>");
					int ballNum2=sc.nextInt();
					if(boxNum2==0){
						b1.removeBalls(ballNum2);
					}else{
						b2.removeBalls(ballNum2);
					}
					newLine();
					break;
				case 3:
					System.out.println("ボールの合計は"+Box.displayTotalNumber()+"個です");
					newLine();
					break;
				default:
					System.out.println("アプリケーションを終了します。");
					return;
			}
		}
	}
	static void error(){
		System.out.println("箱の番号の入力が間違っています。");
		newLine();
	}
	static void newLine(){
		System.out.println();
	}
}