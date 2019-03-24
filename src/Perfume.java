
public class Perfume extends Cosmetic{
	String lastingDuration;
	/**To create an object from the Cosmetic class
	 * @param type	Variable from Items class.
	 * @param price	Variable from Items class.
	 * @param manufacturer	Manufacturer of the Perfume object to be created.
	 * @param brand	Brand of the Perfume object to be created.
	 * @param isOrganic		Indicates whether or not the object is organic.
	 * @param expirationYear	Expiration Year of the Perfume object to be created.
	 * @param weight	Weight of the Perfume object to be created.
	 * @param lastingDuration Lasting Duration of the Perfume.
	 */
	public Perfume(String type, String price, String manufacturer, String brand, String isOrganic,
			String expirationYear, String weight,String lastingDuration) {
		super(type, price, manufacturer, brand, isOrganic, expirationYear, weight);
		this.lastingDuration=lastingDuration;
	}
	public String toString(){
		return("Type: " +this.type+
				"\nItem ID: "+this.itemID+
				"\nPrice: "+Double.parseDouble(this.price)+" $"+
				"\nmanufacturer: "+manufacturer+
				"\nbrand: "+this.brand+
				"\nisOrganic: "+this.isOrganic+
				"\nexpirationYear: "+this.expirationYear+
				"\nweight: "+this.weight+
				"\nlastingDuration: "+this.lastingDuration);
	}
}
