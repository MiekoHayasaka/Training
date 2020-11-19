import java.util.*;
public class ArrRan{
	public static void main(String[] args){
		int[] dice=new int[10];
		for(int i=0; i<dice.length; i++){
			int num = new Random().nextInt(6)+1;
			dice[i] = num;
		}
		System.out.print(Arrays.toString(dice));
	}
}
