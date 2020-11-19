import java.util.*;
public class ArrLesson5{
	public static void main(String[] args){
		int[] balls = new int[99];
		for(int i=0; i<balls.length; i++){
			balls[i] = i+1;
		}
		int countA=0;
		int countB=0;
		String win;
		for(int i=0; i<5; i++){
			int index = new Random().nextInt(balls.length);
			System.out.println(i+1 +"回戦");
			System.out.print("A:"+balls[index]+",");
			int temp=balls[index];
			int index2 = new Random().nextInt(balls.length);
			System.out.print("B:"+balls[index2]);
			int temp2=balls[index2];
			if(balls[index] > balls[index2]){
				System.out.println("...Aの勝ち");
				countA++;
			}else if(balls[index] < balls[index2]){
				System.out.println("...Bの勝ち");
				countB++;
			}else{
				System.out.println("同点！");
			}
			balls[index]=balls[balls.length-1-i];
			balls[index2]=balls[balls.length-1-i];
			balls[balls.length-1-i]=temp;
			balls[balls.length-1-i]=temp2;
		}
		if(countA>countB){
			win="Aの勝ち";
		}else if(countA<countB){
			win="Bの勝ち";
		}else{
			win="同点です";
		}
		System.out.println(countA+"対"+countB+"で"+win);
	}
}
