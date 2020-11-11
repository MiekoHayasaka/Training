import java.util.*;
public class Arr4{
	public static void main(String[] args){
		int[] nums = new int[10];
		String[] strs = new String[10];
		for(int i=0; i<nums.length; i++){
			int n = new Random().nextInt(10);
			//nums[i] = n;
			/*
			if(nums[i]%2==0){
				strs[i]="偶数";
			}else{
				strs[i]="奇数";
			}
			*/
			strs[i] = n%2 == 0 ? "偶数":"奇数";
			System.out.print(n+",");
		}
		System.out.println();
		//System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(strs));
	}
}
