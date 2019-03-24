import java.util.ArrayList;

public class Customer extends Person {
	/**Customer class is a subclass of the Person class.
	 * 
	 */
	String password;
	double balance;
	String status="CLASSIC";
	static int customerID=1; 
	int customerID2;//Variable of each Customer objects customer ID
	double s_Money = 0;
	ArrayList<String> s_Cart = new ArrayList<String>() ;//Shopping Cart
	ArrayList<String> orderHistory = new ArrayList<String>() ;
	/**
	 * @param name
	 * @param e_mail
	 * @param Date_of_Birth
	 * @param balance
	 * @param password
	 */
	public Customer(String name, String e_mail, String Date_of_Birth,double balance,String password) {
		super(name, e_mail, Date_of_Birth);
		this.balance=balance;
		this.password=password;
		customerID2=customerID++;
	}
	/**Allows customers to adjust their status
	 * 
	 */
	public void statusCustomer(){
		if(s_Money>=1000 && s_Money<5000){
			this.status="SILVER";
		}
		else if(s_Money>=5000){
			this.status="GOLDEN";
		}
		else{
			this.status="CLASSIC";
		}
		
	}

	/** the customer to change the password
	 * @param c_ID	Customer ID
	 * @param pw1	Old password
	 * @param pw2	New password
	 */
	public static void CHPASS(int c_ID,String pw1,String pw2){
		int i=1;
		for(Customer qwe:Main.customer2){		
			if(qwe.customerID2==c_ID){
				if(pw1.equals(qwe.password)){
					qwe.password=pw2;
					System.out.println("The password has been successfully changed.");
				}
				else{
					System.out.println("The given password does not match the current password. Please try again.");
				}	
			}
			else{
				i++;	
			}
			if (i>Main.customer2.size()){
				System.out.println("No customer with ID number "+c_ID +" exists!");
			}
		}	
	}
	/**Loads money on the customer's balance
	 * @param c_ID	Customer ID
	 * @param money	Amount of money to be loaded
	 */
	public static void DEPOSITMONEY(int c_ID,double money){
		int i=1;
		for(Customer qwe:Main.customer2){		
			if(qwe.customerID2==c_ID){
				qwe.balance+=money;			
			}	
			else{
				i++;	
			}
			if (i>Main.customer2.size()){
				System.out.println("No customer with ID number "+c_ID +" exists!");
			}
		}	
	}
	/**It shows Active campaigns
	 * @param c_ID	Customer ID
	 */
	public static void SHOWCAMPAIGNS(int c_ID){
		int i=1;
		for(Customer qwe:Main.customer2){		
			if(qwe.customerID2==c_ID){
				if(Campaign.Campaigns.size()!=0){
					System.out.println("Active campaigns: ");
					for(Campaign cmpg:Campaign.Campaigns){					
					System.out.println(cmpg.toString());
					}
				}
				else{
					System.out.println("No campaign has been created so far!");
				}
			}	
			else{
				i++;	
			}
			if (i>Main.customer2.size()){
				System.out.println("No customer with ID number "+c_ID +" exists!");
			}
		}	
	}
	/**Adds the given item ID itemi to the card of the given customer ID
	 * @param c_ID Customer ID
	 * @param itemID	Customer ID
	 */
	public static  void ADDTOCART(int c_ID,String itemID){
		int i=1;
		for(Customer qwe:Main.customer2){		
			if(qwe.customerID2==c_ID){
				if(Items.itemids.contains(Integer.parseInt(itemID))){
					qwe.s_Cart.add(itemID);
				System.out.println("The item "+ Items.itemtypes.get(Items.itemids.indexOf(Integer.parseInt(itemID))) +" has been successfully added to your cart.");
			
				}
				else{
					System.out.println("Invalid item ID");
				}
			}	
			else{
				i++;	
			}
			if (i>Main.customer2.size()){
				System.out.println("No customer with ID number "+c_ID +" exists!");
			}
		}	
	}
	/**Empty the given customer ID's card
	 * @param c_ID Customer ID
	 */
	public static  void	EMPTYCART(int c_ID){
		int i=1;
		for(Customer qwe:Main.customer2){		
			if(qwe.customerID2==c_ID){
				qwe.s_Cart.clear();
				System.out.println("The cart has been emptied.");
			}
			else{
				i++;	
			}
			if (i>Main.customer2.size()){
				System.out.println("No customer with ID number "+c_ID +" exists!");
			}
		}	
	}
	/**If the password matches the given ID and there is enough balance, order it
	 * @param c_ID	Customer ID
	 * @param pw	password
	 */
	public static void ORDER(String c_ID,String pw){
		int i=1;	
		ArrayList<String> s_Cartcopy=new ArrayList<>();
		for(Customer qwe:Main.customer2){		
			if(qwe.customerID2==Integer.parseInt(c_ID)){
				if(qwe.password.equals(pw)){
					s_Cartcopy=(ArrayList<String>) qwe.s_Cart.clone();
					if(s_Cartcopy.size()!=0){
						double cost=0;
						for(String item:s_Cartcopy){
							for(Items item2:Main.items){
								if(item2.itemID==Integer.parseInt(item)){
									double itemcost=Double.parseDouble(item2.price);
									if(qwe.status.equals("CLASSIC")){
										cost+= itemcost;
									}
									if(qwe.status.equals("SILVER")){
										cost+=itemcost-(itemcost*(10/100));
									}
									if(qwe.status.equals("SILVER")){
										cost+=itemcost-(itemcost*(15/100));
									}
									}
								}
						}
							if(cost<=qwe.balance){
								qwe.balance=qwe.balance-cost;
								qwe.s_Money=qwe.s_Money+cost;
								Orders asd=new Orders(Integer.toString(qwe.customerID2),cost);
								Orders.orders.add(asd);
								Customer.EMPTYCART(Integer.parseInt(c_ID));
								System.out.println("Done! Your order will be delivered as soon as possible. Thank you!");
								if(qwe.s_Money<1000){
									qwe.status="CLASSIC";
									System.out.println("You need to spend "+(1000-qwe.s_Money)+" more TL to become a SILVER MEMBER.");
								}
								else if(qwe.s_Money>=1000 && qwe.s_Money<5000){
									if(qwe.status.equals("SILVER")){
										continue;
									}
									else{
										qwe.status="SILVER";
										System.out.println("Congratulations! You have been upgraded to a SILVER MEMBER! You have earned a discount of 10% on all purchases.");
										System.out.println("You need to spend "+(5000-qwe.s_Money)+" more TL to become a GOLDEN MEMBER.");
									}	
								}
								else if(qwe.s_Money>=5000){
									if(qwe.status.equals("GOLDEN")){
										continue;
									}
									else{
									qwe.status="GOLDEN";
									System.out.println("Congratulations! You have been upgraded to a GOLDEN MEMBER! You have earned a discount of 15% on all purchases.");
									}
								}
							}
							else if(qwe.balance<cost){
								System.out.println("Order could not be placed. Insufficient funds.");
							}
									
						
					}
					else{
						System.out.println("You should add some items to your cart before order request");
					}
				}		
				else{
						System.out.println("Order could not be placed. Invalid password.");
				}
			}
			else{
				i++;	
			}
			if (i>Main.customer2.size()){
				System.out.println("No customer with ID number "+c_ID +" exists!");
			}	
		}
	}
}

