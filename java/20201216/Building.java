public class Building{
	int width;

	public Building(int width){
		this.width=width;
	}

	public void display(){
		for(int i=0;i<this.width;i++){
			for(int j=0;j<this.width;j++){
				System.out.print("#");
			}
			System.out.println();
		}
	}

	static void displayAll(List<Building> list){
		for(Building b:list){
			b.display();
		}
	}
}

