public class Monkey{
	String name;
	int age;

	public Monkey(String name, int age){
		this.name=name;
		this.age=age;
	}
	public void greet(){
		System.out.printf("こんにちは%s(%d才)です。よろしく！%n",this.name,this.age);
	}
	public void takeuma(){
		System.out.println(this.name+"は上手に竹馬に乗った！");
	}
	public void sakadachi(){
		System.out.println(this.name+"はひょいと逆立ちをした！");
	}
}
