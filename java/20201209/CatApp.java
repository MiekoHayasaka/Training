import java.util.*;
public class CatApp{
	public static void main(String[] args){
		ArrayList<Cat> list=new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("***Cat Collection***");
		while(true){
			System.out.print("1.Collect 2.Play 3.End＞");
			int select =sc.nextInt();sc.nextLine();
			switch(select){
				case 1:
					Cat c = new Cat();
					c.Appeare();
					System.out.print("Please name this cat>");
					String name=sc.nextLine();
					c.setName(name);
					System.out.println(c.getName()+" joined!");
					list.add(c);
					break;
				case 2:
					if(list.size()==0){
						System.out.println("You do not have anyone to play with.");
					}else{
						for(int i=0;i<list.size();i++){
							for(int j=i+1;j<list.size();j++){
								if(list.get(i).intimacy<list.get(j).intimacy){
									Cat temp=list.get(i);
									list.set(i,list.get(j));
									list.set(j,temp);
								}
							}
						}
						for(int i=0;i<list.size();i++){
							System.out.println(i+list.get(i).toString());
						}
						System.out.print("Who do you play with?>");
						int select1 =sc.nextInt();
						list.get(select1).play();
					}
					break;
				default:
					System.out.println("Game over");
					return;
			}
		}
	}
}
