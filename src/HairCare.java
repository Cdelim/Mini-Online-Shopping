
public class HairCare extends Cosmetic{
	/**HairCare class is a subclass of the Cosmetic class..
	 * 
	 */
	String isMedicated;
	/**To create an object from the Cosmetic class
	 * @param type	Variable from Items class.
	 * @param price	Variable from Items class.
	 * @param manufacturer	Manufacturer of the Cosmetic object to be created.
	 * @param brand	Brand of the Cosmetic object to be created.
	 * @param isOrganic		Indicates whether or not the object is organic.
	 * @param expirationYear	Expiration Year of the Cosmetic object to be created.
	 * @param weight	Weight of the Cosmetic object to be created.
	 * @param isMedicated Indicates whether or not the object is medicated.
	 */
	public HairCare(String type, String price, String manufacturer, String brand, String isOrganic,
			String expirationYear, String weight,String isMedicated) {
		super(type, price, manufacturer, brand, isOrganic, expirationYear, weight);
		if(isMedicated.equals("0")){
			this.isMedicated="No";
		}
		else if(isMedicated.equals("1")){
			this.isMedicated="Yes";
		}
	}
	public String toString(){
		return("Type: " +this.type+
				"\nItem ID: "+this.itemID+
				"\nPrice: "+Double.parseDouble(this.price)+" $"+
				"\nmanufacturer: "+this.manufacturer+
				"\nbrand: "+this.brand+
				"\nisOrganic: "+this.isOrganic+
				"\nexpirationYear: "+this.expirationYear+
				"\nweight: "+this.weight+
				"\nisMedicated: "+this.isMedicated);
	}

}
