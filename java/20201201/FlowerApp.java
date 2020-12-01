import java.util.*;
public class FlowerApp{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("何色の花にしますか？");
		String color = sc.next();
		System.out.print("種をいくつ植えますか？");
		int seed = sc.nextInt();
		Flowerbed f1 = new Flowerbed(color,seed);
		while(true){
			System.out.print("何をしますか？1.水汲み 2.水撒き 3.花壇を見る 4.終了>");
			int select = sc.nextInt();
			switch(select){
				case 1:
					f1.drawWater();
					break;
				case 2:
					f1.waterFlower();
					break;
				case 3:
					f1.showStatus();
					break;
				default:
					System.out.println("アプリケーションを終了します");
					return;
			}
		}
	}
}
