import java.util.*;
public class MapTest5{
	public static void main(String[] args){
		Map<Integer,Integer> map=new LinkedHashMap<>();
		Map<Integer,Integer> map2=new LinkedHashMap<>();
		for(int i=1;i<=6;i++){
			map.put(i,0);
		}
		final int COST=300;
		int count=0;
		int average=0;
		Random rand=new Random();
		for(int i=0;i<500;i++){
			while(map.containsValue(0)){
				int num=rand.nextInt(6)+1;
				map.put(num,map.get(num)+1);
				count++;
			}
				
		}
	}
}
