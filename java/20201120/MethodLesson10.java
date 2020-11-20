import java.util.*;
public class MethodLesson10{
	static double tryMenseki(double teihen, double takasa){
		double menseki = teihen * takasa / 2;
		return menseki;
	}

	public static void main(String[] args){
		System.out.print("どうする？1…三角形の面積を求める0…やめる>");
		int num = new Scanner(System.in).nextInt();
		if(num == 1){
			System.out.print("底辺を入力してください");
			double teihen = new Scanner(System.in).nextDouble();
			System.out.print("高さを入力してください");
			double takasa = new Scanner(System.in).nextDouble();
			double menseki = tryMenseki(teihen,takasa);
			System.out.printf("底辺:%.2f,高さ:%.2fの三角形の面積は%.2fです。",teihen,takasa,menseki);
		}else{
			System.out.println("アプリケーションを終了します。");
		}
	}
}
