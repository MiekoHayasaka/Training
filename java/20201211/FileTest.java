import java.io.*;
import java.util.*;
public class FileTest{
	public static void main(String[] args) throws Exception{
		FileInputStream fis=new FileInputStream("data.csv");
		InputStreamReader isr=new InputStreamReader(fis,"utf-8");
		BufferedReader br=new BufferedReader(isr);
		String line;
		Map<List<String>,Integer> map=new HashMap<>();
		System.out.println("csvデータ");
		System.out.println("-------------");
		while((line=br.readLine()) != null){
			System.out.println(line);
			String[] s=line.split(",");
			List<String> l=new ArrayList<>();
			l.add(s[0]);
			l.add(s[1]);
		//	map.put(l,s[2]);
		}
		System.out.println();
		br.close();
	}
}
