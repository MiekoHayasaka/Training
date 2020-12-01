public class Flowerbed{
	final int MAXWATER=3;
	String color;
	int seedNum;
	int bloom;
	int water;

	public Flowerbed(String color,int seedNum){
		this.color = color;
		this.seedNum = seedNum;
	}

	//水を汲む
	public void drawWater(){
		switch(water){
			case 0:
				this.water = MAXWATER;
				System.out.println("水を3杯汲みました。");
				break;
			case 1:
				this.water = MAXWATER;
				System.out.println("水を2杯汲みました。");
				break;
			case 2:
				this.water = MAXWATER;
				System.out.println("水を1杯汲みました。");
				break;
			default:
				System.out.println("水は満杯です！");
				break;
		}
	}
	//水を撒く
	public void waterFlower(){
		if(water == 0){
			System.out.println("水が空っぽです。");
		}else if(seedNum == 0){
			System.out.println("すべての花が咲いています！");
		}else{
			this.water--;
			this.seedNum--;
			this.bloom ++;
			System.out.println("水を撒きました。");
		}
	}
	//花壇を表示
	public void showStatus(){
		System.out.println("花の色は"+this.color);
		System.out.print("#");
		for(int j=0;j<bloom;j++){
			System.out.print("*");
		}
		for(int i=0;i<seedNum;i++){
			System.out.print(".");
		}
		System.out.println("#");
	}
}
