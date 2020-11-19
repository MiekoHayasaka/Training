import java.util.*;
public class Arr5{
	public static void main(String[] args){
		int[] bolls=new int[99];
		for(int i=0; i<bolls.length; i++){
			bolls[i] = i+1;
		}
		System.out.print("何人>");
		int num = new Scanner(System.in).nextInt();
		String[] names = new String[num];
		int[] scores=new int[num];
		for(int i=0; i<num; i++){
			System.out.println(i+1+"人目の名前>");
			names[i] = new Scanner(System.in).nextLine();
			for(int j=0; j<num; j++){
				int index = new Random().nextInt(99);
				int boll = bolls[index];
				System.out.println(names[i]+"さんの点数:"+boll+"点");
				bolls[index]=balls[balls.length-1-(i*2+j)];
				bolls[balls.length-1-(i*2+j)]=ball;
				scores[i] = boll;
			}
		}
		//配列を降順に並び替え
		for(int i=0; i<scores.length-1; i++){
			for(int j=i+1; j<nums.length; j++){
				if(scores[i] < scores[j]){
					int temp=scores[i];
					scores[i]=scores[j];
					scores[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(scores));
	}
}
