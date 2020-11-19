import java.util.*;
public class Arr3{
	public static void main(String[] args){
		System.out.print("整数を入力>");
		int num = new Scanner(System.in).nextInt();
		int[] nums = new int[num];
		int sum = 0;
		int average = 0;
		for(int i=0; i<nums.length; i++){
			int ran = new Random().nextInt(101);
			nums[i] = ran;
			sum += ran;
		}
		System.out.println(Arrays.toString(nums));
		//配列を昇順に並び替え
		for(int i=0; i<nums.length-1; i++){
			for(int j=i+1; j<nums.length; j++){
				if(nums[i] > nums[j]){
					int temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(nums));
		System.out.println("合計："+ sum);
		System.out.println("平均："+ sum/num);
	}
}
