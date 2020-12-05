import java.util.*;
public class BicycleApp{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int bicycleType;
		int select;
		Bicycle b =new Bicycle(27);
		ElectricBicycle eb =new ElectricBicycle(24,10);
		while(true){
			System.out.println("自転車を選んでください");
			System.out.println("0・・・自転車/ホイールサイズ:"+b.wheelSize);
			System.out.println("1・・・電動自転車/ホイールサイズ:"+eb.wheelSize+" バッテリー:"+eb.battery);
			System.out.println("2・・・終了");
			System.out.print("番号を入力してください>");
			bicycleType = sc.nextInt();
			switch(bicycleType){
			case 0:
				boolean bl=true;
				while(bl){
					System.out.print("1/走る,2/降りる");
					select = sc.nextInt();
					switch(select){
					case 1:
						b.ride();
						break;
					case 2:
						b.getOff();
						bl=false;
						break;
					default:
						return;
					}
				}
				break;
			case 1:
				bl=true;
				while(bl){
					System.out.print("1/走る,2/降りる,3/充電>");
					select = sc.nextInt();
					switch(select){
					case 1:
						eb.ride();
						break;
					case 2:
						eb.getOff();
						bl=false;
						break;
					case 3:
						eb.batteryCharge();
						break;
					default:
						return;
					}
				}
				break;
			default:
				System.out.println("アプリケーションを終了します。");
				return;
			}
		}
	}
}
