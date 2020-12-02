import java.util.*;
public class HitandBlow{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("要素数(10以下):");
		int num = s.nextInt();
		System.out.print(num+"桁の数字を入力せよ>");
		String str = s.next();
		int[] strs = new int[num];
		int[] nums = new int[num];
		Random ran = new Random();
		for(int i=0; i<nums.length; i++){
			nums[i] = ran.nextInt(num);
			strs[i]=Character.getNumericValue(str.charAt(i));
		}
System.out.println(nums);
		calc(strs,nums);
	}

	static void calc(int[] strs, int[] nums){
		int hit=0;
		int blow=0;
		for(int i=0;i<nums.length;i++){
			if(nums[i] == strs[i]){
				hit++;
			}else{
				for(int j=0;j<nums.length;j++){
					if(nums[i] == strs[j]){
						blow++;
					}
				}
			}
		}
		System.out.printf("Hit=%d/Blow=%d%n",hit,blow);
	}
}
