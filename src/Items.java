import java.util.ArrayList;
public class Items {
	/**	Items class has 3 subclass.The names are Cosmetic,Electronic and OfficeSupplies
	 *  
	 */
	String type;
	String price;
	int Stock;
	int itemID;
	static int itemID2=1;
	static ArrayList<Integer> itemids=new ArrayList<Integer>();//All Items Id
	static ArrayList<String> itemtypes=new ArrayList<String>();//All Items types
	/**To create an object from the Items class
	 * @param type	Type of the Items object to be created
	 * @param price	Price of the Items object to be created
	 */
	public Items(String type,String price){
		this.type=type;
		this.price=price;
		itemID=itemID2++;
		itemids.add(itemID);
		itemtypes.add(type);
	}
}
