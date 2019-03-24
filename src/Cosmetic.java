
public class Cosmetic extends Items{
	/**Cosmetic class is a subclass of the Items class.It has 3 subclass.
	 * The names are HairCare,Perfume and SkinCare.
	 */
	String manufacturer;
	String brand;
	String isOrganic;
	String expirationYear;
	String weight;	
	/**To create an object from the Cosmetic class
	 * @param type	Variable from Items class.
	 * @param price	Variable from Items class.
	 * @param manufacturer	Manufacturer of the Cosmetic object to be created.
	 * @param brand	Brand of the Cosmetic object to be created.
	 * @param isOrganic		Indicates whether or not the object is organic.
	 * @param expirationYear	Expiration Year of the Cosmetic object to be created.
	 * @param weight	Weight of the Cosmetic object to be created.
	 */
	public Cosmetic(String type, String price,String manufacturer,String brand,
			String isOrganic,String expirationYear,String weight) {
		super(type, price);
		this.manufacturer=manufacturer;
		this.brand=brand;
		this.expirationYear=expirationYear;
		this.weight=weight;
		if(isOrganic.equals("0")){
			this.isOrganic="No";
		}
		else if(isOrganic.equals("1")){
			this.isOrganic="Yes";
		}
	}
}
