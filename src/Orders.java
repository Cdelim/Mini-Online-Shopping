import java.util.*;
public class Orders {
	double t_Cost;
	String c_ID;
	String Date;
	int purchased_items;
	static ArrayList<Orders> orders=new ArrayList<>();
	/**The customer with the given ID performs the order and items extracted it from the existing item list.
	 * @param c_ID Customer ID
	 * @param t_Cost	Total cost
	 */
	public Orders(String c_ID,double t_Cost){
		this.c_ID=c_ID;
		this.t_Cost=t_Cost;
		Date=(new Date()).toString();
		ArrayList<Items> itemsCopy=new ArrayList<>();
		int j=1;
		for(Customer c:Main.customer2){
			if(c.customerID2==Integer.parseInt(c_ID)){
				this.purchased_items=c.s_Cart.size();
				for(String item:c.s_Cart){
					int i=1;
					itemsCopy=(ArrayList<Items>) Main.items.clone();
					for(Items item2:itemsCopy){
						if(Integer.parseInt(item)==item2.itemID){
							if(Items.itemtypes.get(Items.itemids.indexOf(Integer.parseInt(item))).equals("BOOK")){
								Main.books.remove(item2);
								Main.items.remove(item2);
							}
							if(Items.itemtypes.get(Items.itemids.indexOf(Integer.parseInt(item))).equals("CDDVD")){
								Main.cddvds.remove(item2);
								Main.items.remove(item2);
							}
							if(Items.itemtypes.get(Items.itemids.indexOf(Integer.parseInt(item))).equals("DESKTOP")){
								Main.desktops.remove(item2);
								Main.items.remove(item2);
							}
							if(Items.itemtypes.get(Items.itemids.indexOf(Integer.parseInt(item))).equals("HAIRCARE")){
								Main.haircares.remove(item2);
								Main.items.remove(item2);
							}
							if(Items.itemtypes.get(Items.itemids.indexOf(Integer.parseInt(item))).equals("LAPTOP")){
								Main.laptops.remove(item2);
								Main.items.remove(item2);
							}
							if(Items.itemtypes.get(Items.itemids.indexOf(Integer.parseInt(item))).equals("PERFUME")){
								Main.perfumes.remove(item2);
								Main.items.remove(item2);
							}
							if(Items.itemtypes.get(Items.itemids.indexOf(Integer.parseInt(item))).equals("SKINCARE")){
								Main.skincares.remove(item2);
								Main.items.remove(item2);
							}
							if(Items.itemtypes.get(Items.itemids.indexOf(Integer.parseInt(item))).equals("SMARTPHONE")){
								Main.smartphones.remove(item2);
								Main.items.remove(item2);
							}
							if(Items.itemtypes.get(Items.itemids.indexOf(Integer.parseInt(item))).equals("TABLET")){
								Main.tablets.remove(item2);
								Main.items.remove(item2);
							}
							if(Items.itemtypes.get(Items.itemids.indexOf(Integer.parseInt(item))).equals("TV")){
								Main.tvs.remove(item2);
								Main.items.remove(item2);
							}
							
						}
						else{
							i++;
						}
						if(i>Main.items.size()){
							System.out.println("Invalid item ID");
						}
					}
				}	
			}
			else{
				j++;	
			}
			if (j>Main.customer2.size()){
				System.out.println("No customer with ID number "+c_ID +" exists!");
			}	
		}	
	}
}
