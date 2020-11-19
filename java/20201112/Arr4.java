import java.util.*;
public class Arr4{
	public static void main(String[] args){
		System.out.print("何回引く?(1~10) >");
		int num = new Scanner(System.in).nextInt();
		int[] nums = new int[50];
		for(int i=0; i<nums.length; i++){
			nums[i] = i+1;
		}
		int asum=0, bsum=0;
		for(int i=0; i<num; i++){
			for(int j=0; j<2; j++){
				int index = new Random().nextInt(nums.length-(i*2+j));
				int kuji = nums[index];
				if(j==0){
					asum += kuji;
					System.out.print(i+1+"回目Aさん:"+kuji);
				}else{
					bsum += kuji;
					System.out.println(",Bさん:"+kuji);
				}
				nums[index]=nums[nums.length-1-(i*2+j)];
				nums[nums.length-1-(i*2+j)]=kuji;
			}
		}
		System.out.println("合計:Aさん:"+asum+",Bさん:"+bsum);
		if(asum > bsum){
			System.out.println("Aさんの勝ち");
		}else{
			System.out.println("Bさんの勝ち");
		}
	}
}
