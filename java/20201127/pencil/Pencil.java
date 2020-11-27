public class Pencil{
	String color;
	int penLength=5;

	public Pencil(String color){
		this.color=color;
		this.penLength=penLength;
	}
	public void info(String color, int penLength){
		System.out.println("色:"+color);
		for(int i=0; i<penLength; i++){
			System.out.print("+");
		}
		System.out.println(">");
	}
	public void write(String color){
		System.out.println(color+"で書いた！");
		penLength--;
	}
}
