public class Hero{
	public static final double PI=3.141592;
	static int money;
	private String name;
	private int hp;

	public Hero(String name){
		this.name=name;
	}
	public Hero(String name,int hp){
		this(name);
		this.setHp(hp);
	}

	public String getName(){
		return this.name;
	}
	public int getHp(){
		return this.hp;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setHp(int hp){
		this.hp=hp;
	}
	public void attack(){
		money+=10;
		int damage=new java.util.Random().nextInt(10)+1;
		this.hp-=new java.util.Random().nextInt(10)+1;
		this.hp-=damage;
		System.out.println(this.name+"は"+damage+"pointのダメージ!");
		System.out.println("先頭に勝利した");
	}
	public static void showMoney(){
		System.out.println("所持金"+money);
		//System.out.println(this.hp);
	}
}
