import java.util.*;
public class PencilApp{
	public static void main(String[] args){
		System.out.print("何色の鉛筆を作りますか>");
		Scanner scan = new Scanner(System.in);
		String color = scan.nextLine();
		Pencil pen = new Pencil(color);
		while(true){
			System.out.print("操作を入力してください1…書く,2…情報を見る,3…終了>");
			int select = scan.nextInt();
			switch(select){
				case 1:
					pen.write(color);
					break;
				case 2:
					pen.info(color,pen.penLength);
					break;
				default:
					System.out.println("アプリケーションを終了します");
					return;
			}

		}
	}
}
