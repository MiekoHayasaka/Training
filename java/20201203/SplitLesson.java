import java.util.*;
public class SplitLesson{
	public static void main(String[] args){
		String str="りんご,ミカン,ばなな";
		String[] data=str.split(","); //CSVデータ
		System.out.println(Arrays.toString(data));
	}
}
