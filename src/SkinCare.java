
public class SkinCare extends Cosmetic{
	String babySensitive;
	/**To create an object from the SkinCare class
	 * @param type	Variable from Items class.
	 * @param price	Variable from Items class.
	 * @param manufacturer	Manufacturer of the SkinCare object to be created.
	 * @param brand	Brand of the SkinCare object to be created.
	 * @param isOrganic		Indicates whether or not the object is organic.
	 * @param expirationYear	Expiration Year of the SkinCare object to be created.
	 * @param weight	Weight of the SkinCare object to be created.
	 * @param babySensitive	It shows object have baby sensitive or haven't
	 */
	public SkinCare(String type, String price, String manufacturer, String brand, String isOrganic,
			String expirationYear, String weight,String babySensitive) {
		super(type, price, manufacturer, brand, isOrganic, expirationYear, weight);
		if(babySensitive.equals("0")){
			this.babySensitive="No";
		}
		else if(babySensitive.equals("1")){
			this.babySensitive="Yes";
		}
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
				"\nlastingDuration: "+this.babySensitive);
	}
}
