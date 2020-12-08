import java.util.*;
public class SlimeApp{
	public static void main(String[] args){
		ArrayList<String> names=new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		Slime s=new Slime();
		while(true){
			int select;
			System.out.print("スライムを追加する？(1…yes,2…no):");
			select =sc.nextInt();
			if(select == 1){
				System.out.print("追加するスライムの名前を決めてね:");
				String str=sc.next();
				names.add(str);
				System.out.println(str+"が現れた！！");
			}else{
				for(int i=0;i<names.size();i++){
					s.attack(names.get(i));
				}
				return;
			}
		}
	}
}
