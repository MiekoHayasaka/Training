public class VendingMachine{
	private int money; //投入された金額
	private int num=0; //商品の個数

	public VendingMachine(int n){
		this.num=n;
	}

	public void insertCoins(int money){
		this.money = money;
	}
	public int cancel(){
		return this.money;
	}
	public int purchase(){
		if(this.num==0){
			System.out.println("商品売切れ");
		}else{
			this.num--;
			this.money -= 100;
		}
		return this.money;
	}
	public void insertGoods(int num){
		this.num += num;
	}
	public int getMoney(){
		return this.money;
	}
	public void setMoney(int money){
		this.money=money;
	}
}
