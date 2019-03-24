
public class Tablet extends Computer{
	/**Tablet class is a subclass of the Computer class
	 * 
	 */
	String dimension;
	/**To create an object from the Tablet class.
	 * @param type	Variable from Items class.
	 * @param price	Variable from Items class.
	 * @param manufacturer	Variable from Electronic class.
	 * @param brand	Variable from Electronic class.
	 * @param maxVolt	Variable from Electronic class.
	 * @param maxWatt	Variable from Electronic class.
	 * @param operatingSystem	Operating System of the Tablet object to be created.
	 * @param CPUType	Cpu Type of the Tablet object to be created.
	 * @param ramCapacity	Ram Capacity of the Tablet object to be created.
	 * @param HDDCapacity	HDD Capacity of the Tablet object to be created.
	 * @param dimension	Dimension of the Tablet object to be created.
	 */
	public Tablet(String type, String price, String manufacturer, String brand, String maxVolt, String maxWatt,
			String operatingSystem, String CPUType, String ramCapacity, String HDDCapacity,String dimension) {
		super(type, price, manufacturer, brand, maxVolt, maxWatt, operatingSystem, CPUType, ramCapacity, HDDCapacity);
		this.dimension=dimension;
	}
	public String toString(){
		return("Type: " +this.type+
				"\nItem ID: "+this.itemID+
				"\nPrice: "+Double.parseDouble(this.price)+" $"+
				"\nmanufacturer: "+manufacturer+
				"\nbrand: "+this.brand+
				"\nMax Volt: "+this.maxVolt+" V."+
				"\nMax Watt: "+this.maxWatt+" W."+
				"\nOperating System: "+this.operatingSystem+
				"\nCPU Type: "+this.CPUType+
				"\nRam Capacity: "+this.ramCapacity+
				"\nHDD Capactiy:"+this.HDDCapacity+
				"\nDimension: "+this.dimension);
	}
	
}
