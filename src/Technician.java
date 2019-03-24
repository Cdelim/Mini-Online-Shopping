public class Technician extends Employee{
	boolean senior;
	public Technician(String name, String e_mail, String Date_of_Birth, String salary,String senior) {
		super(name, e_mail, Date_of_Birth, salary);
		if(senior.equals("0")){
			this.senior=false;
		}
		else if(senior.equals("1")){
			this.senior=true;
		}
	}
	public boolean isSenior() {
		return senior;
	}
	public void setSenior(boolean senior) {
		this.senior = senior;
	}
	/**If the given techinian name is techinian,Displays items of the given type with information.
	 * @param techname	techinian name
	 * @param itemtype	Item Type
	 */
	public static void DISPITEMSOF(String techname,String itemtype){
		if(Main.tech.contains(techname)){
			String[] itemtype2 = itemtype.split(":");
			for(String str:itemtype2){
				if(str.equals("BOOK")){
					for(Book asd:Main.books){
						System.out.println("-----------------------");
						System.out.println(asd.toString());
					}
				}
				if(str.equals("CDDVD")){
					for(CdDvd asd:Main.cddvds){
						System.out.println("-----------------------");
						System.out.println(asd.toString());
					}
				}
				if(str.equals("DESKTOP")){
					for(Desktop asd:Main.desktops){
						System.out.println("-----------------------");
						System.out.println(asd.toString());
					}
				}
				if(str.equals("LAPTOP")){
					for(Laptop asd:Main.laptops){
						System.out.println("-----------------------");
						System.out.println(asd.toString());
					}
				}
				if(str.equals("TABLET")){
					for(Tablet asd:Main.tablets){
						System.out.println("-----------------------");
						System.out.println(asd.toString());
					}
				}
				if(str.equals("TV")){
					for(Tv asd:Main.tvs){
						System.out.println("-----------------------");
						System.out.println(asd.toString());
					}
				}
				if(str.equals("SMARTPHONE")){
					for(SmartPhone asd:Main.smartphones){
						System.out.println("-----------------------");
						System.out.println(asd.toString());
					}
				}
				if(str.equals("HAIRCARE")){
					for(HairCare asd:Main.haircares){
						System.out.println("-----------------------");
						System.out.println(asd.toString());
					}
				}
				if(str.equals("PERFUME")){
					for(Perfume asd:Main.perfumes){
						System.out.println("-----------------------");
						System.out.println(asd.toString());
					}
				}
				if(str.equals("SKINCARE")){
					for(SkinCare asd:Main.skincares){
						System.out.println("-----------------------");
						System.out.println(asd.toString());
					}
				}
				
			}
			
		}
		else{
			System.out.println("No technician person named " +techname +" exists!");
		}
	}
	/**If the given techinian name is techinian,add new item.
	 * @param techname Techinian name 
	 * @param itemtype Item Type
	 */
	public static void ADDITEM(String techname,String itemtype){
		if(Main.tech.contains(techname)){
			String[] itemtype2=itemtype.split(":");
				if(itemtype2[0].equalsIgnoreCase("BOOK")){
					Book newbook=new Book(itemtype2[0],itemtype2[1],itemtype2[2],itemtype2[3],itemtype2[4],itemtype2[5],itemtype2[6]);
					Main.books.add(newbook);
					Main.items.add(newbook);
				}
				else if(itemtype2[0].equalsIgnoreCase("CDDVD")){
					CdDvd newcddvd=new CdDvd(itemtype2[0],itemtype2[1],itemtype2[2],itemtype2[3],itemtype2[4],itemtype2[5]);
					Main.cddvds.add(newcddvd);
					Main.items.add(newcddvd);
				}
				else if(itemtype2[0].equalsIgnoreCase("DESKTOP")){
					Desktop newdesktop=new Desktop(itemtype2[0],itemtype2[1],itemtype2[2],itemtype2[3],itemtype2[4],itemtype2[5],
							itemtype2[6],itemtype2[7],itemtype2[8],itemtype2[9],itemtype2[10]);
					Main.desktops.add(newdesktop);
					Main.items.add(newdesktop);
				}
				else if(itemtype2[0].equalsIgnoreCase("LAPTOP")){
					Laptop newlaptop=new Laptop(itemtype2[0],itemtype2[1],itemtype2[2],itemtype2[3],itemtype2[4],itemtype2[5],
							itemtype2[6],itemtype2[7],itemtype2[8],itemtype2[9],itemtype2[10]);
					Main.laptops.add(newlaptop);
					Main.items.add(newlaptop);
				}
				else if(itemtype2[0].equalsIgnoreCase("TABLET")){
					Tablet newtablet=new Tablet(itemtype2[0],itemtype2[1],itemtype2[2],itemtype2[3],itemtype2[4],itemtype2[5],
							itemtype2[6],itemtype2[7],itemtype2[8],itemtype2[9],itemtype2[10]);
					Main.tablets.add(newtablet);
					Main.items.add(newtablet);
				}
				else if(itemtype2[0].equalsIgnoreCase("TV")){
					Tv newtv=new Tv(itemtype2[0],itemtype2[1],itemtype2[2],itemtype2[3],itemtype2[4],itemtype2[5],itemtype2[6]);
					Main.tvs.add(newtv);
					Main.items.add(newtv);
				}
				else if(itemtype2[0].equalsIgnoreCase("SMARTPHONE")){
					SmartPhone newsmartphone=new SmartPhone(itemtype2[0],itemtype2[1],itemtype2[2],itemtype2[3],itemtype2[4],itemtype2[5],itemtype2[6]);
					Main.smartphones.add(newsmartphone);
					Main.items.add(newsmartphone);
				}
				else if(itemtype2[0].equalsIgnoreCase("HAIRCARE")){
					HairCare newhaircare=new HairCare(itemtype2[0],itemtype2[1],itemtype2[2],itemtype2[3],itemtype2[4],itemtype2[5],
							itemtype2[6],itemtype2[7]);
					Main.haircares.add(newhaircare);
					Main.items.add(newhaircare);
				}
				else if(itemtype2[0].equalsIgnoreCase("PERFUME")){
					Perfume newperfume=new Perfume(itemtype2[0],itemtype2[1],itemtype2[2],itemtype2[3],itemtype2[4],itemtype2[5],
							itemtype2[6],itemtype2[7]);
					Main.perfumes.add(newperfume);
					Main.items.add(newperfume);
				}
				else if(itemtype2[0].equalsIgnoreCase("SKINCARE")){
					SkinCare newskincare=new SkinCare(itemtype2[0],itemtype2[1],itemtype2[2],itemtype2[3],itemtype2[4],itemtype2[5],
							itemtype2[6],itemtype2[7]);
					Main.skincares.add(newskincare);
					Main.items.add(newskincare);
				}
				else{
					System.out.println("No item type "+itemtype2[0]+ " found");
				}
				
			}
		else{
			System.out.println("No technician person named " +techname +" exists!");
		}
	}
	/**If the given techinian name is techinian,shows order history.
	 * @param techname	techinian name
	 */
	public static void SHOWORDERS(String techname){
		if(Main.tech.contains(techname)){
			int i=1;
			for(Technician qwe:Main.tech2){
				if(qwe.name.equals(techname) && qwe.senior==true){
					System.out.println("Order History:");
					for(Orders asd:Orders.orders){
						System.out.println("Order Date:"+asd.Date+" Customer ID: "+asd.c_ID+" Total Cost: "
								+asd.t_Cost+" Number of purchased items: "+asd.purchased_items);
					}
				}
				else{
					i++;	
				}
				if (i>Main.tech2.size()){
					System.out.println(techname +" is not authorized to display orders!");
				}
			}
			
		}
		else{
			System.out.println("No technician person named "+techname+" exists!");
		}
	}
	
}
