import java.util.*;
public class MapTest2{
	public static void main(String[] args){
		Map<String,String> map=new HashMap<>();
		map.put("月", "Lunes(ルネス)");
		map.put("火", "Martes(マルテス)");
		map.put("水", "Miercoles(ミエルコレス)");
		map.put("木", "Jueves(フエベス)");
		map.put("金", "Viernes(ビエルネス)");
		map.put("土", "Sabado(サバド)");
		map.put("日", "Domingo(ドミンゴ)");

		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.print("調べたいスペイン語の曜日を入力してください。>");
			String key=sc.next();
			if(map.containsKey(key)){
				System.out.println(key+":"+map.get(key));
			}else{
				System.out.println("アプリケーションを終了します。");
				return;
			}
		}
	}
}
