public class Book2 extends TangibleAsset{
	String isbn;
	public Book2(String name,int price,String color,String isbn){
		super(name,price,color);
		this.isbn=isbn;
	}
	public Stirng getIsbn(){
		return this.isbn;
	}
}
