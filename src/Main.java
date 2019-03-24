import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static ArrayList<String> admin = new ArrayList<String>();
	static ArrayList<Admin> admin2=new ArrayList<Admin>();
	static ArrayList<String> tech = new ArrayList<String>();
	static ArrayList<Technician> tech2 = new ArrayList<Technician>();
	static ArrayList<String> customer = new ArrayList<String>();
	static ArrayList<Customer> customer2 = new ArrayList<Customer>();
	static ArrayList<Book> books = new ArrayList<Book>();
	static ArrayList<CdDvd> cddvds = new ArrayList<CdDvd>();
	static ArrayList<Desktop> desktops = new ArrayList<Desktop>();
	static ArrayList<Laptop> laptops = new ArrayList<Laptop>();
	static ArrayList<Tablet> tablets = new ArrayList<Tablet>();
	static ArrayList<Tv> tvs = new ArrayList<Tv>();
	static ArrayList<SmartPhone> smartphones = new ArrayList<SmartPhone>();
	static ArrayList<HairCare> haircares = new ArrayList<HairCare>();
	static ArrayList<Perfume> perfumes = new ArrayList<Perfume>();
	static ArrayList<SkinCare> skincares = new ArrayList<SkinCare>();
	static ArrayList<Items> items=new ArrayList<Items>();
	/**Reads file for information and assigns lists according to their specifications
	 * @param args	Argument
	 * @throws ParseException	Given date to convert the desired tariff
	 */
	/**It reads the files to be received for the given information and adds the item data to the lists.
	 * @param args Argument
	 * @throws ParseException	Given date to convert the desired tariff
	 */
	/**It reads the file to retrieve the given information and calls the methods according to the given information.
	 * @param args	Argument
	 * @throws ParseException	Given date to convert the desired tariff
	 */
	public static void	main(String[] args) throws  ParseException {
	try {
	Scanner scanner =	new	Scanner(new	File(args[0]));
		while	(scanner.hasNextLine()){
			String line = scanner.nextLine();
			String[] line2 = line.split("	");
			if(line.startsWith("ADMIN")){
				for(int i=0;i<line2.length;i+=6){
					Admin admins=new Admin(line2[i+1],line2[i+2],line2[i+3],line2[i+4],line2[i+5]);
					admin2.add(admins);
				}
				for(String str : line2){
					admin.add(str);	
					admin.remove("ADMIN");
				}
			}
			if(line.startsWith("TECH")){
				for(int i=0;i<line2.length;i+=6){
					Technician techs=new Technician(line2[i+1],line2[i+2],line2[i+3],line2[i+4],line2[i+5]);
					tech2.add(techs);
				}
				for(String str : line2){
					tech.add(str);
					tech.remove("TECH");
				}
			}
			if(line.startsWith("CUSTOMER")){
				for(int i=0;i<line2.length;i+=6){
					Customer customers=new Customer(line2[i+1],line2[i+2],line2[i+3],Double.parseDouble(line2[i+4]),line2[i+5]);
					customer2.add(customers);
				}
				for(String str : line2){
					customer.add(str);					
					customer.remove("CUSTOMER");
				}
			}
		}
		scanner.close();            
		Scanner scanner2 =	new	Scanner(new	File(args[1]));
			while	(scanner2.hasNextLine()){
				String line = scanner2.nextLine();
				String[] line2 = line.split("	");
				if(line.startsWith("BOOK")){
						Book book=new Book(line2[0],line2[1],line2[2],line2[3],line2[4],line2[5],line2[6]);
						books.add(book);
						items.add(book);
					}
				if(line.startsWith("CDDVD")){
					CdDvd cddvd=new CdDvd(line2[0],line2[1],line2[2],line2[3],line2[4],line2[5]);
					cddvds.add(cddvd);
					items.add(cddvd);
				}
				if(line.startsWith("DESKTOP")){
					Desktop desktop=new Desktop(line2[0],line2[1],line2[2],line2[3],line2[4],line2[5],line2[6],line2[7]
							,line2[8],line2[9],line2[10]);
					desktops.add(desktop);
					items.add(desktop);
				}
				if(line.startsWith("LAPTOP")){
					Laptop laptop=new Laptop(line2[0],line2[1],line2[2],line2[3],line2[4],line2[5],line2[6],line2[7]
							,line2[8],line2[9],line2[10]);
					laptops.add(laptop);
				}
				if(line.startsWith("TABLET")){
					Tablet tablet=new Tablet(line2[0],line2[1],line2[2],line2[3],line2[4],line2[5],line2[6],line2[7]
							,line2[8],line2[9],line2[10]);
					tablets.add(tablet);
					items.add(tablet);
				}
				if(line.startsWith("TV")){
					Tv tv=new Tv(line2[0],line2[1],line2[2],line2[3],line2[4],line2[5],line2[6]);
					tvs.add(tv);
					items.add(tv);
				}
				if(line.startsWith("SMARTPHONE")){
					SmartPhone smartphone=new SmartPhone(line2[0],line2[1],line2[2],line2[3],line2[4],line2[5],line2[6]);
					smartphones.add(smartphone);
					items.add(smartphone);
				}
				if(line.startsWith("HAIRCARE")){
					HairCare haircare=new HairCare(line2[0],line2[1],line2[2],line2[3],line2[4],line2[5],line2[6],line2[7]);
					haircares.add(haircare);
					items.add(haircare);
				}
				if(line.startsWith("PERFUME")){
					Perfume perfume=new Perfume(line2[0],line2[1],line2[2],line2[3],line2[4],line2[5],line2[6],line2[7]);
					perfumes.add(perfume);
					items.add(perfume);
				}	
				if(line.startsWith("SKINCARE")){
					SkinCare skincare=new SkinCare(line2[0],line2[1],line2[2],line2[3],line2[4],line2[5],line2[6],line2[7]);
					skincares.add(skincare);
					items.add(skincare);					
				}
			}
		scanner2.close();
		Scanner scanner3 =	new	Scanner(new	File(args[2]));
		while	(scanner3.hasNextLine()){
			String line = scanner3.nextLine();
			String[] line2 = line.split("	");
			if(line.startsWith("ADDCUSTOMER")){
				Admin.ADDCUSTOMER(line2[1],line2[2],line2[3],line2[4],Double.parseDouble(line2[5]),line2[6]);
			}
			else if(line2[0].equals("SHOWCUSTOMER")){ 
				Admin.SHOWCUSTOMER(line2[1],Integer.parseInt(line2[2]));
			}
			else if(line.startsWith("SHOWCUSTOMERS")){ 
				Admin.SHOWCUSTOMERS(line2[1]);
			}
			else if(line.startsWith("ADDTOCART")){ 
				Customer.ADDTOCART(Integer.parseInt(line2[1]), line2[2]);
			}
			else if(line.startsWith("ORDER")){ 
				Customer.ORDER(line2[1],line2[2]);
			}
			else if(line.startsWith("SHOWADMININFO")){ 
				Admin.SHOWADMININFO(line2[1]);
			}
			else if(line.startsWith("CREATECAMPAIGN")){ 
				Admin.CREATECAMPAIGN(line2[1], line2[2], line2[3], line2[4], Double.parseDouble(line2[5]));
			}
			else if(line.startsWith("SHOWCAMPAIGNS")){ 
				Customer.SHOWCAMPAIGNS(Integer.parseInt(line2[1]));
			}
			else if(line.startsWith("DEPOSITMONEY")){ 
				Customer.DEPOSITMONEY(Integer.parseInt(line2[1]),Double.parseDouble(line2[2]));
			}
			else if(line.startsWith("CHPASS")){
				Customer.CHPASS(Integer.parseInt(line2[1]), line2[2],line2[3]);
			}
			else if(line.startsWith("EMPTYCART")){
				Customer.EMPTYCART(Integer.parseInt(line2[1]));
			}
			else if(line.startsWith("SHOWITEMSLOWONSTOCK")){ 
				if(line2[2]!=null){
					Technician.SHOWITEMSLOWONSTOCK(line2[1],line2[2]);
				}
				else{
					Technician.SHOWITEMSLOWONSTOCK(line2[1]);	
				}
			}
			else if(line.startsWith("SHOWVIP")){
				Employee.SHOWVIP(line2[1]);
			}
			else if(line.startsWith("ADDADMIN")){
				Admin.ADDADMIN(line2[1],line2[2],line2[3],line2[4],line2[5],line2[6]);
			}
			else if(line.startsWith("ADDTECH")){ 
				Admin.ADDTECH(line2[1],line2[2],line2[3],line2[4],line2[5],line2[6]);
			}
			else if(line.startsWith("ADDITEM")){ 
				Technician.ADDITEM(line2[1],line2[2]);
			}
			else if(line.startsWith("SHOWORDERS")){
				Technician.SHOWORDERS(line2[1]);
			}
			else if(line.startsWith("LISTITEM")){ 
				Employee.LISTITEM(line2[1]);
			}
			else if(line.startsWith("DISPITEMSOF")){
				Technician. DISPITEMSOF(line2[1],line2[2]);
			}
			else{
				continue;
			}
	}	
	scanner3.close();
	}
	catch(FileNotFoundException ex) {
	System.	out	.println("No File Found!");
		return	;
	}
	}
}

