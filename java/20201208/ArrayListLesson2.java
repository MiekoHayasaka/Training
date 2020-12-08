import java.util.*;
public class ArrayListLesson2{
	public static void main(String[] args){
		ArrayList<Integer> list=new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		while(true){
			int select;
			System.out.print("要素追加するよ数字を入れてね(0で終了):");
			select =sc.nextInt();
			if(select == 0){
				System.out.println("--結果--");
				System.out.println("要素数:"+list.size());
				System.out.print("要素:");
				for(int i=0;i<list.size();i++){
					System.out.print(list.get(i)+",");
				}
				return;
			}else{
				list.add(select);
				System.out.println(select+"をListに追加したよ！");
			}
		}
	}
}
