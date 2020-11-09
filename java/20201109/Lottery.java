public class Lottery{
	public static void main(String[] args){
			int lot=0;
		for(int i=1; i<4; i++){
			int n = new java.util.Random().nextInt(100);
			System.out.println(i+"回目");
			System.out.println(n);
			String st;
			if(n==1){
				lot += 10000000;
				st = "1000万円";
			}else if(n==2 || n==3){
				lot += 1000000;
				st = "100万円";
			}else if(n<=6){
				lot += 100000;
				st = "10万円";
			}else if(n<=10){
				lot += 10000;
				st = "1万円";
			}else if(n<=20){
				lot += 1000;
				st = "1000円";
			}else if(n<40){
				lot += 100;
				st = "100円";
			}else{
				st = "ハズレ";
			}
			System.out.println(st);
		}
		System.out.println("獲得賞金は");
		System.out.printf("%,d円でした！%n",lot);
	}
}
