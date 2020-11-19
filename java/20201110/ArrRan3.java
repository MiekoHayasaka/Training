import java.util.*;
public class ArrRan3{
	public static void main(String[] args){
		int[] nums1 = new int[5];
		Random ran = new Random();
		System.out.println("***nums1***");
		for(int i=0; i<nums1.length; i++){
		 	int n = ran.nextInt(100)+1;
			nums1[i] = n;
			System.out.println(n);
		}
		System.out.println("***nums2***");
		int[] nums2 = new int[nums1.length];
		for(int i=0; i<nums2.length; i++){
			nums2[i] = nums1[i]*3;
			System.out.println(nums2[i]);
		}
	}
}

