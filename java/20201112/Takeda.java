import java.util.*;
public class Takeda{
	public static void main(String[] args){
		int[] numsA = new int[10];
		int[] numsB = new int[10];
		for(int i=0; i<2; i++){
			for(int j=0; j<10; j++){
				if(i==0){
					numsA[j] = new Random().nextInt(5)+1;
				}else{
					numsB[j] = new Random().nextInt(5)+1;
				}
			}
		}
		System.out.println(Arrays.toString(numsA));
		System.out.println(Arrays.toString(numsB));
		int count=0;
		int[] index = new int[10];
		for(int i=0; i<10; i++){
			if(numsA[i] == numsB[i]){
				count++;
/*				for(int j=0; j<count; j++){
					index[j] = i;
				}
*/
				System.out.print("["+i+"],");
			}
		}
		if(count==0){
			System.out.println("一致するindexはありませんでした。");
		}else{
			System.out.println("の合計"+count+"つが一致しています。");
		}
/*		for(int i=0; i<count; i++){
			System.out.println("index["+index[i]+"]:"+numsA[index[i]]);
		}
*/
	}
}
