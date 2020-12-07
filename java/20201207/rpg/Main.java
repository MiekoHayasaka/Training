import java.util.*;
public class Main{
	public static void main(String[] args){
		/*
		Hero h=new Hero("ロト",100);
		Wizard w=new Wizard();
		w.setName("ジェシカ");
		w.setMp(100);
		w.setHp(100);
		Wand wand=new Wand();
		wand.setName("さとりの杖");
		wand.setPower(50d);
		w.setWand(wand);
		w.heal(h);
		System.out.println(h.getName()+"のHPは"+h.getHp());
		System.out.println(w.getName()+"のMPは"+w.getMp());
*/
		Hero.showMoney();
		Hero h=new Hero("ロト");
		h.setHp(100);
		Hero h1=new Hero("ジェシカ");
		h1.setHp(100);
		h.attack();
		h1.attack();
		Hero.showMoney();
		System.out.println(h.getName()+":"+h.getHp());
		System.out.println(h1.getName()+":"+h1.getHp());
	}
}
