import java.util.*;
public class MethodLesson2{
	public static void main(String[] args){
		System.out.print("何回振る？>");
		int count = new Scanner(System.in).nextInt();
		System.out.print("何人で？>");
		int member = new Scanner(System.in).nextInt();
		int[][] darr = diceArr(member,count);
		int[] sum = new int[member];
		String[] names= {"Aさん:","Bさん:","Cさん:","Dさん:"};
		for(int i=0;i<darr.length;i++){
			for(int j=0;j<darr[i].length;j++){
			 sum[i] += darr[i][j];
			}
			System.out.println(names[i]+Arrays.toString(darr[i])+"合計:"+sum); 
		}
		int win=-1;
		for(int i=0;i<darr.length;i++){
			for(int j=0;j<darr.length;j++){
				if(sum[i]>sum[j+1]){
					win=i;
				}else if(sum[i]<sum[j+1]){
					win=j+1;
				}else{
					System.out.println("引き分け");
				}
			}
		}
		System.out.println(names[win]+"さんの勝ち");
	}

	public static int[][] diceArr(int member, int count){
		int[][] dArr=new int[member][count];
		for(int i=0;i<dArr.length;i++){
			for(int j=0;j<dArr[i].length;j++){
				int num = new Random().nextInt(6)+1;
				dArr[i][j]=num;
			}
		}
		return dArr;
	}
}
