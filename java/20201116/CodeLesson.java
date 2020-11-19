import java.util.*;
public class CodeLesson{
	public static void main(String[] args){
		int[][] scores =new int[3][4]; 
		for(int i=0; i<3; i++){
			for(int j=0; j<4; j++){
				int nms = new Random().nextInt(100)+1;
				scores[i][j] = nms;
				System.out.printf("%4d",scores[i][j]);
			}
			System.out.println();
		}
	}
}
