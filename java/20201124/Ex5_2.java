public class Ex5_2{
	public static void main(String[] args){
		String title="要確認";
		String address="haya@gmail.com";
		String text="以下の内容をご確認ください。";
		email(title,address,text);
		email(address,text);
	}
	static void email(String title, String address, String text){
		System.out.println(address+"に、以下のメールを送信しました");
		System.out.println("件名:"+title);
		System.out.println("メールの本文:"+text);
	}
	static void email(String address, String text){
		System.out.println(address+"に、以下のメールを送信しました");
		System.out.println("件名:無題");
		System.out.println("メールの本文:"+text);
	}
}
