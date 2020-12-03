import java.util.*;
public class Pool{
	double water;
	final double MAX_WATER = 600d;

	public Pool(){
		this.water=0d;
	}
	public void feedWater(double water){
		if(this.water == MAX_WATER){
			System.out.println("満水です");
			return;
		}
		double w=Math.min(water,MAX_WATER-this.water);
			this.water += w;
			System.out.printf("%.1f立方メートル給水しました。",w);
	}
		public void drainWater(double water){
			this.water -= water;
		}
		public void display(){
			System.out.printf("現在の水量は%.1fです。",this.water);
		}
	}

