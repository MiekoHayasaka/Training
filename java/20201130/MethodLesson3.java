public class MethodLesson3{
	//*を２０個並べて出力する処理
	static void printLine(){
		for(int i=0;i<20;i++){
			System.out.print("*");
		}
		System.out.println();
	}

	public static void main(String[] args){
		//メソッドに実引数として"大見出し1"という文字列を渡して実行
		printLine();
		System.out.println("見出し1");
		System.out.println("見出し1の内容");
		printLine();
		System.out.println("見出し2");
		System.out.println("見出し2の内容");
		printLine();
		System.out.println("見出し3");
		System.out.println("見出し3の内容");
		printLine();
	}
}
