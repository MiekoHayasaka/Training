import java.util.*;
public class ArrLesson5{
	public static void main(String[] args){
		System.out.println("--掛け算表--");
		System.out.print("n(1~9)?>");
		int num = new Scanner(System.in).nextInt();
		int[][] kuku = new int[num][9];
		for(int i=0; i<kuku.length; i++){
			for(int j=0; j<9; j++){
				kuku[i][j]=(i+1)*(j+1);
			}
		}
		for(int i=0; i<kuku.length; i++){
			for(int j=0; j<9; j++){
				if(j != 8){
					System.out.printf("%2d|",kuku[i][j]);
				}else{
					System.out.printf("%2d",kuku[i][j]);
				}
			}
			System.out.println();
		}
	}
}
