
public class Employee extends Person{
	String salary;
	public Employee(String name, String e_mail, String Date_of_Birth,String salary) {
		super(name, e_mail, Date_of_Birth);
		this.salary=salary;
	}
	/**if the given named admin or technician is admin or technician,list the existing items with their information in detail.
	 * @param name Admin name or Technician name
	 */
	public static void LISTITEM(String name){
		if(Main.admin.contains(name) || Main.tech.contains(name)){
				for(Book asd:Main.books){
					System.out.println("-----------------------");
					System.out.println(asd.toString());			
				}
				for(CdDvd asd:Main.cddvds){
					System.out.println("-----------------------");
					System.out.println(asd.toString());
				}
				for(Laptop asd:Main.laptops){
					System.out.println("-----------------------");
					System.out.println(asd.toString());
				}
				for(Tablet asd:Main.tablets){
					System.out.println("-----------------------");
					System.out.println(asd.toString());
				}
				for(Tv asd:Main.tvs){
					System.out.println("-----------------------");
					System.out.println(asd.toString());
				}
				for(SmartPhone asd:Main.smartphones){
					System.out.println("-----------------------");
					System.out.println(asd.toString());
				}
				for(HairCare asd:Main.haircares){
					System.out.println("-----------------------");
					System.out.println(asd.toString());
				}
				for(Perfume asd:Main.perfumes){
					System.out.println("-----------------------");
					System.out.println(asd.toString());
				}
				for(SkinCare asd:Main.skincares){
					System.out.println("-----------------------");
					System.out.println(asd.toString());
				}
		}
		else{
			System.out.println("No admin or technician person "+ name+" exists!");
		}
	}
	/**If there is an admin or technician with the given  name,Lists with low stocked product stock information with given parameter
	 * @param name	name
	 * @param stock The highest stock to display
	 */
	public static void SHOWITEMSLOWONSTOCK(String name,String stock){
		if(Main.admin.contains(name)|| Main.tech.contains(name)){
			if(Integer.parseInt(stock)>Main.books.size()){
				System.out.println("Book : "+Main.books.size());
			}
			if (Integer.parseInt(stock)>Main.cddvds.size()){
				System.out.println("CDDVD : "+Main.cddvds.size());
			}
			if (Integer.parseInt(stock)>Main.desktops.size()){
				System.out.println("Desktop : "+Main.desktops.size());
			}
			if (Integer.parseInt(stock)>Main.laptops.size()){
				System.out.println("Laptop : "+Main.laptops.size());
			}
			if (Integer.parseInt(stock)>Main.tablets.size()){
				System.out.println("Tablet : "+Main.tablets.size());
			}
			if (Integer.parseInt(stock)>Main.tvs.size()){
				System.out.println("TV : "+Main.tvs.size());
			}
			if (Integer.parseInt(stock)>Main.smartphones.size()){
				System.out.println("SmartPhone : "+Main.smartphones.size());
			}
			if (Integer.parseInt(stock)>Main.haircares.size()){
				System.out.println("HairCare : "+Main.haircares.size());
			}
			if (Integer.parseInt(stock)>Main.perfumes.size()){
				System.out.println("Perfume : "+Main.perfumes.size());
			}
			if (Integer.parseInt(stock)>Main.skincares.size()){
				System.out.println("SkinCare : "+Main.skincares.size());
			}
		}
		else{
			System.out.println("No admin or technician person "+ name+" exists!");
		}
	}
	/**If there is an admin or technician with the given  name,Lists all items with  stock 
	 * @param name name 
	 */
	public static void SHOWITEMSLOWONSTOCK(String name){
		if(Main.admin.contains(name)|| Main.admin.contains(name)){
			System.out.println("Book : "+Main.books.size());
			System.out.println("CDDVD : "+Main.cddvds.size());
			System.out.println("Desktop : "+Main.desktops.size());
			System.out.println("Laptop : "+Main.laptops.size());
			System.out.println("Tablet : "+Main.tablets.size());
			System.out.println("TV : "+Main.tvs.size());
			System.out.println("SmartPhone : "+Main.smartphones.size());
			System.out.println("HairCare : "+Main.haircares.size());
			System.out.println("Perfume : "+Main.perfumes.size());
			System.out.println("SkinCare : "+Main.skincares.size());
			
		}
		else{
			System.out.println("No admin or technician person "+ name+" exists!");
		}
	}
	/**If there is an admin or technician with the given  name,shows customers with golden status
	 * @param name name
	 */
	public static void SHOWVIP(String name){
		if(Main.admin.contains(name)|| Main.tech.contains(name)){
			for(Customer asd:Main.customer2){
				if(asd.status.equals("GOLDEN")){
				System.out.println("Customer name: "+asd.name +"ID: "+asd.customerID2+ "e-mail: "+asd.e_mail+ "Date of Birth: "+asd.Date_of_Birth+" Status: "+asd.status);
				}
			}
		}
		else{
			System.out.println("No admin or technician person "+ name+" exists!");
		}
	}
}