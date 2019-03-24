
public class SmartPhone extends Electronic{
	String screenType;
	/**To create an object from the SmartPhone class
	 * @param type	Variable from Items class.
	 * @param price	Variable from Items class.
	 * @param manufacturer	Manufacturer of the SmartPhone object to be created.
	 * @param brand	brand of the SmartPhone object to be created.
	 * @param maxVolt	maxVolt of the SmartPhone object to be created.
	 * @param maxWatt	maxWatt of the SmartPhone object to be created.
	 * @param screenType Screen Type of the SmartPhone object to be created.
	 */
	public SmartPhone(String type, String price, String manufacturer, String brand, String maxVolt, 
			String maxWatt,String screenType) {
		super(type, price, manufacturer, brand, maxVolt, maxWatt);
		this.screenType=screenType;
	}
	public String toString(){
		return("Type: " +this.type+
				"\nItem ID: "+this.itemID+
				"\nPrice: "+Double.parseDouble(this.price)+" $"+
				"\nmanufacturer: "+manufacturer+
				"\nbrand: "+this.brand+
				"\nMax Volt: "+this.maxVolt+" V."+
				"\nMax Watt: "+this.maxWatt+" W."+
				"\nScreen Type: "+this.screenType);
	}
}
