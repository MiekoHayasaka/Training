import java.util.*;
public class Cat{
	private String name;
	char type;
	int intimacy =0;

	public Cat(){
		int run =new Random().nextInt(3);
		if(run==0){
		 this.type='A';
		}else if(run==1){
		 this.type='B';
		}else{
		 this.type='C';
		}
	}

	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name=name;
	}
	
	public void play(){
		System.out.println("Playing with "+this.name);
		System.out.println("...");
		System.out.println("Intimacy is up!!");
		this.intimacy++;
	}
	public void Appeare(){
		System.out.println(this.type+"-type cat appeared!");
	}
	@Override
	public String toString(){
		return "・・・"+this.name+"["+this.type+"]("+this.intimacy+")";
	}
}
