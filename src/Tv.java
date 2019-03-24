
public class Tv extends Electronic{
	String screenSize;
	/**To create an object from the Tv class
	 * @param type	Variable from Items class.
	 * @param price	Variable from Items class.
	 * @param manufacturer	Manufacturer of the Tv object to be created.
	 * @param brand	brand of the Tv object to be created.
	 * @param maxVolt	maxVolt of the Tv object to be created.
	 * @param maxWatt	maxWatt of the Tv object to be created.
	 * @param screenSize	Screen Size of the Tv object to be created.
	 */
	public Tv(String type, String price, String manufacturer, String brand, String maxVolt, 
			String maxWatt,String screenSize) {
		super(type, price, manufacturer, brand, maxVolt, maxWatt);
		this.screenSize=screenSize;
	}
	public String toString(){
		return("Type: " +this.type+
				"\nItem ID: "+this.itemID+
				"\nPrice: "+Double.parseDouble(this.price)+" $"+
				"\nmanufacturer: "+manufacturer+
				"\nbrand: "+this.brand+
				"\nMax Volt: "+this.maxVolt+" V."+
				"\nMax Watt: "+this.maxWatt+" W."+
				"\nScreen Size: "+this.screenSize);
	}
}
