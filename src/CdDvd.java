/**
 * @author Cem
 *
 */
public class CdDvd extends OfficeSupplies{
	/**CdDvd class is a subclass of the OfficeSupplies class.
	 * 
	 */
	String composerName;
	String songName;
	/**To create an object from the CdDvd class
	 * @param type	Variable from Items class.
	 * @param price	Variable from Items class.
	 * @param releaseDate	Variable from OfficeSupplies class.
	 * @param coverTitle	Variable from OfficeSupplies class.
	 * @param composerName	Composer Name of the book object to be created.
	 * @param songName		Song Name of the book object to be created.The song name can be more than one.This variable holds all of them.
	 */
	public CdDvd(String type, String price, String releaseDate, String coverTitle,String composerName,
			 String songName) {
		super(type, price, releaseDate, coverTitle);
		this.composerName=composerName;
		this.songName=songName;
	}
	public String toString(){
		return("Type: " +this.type+
				"\nItem ID: "+this.itemID+
				"\nPrice: "+Double.parseDouble(this.price)+" $"+
				"\nRelease Date: "+this.releaseDate+
				"\ncovertitle: "+this.coverTitle+
				"\ncomposerName: "+this.composerName+
				"\nsongName: "+this.songName);
	}

}
