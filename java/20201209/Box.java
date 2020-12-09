public class Box{
	private String color;
	private String shape;
	private int num;
	private static int totalNumber;
	public Box(String color,String shape,int num){
		this.color=color;
		this.shape=shape;
		this.num=num;
		totalNumber+=num;
	}
	public void insertBalls(int ball){
		this.num+=ball;
		totalNumber+=ball;
		System.out.println(ball+"個のボールを入れました。");
	}
	public void removeBalls(int ball){
		int n=this.num<ball ? this.num:ball;
		this.num-=n;
		totalNumber-=n;
		System.out.println(n+"個のボールを取り出しました。");
	}
	public void displayInfo(int n){
		System.out.println(n+"---色:"+this.color+",形:"+this.shape+",個数:"+this.num);
	}
	public static int displayTotalNumber(){
		return totalNumber;
	}
}