import java.util.*;
public class SetLesson2{
	public static void main(String[] args){
		Set<String> colors=new HashSet<>();
		colors.add("赤");
		colors.add("青");
		colors.add("黄");
		colors.add("青");
		colors.add("緑");
		colors.add("緑");
		colors.add("黒");
		colors.add("白");
		colors.add("青");
		colors.add("ピンク");
		colors.add("黄緑");
		colors.add("白");
		System.out.println("色は"+colors.size()+"種類");
		if(colors.contains("黒")){
			System.out.println("黒を含みます");
		}
	}
}
