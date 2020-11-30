public class MethodLesson5{
	static void printLine(int width){
		for(int i=0;i<width;i++){
			System.out.print("*");
		}
		System.out.println();
	}

	static void midashiMaker(int width,String title){
		printLine(width);
		System.out.println("*"+title);
		printLine(width);
	}

	public static void main(String[] args){
		midashiMaker(20,"すごい！！");
		System.out.println("すごいことがありました！");
		midashiMaker(30,"大事件が発生しました！");
		System.out.println("大変なことが起こりました！");
		midashiMaker("Hello");
	}

	static void midashiMaker(String title){
		printLine(title.length()+2);
		System.out.println("*"+title+"*");
		printLine(title.length()+2);
	}
}
