import java.text.ParseException;
import java.text.SimpleDateFormat;
/**
 * @author Cem 
 *
 */
public class Admin extends Employee{
	/**The Admin class is a subclass of the Employees class.
	 * 
	 */
	String password;
	/** To create an object from the Admin class
	 * @param name	Variable from Person class.
	 * @param e_mail	Variable from Person class.
	 * @param Date_of_Birth	Variable from Person class.
	 * @param salary	Variable from Employee class.
	 * @param password Create variables for each Admin object's password.
	 */
	public Admin(String name, String e_mail, String Date_of_Birth,String salary, String password) {
		super(name, e_mail, Date_of_Birth,salary);
		this.password=password;
	}
	/**If there is an admin with the given admin name,Create an object from the customer class according to the given parameters and assign it to a list of customer type
	 * @param adname	To check if the entered name is admin name
	 * @param n_customer	Name of the customer to be added
	 * @param e_customer	E-mail of the customer to be added
	 * @param dob_customer	Date of Birth of the customer to be added
	 * @param b_customer	Balance of the customer to be added
	 * @param pw_customer	Password of the customer to be added
	 */
	public static void ADDCUSTOMER(String adname,String n_customer,String e_customer,String dob_customer,double b_customer,String pw_customer){
		if(Main.admin.contains(adname)){
			Customer newcustomer=new Customer(n_customer, e_customer, dob_customer, b_customer, pw_customer);
			Main.customer2.add(newcustomer);
			Main.customer.add(n_customer);		
		}
		else{
			System.out.println("No admin person named " +adname+" exists!");
		}
	}
	/**If the given admin name is admin and if there is a given number of customers, the information of the customer is printed on the screen
	 * @param adname	To check if the entered name is admin name
	 * @param c_ID		The ID of the customer to be displayed
	 * @throws ParseException	To convert the given date to the desired date
	 */
	public static void SHOWCUSTOMER(String adname,int c_ID) throws ParseException{
		if(Main.admin.contains(adname)){
			int i=1;
			for(Customer qwe:Main.customer2){		
				if(qwe.customerID2==c_ID){
					System.out.println("Customer name: "+qwe.name+ " ID: "+qwe.customerID2 + " e-mail: "+qwe.e_mail+" Date of Birth: "+(new SimpleDateFormat("dd.MM.yyyy").parse(qwe.Date_of_Birth))+" Status:"+qwe.status);
				}
				else{
					i++;	
				}
				if (i>Main.customer2.size()){
					System.out.println("No customer with ID number "+c_ID +" exists!");
				}
			}
		}
		else{
			System.out.println("No admin person named " +adname+" exists!");
		}
	}
	/**If the given admin name is admin prints on screen with all customers information
	 * @param adname	To check if the entered name is admin name
	 * @throws ParseException	To convert the given date to the desired date
	 */
	public static void SHOWCUSTOMERS(String adname) throws ParseException{
		if(Main.admin.contains(adname)){
			for(int i=0;i<Main.customer2.size();i++){
				System.out.println("Customer name: "+Main.customer2.get(i).name+ " ID: "+Main.customer2.get(i).customerID2 + " e-mail: "+Main.customer2.get(i).e_mail+" Date of Birth: "+(new SimpleDateFormat("dd.MM.yyyy").parse(Main.customer2.get(i).Date_of_Birth))+" Status:"+Main.customer2.get(i).status);
			}
		}
		else{
			System.out.println("No admin person named " +adname+" exists!");
		}
	}
	/**If the given admin name is admin, prints on screen with admin information
	 * @param adname To check if the entered name is admin name
	 */
	public static  void SHOWADMININFO(String adname){
		if(Main.admin.contains(adname)){
			int i = Main.admin.indexOf(adname);
			System.out.println("-------Admin info------");
			System.out.println("Admin name: "+ Main.admin.get(i));
			System.out.println("Admin e-mail: "+Main.admin.get(i+1));
			System.out.println("Admin date of birth: "+Main.admin.get(i+2));
		}
		else{
			System.out.println("No admin person named " +adname+" exists!");
		}
	}
	/**If the given name is an admin name it will launch a new campaign.Campaign discount rate can not be more than 50%.
	 * @param adname To check if the entered name is admin name
	 * @param startDate	Campaign start date
	 * @param endDate	Campaign end date
	 * @param itemType	What type of item the campaign will be
	 * @param rate		Discount rate of the campaign
	 */
	public static void CREATECAMPAIGN(String adname,String startDate,String endDate,String itemType,double rate){
		if(Main.admin.contains(adname)){
				if(rate<50){
				Campaign asd=new Campaign(startDate, endDate,itemType, rate);
				Campaign.Campaigns.add(asd);
				}
				else{
					System.out.println("Campaign was not created. Discount rate exceeds maximum rate of 50%.");
				}
		}
		else{
			System.out.println("No admin person named " +adname+" exists!");
		}
	}	
	/**If the given name is admin name, it adds new admin according to given information.
	 * @param adname	To check if the entered name is admin name
	 * @param n_admin	Name of the admin to be added
	 * @param e_admin	E-mail of the admin to be added
	 * @param dob_admin	Date of Birth of the admin to be added
	 * @param s_admin	Salary of the admin to be added
	 * @param pw_admin	Password of the admin to be added
	 */
	public static void ADDADMIN(String adname,String n_admin,String e_admin,String dob_admin,String s_admin,String pw_admin){
		if(Main.admin.contains(adname)){
			Admin qwe=new Admin(n_admin,e_admin,dob_admin,s_admin,pw_admin);
			Main.admin2.add(qwe);
			Main.admin.add(n_admin);	
		}
		else{
			System.out.println("No admin person named " +adname+" exists!");
		}
	}
	/**If the given name is admin name, it adds new technician according to given information.
	 * @param adname	To check if the entered name is admin name
	 * @param n_admin	Name of the technician to be added
	 * @param e_admin	E-mail of the technician to be added
	 * @param dob_admin	Date of Birth of the technician to be added
	 * @param s_admin	Salary of the technician to be added
	 * @param pw_admin	Password of the technician to be added
	 */
	public static void ADDTECH(String adname,String n_tech,String e_tech,String dob_tech,String sa_tech,String s_tech){
		if(Main.admin.contains(adname)){
			Technician newtech=new Technician(n_tech,e_tech, dob_tech, s_tech, s_tech);
			Main.tech2.add(newtech);
			Main.tech.add(n_tech);
		}
		else{
			System.out.println("No admin person named " +adname+" exists!");
		}
	}
	
}
