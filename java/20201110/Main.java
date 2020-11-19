import java.util.*;
public class Main {
	public static void main(String[] args) {
		final int GAMES=5;//ゲーム回数
		final int BALLS_NUM=99;//ボールの個数
		/*ボール配列の生成*/
		int[] balls=new int[BALLS_NUM];
		for(int i=0;i<BALLS_NUM;i++){
			balls[i]=i+1;
		}
		/*メインロジック*/
		int aWin=0,bWin=0;//勝数を保持
		/*ゲーム回数分のループ*/
		for(int i=0;i<GAMES;i++){
			System.out.println(i+1+"回戦");
			int ballA=0,ballB=0;//その回何をひいたかを保持する変数(とりあえず0で初期化)
			for(int j=0;j<2;j++){
				//ランダムでボールのindexを決定(範囲が縮まっていく)
				int index=new Random().nextInt(balls.length-(i*2+j));
				int ball=balls[index];//ボール番号決定
				if(j==0){
					ballA=ball;//j==0のときはAのボール
				}else{
					ballB=ball;
				}
				//引いたボールはもう引けないので後ろにもっていく処理
				balls[index]=balls[balls.length-1-(i*2+j)];//後ろのボールをindexの位置へ
				balls[balls.length-1-(i*2+j)]=ball;//後ろの位置へ引いたボール番号を移動
			}
			String winner;
			if(ballA>ballB){
				winner="A";
				aWin++;
			}else{
				winner="B";
				bWin++;
			}
			System.out.printf("A:%d,B:%d…%sの勝ち%n", ballA,ballB,winner);
		}
		System.out.printf("%d対%dで%sの勝ち%n", Math.max(aWin, bWin),Math.min(aWin, bWin),aWin>bWin?"A":"B");
	}
}