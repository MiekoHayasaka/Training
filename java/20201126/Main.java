import my.util.*;
import java.util.*;
public class Main{
	public static void main(String[] args){
		final int MIN=-10,MAX=10;
		System.out.print("配列の要素数を入力してください>");
		int num= new Scanner(System.in).nextInt();
		int[] arr= new int[num];
		arr = Common.arrRandomRange(Min,Max,num);
		System.out.println("配列を生成しました。");
		System.out.println(Arrays.toString(arr));
		while(true){
			System.out.println("1..元の配列を表示,2..配列を昇順ソート,3..配列を降順ソート,4..終了>");
			int pr = new Scanner(System.in).nextInt();
			switch(pr){
				case 1:
					System.out.println(Arrays.toString(Common.arrClone(arr)));
					break;
				case 2:
					Common.arrSort(arr);
					System.out.println(Arrays.toString(arr));
					break;
				case 3:
					Common.arrSort(arr,true);
					System.out.println(Arrays.toString(arr));
					break;
				default:
					System.out.println("アプリケーションを終了します");
					return;
			}
		}
	}
}
