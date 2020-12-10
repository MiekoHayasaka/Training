public class Wallet{
	private int money;

	public Wallet(int money){
		if(money < 0){
			this.money=0;
		}
		this.money=money;
	}

	public void insertMoney(int money){
		this.money += money;
		System.out.println("財布に"+money+"円入れました。");
	}
	public void takeOutMoney(int money){
		int n=this.money < money ? this.money:money;
		this.money -= n;
		System.out.println("財布から"+money+"円取り出しました。");
	}
	public void display(){
		System.out.println("現在の財布の中身："+this.money+"円");
	}
	public int getMoney(){
		return this.money;
	}
}
