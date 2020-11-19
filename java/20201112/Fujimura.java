import java.util.*;
public class Fujimura{
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
			System.out.print(i+1+"人目の名前>");
			names[i] = new Scanner(System.in).nextLine();
			//for(int j=0; j<num; j++){
				int index = new Random().nextInt(bolls.length-i);
				int boll = bolls[index];
				System.out.println(names[i]+"さんの点数:"+boll+"点");
				bolls[index]=bolls[bolls.length-1-i];
				bolls[bolls.length-1-i]=boll;
				scores[i] = boll;
			//}
		}
		//配列を降順に並び替え
		for(int i=0; i<scores.length-1; i++){
			for(int j=i+1; j<scores.length; j++){
				if(scores[i] < scores[j]){
					int temp=scores[i];
					String stemp=names[i];
					scores[i]=scores[j];
					names[i]=names[j];
					scores[j]=temp;
					names[j]=stemp;
				}
			}
		}
		for(int i=0; i<scores.length; i++){
			System.out.println(i+1+"位:"+scores[i]+"点:"+names[i]+"さん");
		}
	}
}
