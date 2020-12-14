import java.io.*;
import java.util.*;
public class Lesson2{
	public static void main(String[] args){
		FileWriter fw=null;
		try{
			fw = new FileWriter("data.txt");
			fw.write("hello!");
		}catch(Exception e){
			System.out.println("何らかの例外が発生しました");
		}finally{
			if(fw !=null){
				try{
					fw.close();
				}catch(IOException e){
					;
				}
			}
		}
	}
}
