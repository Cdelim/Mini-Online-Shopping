
public class OfficeSupplies extends Items{
	String releaseDate;
	String coverTitle;
	/**To create an object from the OfficeSupplies class
	 * @param type	Type of the OfficeSupplies object to be created.
	 * @param price	Price of the OfficeSupplies object to be created.
	 * @param releaseDate Release Date of the OfficeSupplies object to be created.
	 * @param coverTitle	Cover Tittle of the OfficeSupplies object to be created.
	 */
	public OfficeSupplies(String type, String price,String releaseDate,
	String coverTitle) {
		super(type, price);
		this.releaseDate=releaseDate;
		this.coverTitle=coverTitle;
	}
}
