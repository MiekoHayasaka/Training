import java.util.*;
public class PoolApp{
	public static void main(String[] args){
		Pool pl = new Pool();
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print("1. 給水 / 2. 排水 / 3. 表示 / 4. 終了>");
			int select = sc.nextInt();
			double water;
			switch(select){
			case 1:
				System.out.print("給水する水量を入力して下さい >");
				water = sc.nextInt();
				pl.feedWater(water);
				break;
			case 2:
				System.out.print("排水する水量を入力して下さい >");
				water = sc.nextInt();
				pl.drainWater(water);
				break;
			case 3:
				pl.display();
				break;
			default:
					System.out.println("アプリケーションを終了します");
					return;
			}
		}
	}
}
