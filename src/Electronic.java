
public class Electronic extends Items{
	/**Electronic class is a subclass of the Items class.It has 3 subclass.
	 * The names are Computer,Tv,SmartPhone
	 */
	String manufacturer;
	String brand;
	String maxVolt;
	String maxWatt;
	/**To create an object from the Electronic class
	 * @param type	Variable from Items class.
	 * @param price	Variable from Items class.
	 * @param manufacturer	Manufacturer of the Electronic object to be created.
	 * @param brand	brand of the Electronic object to be created.
	 * @param maxVolt	maxVolt of the Electronic object to be created.
	 * @param maxWatt	maxWatt of the Electronic object to be created.
	 */
	public Electronic(String type, String price,String manufacturer,String brand,String maxVolt,String maxWatt){
		super(type, price);
		this.manufacturer=manufacturer;
		this.brand=brand;
		this.maxVolt=maxVolt;
		this.maxWatt=maxWatt;
	}

}
