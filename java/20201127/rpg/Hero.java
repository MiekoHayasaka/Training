public class Hero{
	//フィールド
	String name;
	int hp=100;

	//コンストラクタ
	public Hero(String name){
		this.name=name;
	}
	public Hero(String name, int hp){
		this(name); //このクラス内のコンストラクタを呼び出し(必ず１行目に書く)
		this.hp=hp;
	}

	//メソッド
	public void sleep(){
		this.hp=100;
		System.out.println(this.name + "は、眠って回復した！");
	}
	public void sit(int sec){
		this.hp += sec;
		System.out.println(this.name+"は、"+sec+"秒座った！");
		System.out.println("HPが"+sec+"ポイント回復した");
	}
	public void slip(){
		this.hp -= 5;
		System.out.println(this.name+"は、転んだ!");
		System.out.println("5のダメージ");
	}
	public void run(){
		System.out.println(this.name+"は、逃げ出した！");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは"+this.hp+"でした");
	}
}
