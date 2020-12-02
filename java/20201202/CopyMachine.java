public class CopyMachine{
	int paper;

	public CopyMachine(int sheet){
		this.paper = sheet;
	}

	public void feedPaper(int sheet){
		this.paper += sheet;
		System.out.println(sheet+"枚給紙しました。");
	}
	public void copy(int sheet){
		this.paper -= sheet;
		System.out.println(sheet+"枚コピーしました。");
	}
	public void display(){
		System.out.println("コピー可能な枚数は"+this.paper+"枚です。");
	}
}
