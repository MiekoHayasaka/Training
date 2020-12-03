public class SplitTest{
	public static void main(String[] args){
/*		if(args.length > 0){
			String str=args[0];
			String[] data=str.split(",");
			System.out.println(Arrays.toString(data));
			int sum=0;
			for(String s:data){
				sum+=Integer.parseInt(s);
			}
			System.out.println("合計は"+sum+"です");
		}
*/
		String str="3,5,1,4,6,3,6";
		String[] strs=str.split(",");
		int sum=0;
		for(int i=0;i<strs.length;i++){
			sum += Integer.parseInt(strs[i]);
		}
		System.out.printf("引数の合計は%dです",sum);
	}
}
