
public class Desktop extends Computer{
	String boxColor;
	int DesktopStock; //Desktop's stock keeping.
	static int DesktopStock2=1;
	/**To create an object from the Computer class
	 * @param type	Variable from Items class.
	 * @param price	Variable from Items class
	 * @param manufacturer	Variable from Electronic class
	 * @param brand	Variable from Electronic class
	 * @param maxVolt	Variable from Electronic class
	 * @param maxWatt	Variable from Electronic class
	 * @param operatingSystem	Variable from Computer class
	 * @param CPUType	Variable from Computer class
	 * @param ramCapacity	Variable from Computer class
	 * @param HDDCapacity	Variable from Computer class
	 * @param boxColor	Box Color of the Desktop object to be created
	 */
	public Desktop(String type, String price, String manufacturer, String brand, String maxVolt, String maxWatt,
			String operatingSystem, String CPUType, String ramCapacity, String HDDCapacity,String boxColor) {
		super(type, price, manufacturer, brand, maxVolt, maxWatt, operatingSystem, CPUType, ramCapacity, HDDCapacity);
		this.boxColor=boxColor;
		DesktopStock=DesktopStock2++;
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
				"\nBox Color: "+this.boxColor);
	}
}
