public class SuperHero extends Hero{
	String name="ミナト";
	int hp =100;
	boolean flying:
	
	public SuperHero(){
		System.out.println("SuperHeroクラスのコンストラクタが動作");
	}
	public void fly(){
		this.flying=true;
		System.out.println("飛び上がった！");
	}
	public void land(){
		this.flying=false;
		System.out.println("着地した！");
	}
	@Override
	public void run(){
		System.out.println(this.name+"は撤退した");
	}
	@Override
	public void attack(matango m){
		super.attack(m);
		if(this.flying){
			supper.attack(m);
		}
	}
}
