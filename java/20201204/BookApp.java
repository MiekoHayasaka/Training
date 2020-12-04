import java.util.*;
public class BookApp{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("本のページ数を入力してください>");
		int bpage = sc.nextInt();
		System.out.print("本の価格を入力してください>");
		int bprice = sc.nextInt();
		Book book = new Book(bpage,bprice);
		System.out.print("ノートのページ数を入力してください>");
		int npage = sc.nextInt();
		System.out.print("ノートの価格を入力してください>");
		int nprice = sc.nextInt();
		NoteBook notebook = new NoteBook(npage,nprice);
		while(true){
			System.out.print("1. 本の情報表示 / 2. ノートの情報表示 / 3. ノートに追加書込 / 4.   終了>");
			int select = sc.nextInt();
			switch(select){
			case 1:
				book.showStatus();
				break;
			case 2:
				notebook.showStatus();
				break;
			case 3:
				System.out.print("書き込む内容を入力して下さい >");
				String str=sc.next();
				notebook.write(str);
				break;
			default:
				System.out.println("アプリケーションを終了します");
				return;
			}
		}
	}
}
