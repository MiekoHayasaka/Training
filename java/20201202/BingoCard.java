import java.util.*;
public class BingoCard{
	public static void main(String[] args){
		final int WIDTH = 5;
		int[][] card=makeCard(WIDTH);
		//showCard(card);
		bingo(card);
	}
	static int[][] makeCard(int width){
		Random rand=new Random();
		int[][] card=new int[width][width];
		for(int i=0;i<width;i++){
			for(int j=0;j<width;j++){
				card[i][j]=rand.nextInt(99)+1;
			}
		}
		card[2][2]=0;
		return card;
	}
	static void showCard(int[][] card){
		String str="";
		for(int i=0;i<card.length;i++){
			for(int j=0;j<card[i].length;j++){
				if(card[i][j]==0){
					//0を@@に変換
				}else{
					System.out.printf("%3d",card[i][j]);
				}
			}
			System.out.println();
		}
	}
	static boolean isSame(int[] line){
		boolean isSame=true;
		int first=line[0];
		for(int i=1;i<line.length;i++){
			if(first != line[i]){
				isSame=false;
				break;
			}
		}
		return isSame;
	}
		static int[][] horizontalLines(int[][] card){
		int[][] lines=new int[card.length][card.length];
		for(int i=0;i<card.length;i++){
			for(int j=0;j<card[i].length;j++){
				lines[i][j]=card[i][j];
			}
		}
		return lines;
	}
	static int[][] verticalLines(int[][] card){
		int[][] lines=new int[card.length][card.length];
		for(int i=0;i<card.length;i++){
			for(int j=0;j<card[i].length;j++){
				lines[i][j]=card[j][i];
			}
		}
		return lines;
	}
	static int[][] crossLines(int[][] card){
		int[][] lines=new int[2][card.length];
		for(int i=0;i<lines.length;i++){
			for(int j=0;j<card.length;j++){
				if(i==0){
					lines[i][j]=card[j][j];
				}else{
					lines[i][j]=card[j][card.length-1-j];
				}
			}
		}
		return lines;
	}

	static int bingo(int[][] card){
		Random rand=new Random();
		int count=0;
		while(count>3){
			count++;
			int boll = rand.nextInt(99)+1;
			for(int i=0;i<card.length;i++){
				for(int j=0;j<card[i].length;j++){
					if(card[i][j] == num){
						card[i][j] = 0;
						//card[i][j] = String.valueOf("@@");
					}
				}
			}
			if(false){
				System.out.printf("%d!(%d回目):BINGO!!%n",boll,count);
			}else{
				System.out.printf("%d!(%d回目)%n",boll,count);
				showCard(card);
			}
		}
	}
}
