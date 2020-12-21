import java.util.*;
public class Overload{
	public static void main(String[] args){
		int[] arr1=createRandomArr(1,9,3);
		System.out.println(Arrays.toString(arr1));
		int[][] arr2=createRandomArr(1,9,3,2);
		for(int[] arr:arr2){
			System.out.println(Arrays.toString(arr));
		}
		showArr(arr1);
		showArr(arr2);
	}
	static int[] createRandomArr(int min,int max,int len){
		Random rand=new Random();
		int[] arr=new int[len];
		for(int i=0;i<arr.length;i++){
			arr[i]=rand.nextInt(max-min+1)+min;
		}
		return arr;
	}
	static int[][] createRandomArr(int min,int max,int len,int childLen){
		int[][] arr=new int[len][childLen];
		for(int i=0;i<arr.length;i++){
			arr[i]=createRandomArr(min,max,childLen);
		}
		return arr;
	}
	static void showArr(int[] arr){
		System.out.print("{");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+",");
		}
		System.out.println("}");
	}
	static void showArr(int[][] arr){
		System.out.println("{");
		for(int i=0;i<arr.length;i++){
			showArr(arr[i]);
		}
		System.out.println("}");
	}
}
