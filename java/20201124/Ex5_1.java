public class Ex5_1{
	public static void main(String[] args){
		introduceOneself();
	}
	static void introduceOneself(){
		String name="早坂";
		int age=25;
		double height=158.2;
		char zodiac='巳';
		System.out.printf("%s(%d),身長:%.1f,十二支:%s%n",name,age,height,zodiac);
	}
}
