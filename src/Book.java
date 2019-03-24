/**
 * @author Cem
 *
 */
public class Book extends OfficeSupplies {
	/**	Book class is a subclass of the OfficeSupplies class.
	 *  
	 */
	String publisherName;
	String author;
	String pageNumber;	 
	int BookStock=Main.books.size();
	/**To create an object from the Book class
	 * @param type	Variable from Items class.
	 * @param price	Variable from Items class.
	 * @param releaseDate	Variable from OfficeSupplies class.
	 * @param coverTitle	Variable from OfficeSupplies class.
	 * @param publisherName	Publisher Name of the book object to be created
	 * @param author		The author of the book object to be created
	 * @param pageNumber	Page Number of the book object to be created
	 */
	public Book(String type, String price, String releaseDate, String coverTitle,
			String publisherName,String author,String pageNumber){
		super(type, price, releaseDate, coverTitle);
		this.publisherName=publisherName;
		this.author=author;
		this.pageNumber=pageNumber;
	}
	public String toString(){
		return("Type: " +this.type+
				"\nItem ID: "+this.itemID+
				"\nPrice: "+Double.parseDouble(this.price)+ " $"+
				"\nRelease Date: "+this.releaseDate+
				"\nTitle: "+this.coverTitle+
				"\nPublisher: "+this.publisherName+
				"\nAuthor: "+this.author+
				"\nPage: "+this.pageNumber);
	}
}
