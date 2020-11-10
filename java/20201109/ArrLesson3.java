import java.util.Arrays;
public class ArrLesson3{
	public static void main(String[] args){
		int[] dataA = {3,5,10}; //宣言と同時のみの書き方
		double[] nums = {1.1,2.2,3.3};
		boolean[] bools={false,false,true,true};
		String[] strs={"boge","fuga","bar"};
		int[] dataB = new int[] {4,6,10};
		for(int i=0; i<dataA.length; i++){
			System.out.println(dataA[i]);
		}
		//拡張for文(dataBから未読の要素が無くなるまでnに格納)
		for(int n : dataB){
			System.out.println(n);
		}

		for(String s : strs){
			System.out.println(s);
		}
		System.out.println(Arrays.toString(dataA));
	}
}
