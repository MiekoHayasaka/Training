import java.util.*;
public class CopyMachineApp{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("最初に給紙する枚数を入力して下さい >");
		int sheet = s.nextInt();
		CopyMachine copy = new CopyMachine(sheet);
		while(true){
			System.out.print(" 1. 給紙 / 2. コピー / 3. 表示 / 4. 終了>");
			int select = s.nextInt();
			switch(select){
				case 1:
					System.out.print("給紙する枚数を入力して下さい >");
					sheet = s.nextInt();
					copy.feedPaper(sheet);
					break;
				case 2:
					System.out.print("コピーする枚数を入力して下さい >");
					sheet = s.nextInt();
					copy.copy(sheet);
					break;
				case 3:
					copy.display();
					break;
				default:
					System.out.println("アプリケーションを終了します");
					return;
			}
		}
	}
}
