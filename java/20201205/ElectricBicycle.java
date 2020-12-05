public class ElectricBicycle extends Bicycle{
	static final int MAX=10;
	int battery;

	public ElectricBicycle(int wheelSize,int battery){
		super(wheelSize);
		this.battery=battery;
	}
	public void ride(){
		this.battery -= 5;
		super.ride();
		if(this.battery != 0){
			System.out.println("坂道だってラクラクです。");
		//	System.out.println(this.battery);
		}else{
			System.out.println("バッテリーが切れるととても重いです。");
		}
	}
	public void batteryCharge(){
		this.battery=MAX;
		System.out.println("バッテリーを充電しました。");
	}
	public void getOff(){
		super.getOff();
	}
}
