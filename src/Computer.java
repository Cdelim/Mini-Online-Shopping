
public class Computer extends Electronic {
	/**Computer class is a subclass of the Electronic class.It has 3 subclass.
	 * The names are Desktop,Laptop and Tablet.
	 */
	String operatingSystem;
	String CPUType;
	String ramCapacity;
	String HDDCapacity;
	/**To create an object from the Computer class
	 * @param type	Variable from Items class.
	 * @param price	Variable from Items class
	 * @param manufacturer	Variable from Electronic class
	 * @param brand	Variable from Electronic class
	 * @param maxVolt	Variable from Electronic class
	 * @param maxWatt	Variable from Electronic class
	 * @param operatingSystem	Operating System of the Computer object to be created
	 * @param CPUType	Cpu Type of the Computer object to be created
	 * @param ramCapacity	Ram Capacity of the Computer object to be created
	 * @param HDDCapacity	HDD Capacity of the Computer object to be created
	 */
	public Computer(String type, String price, String manufacturer, String brand,String maxVolt, 
			String maxWatt,String operatingSystem,String CPUType,String ramCapacity,String HDDCapacity) {
		super(type, price, manufacturer, brand, maxVolt, maxWatt);
		this.operatingSystem=operatingSystem;
		this.CPUType=CPUType;
		this.ramCapacity=ramCapacity;
		this.HDDCapacity=HDDCapacity;
	}

}
