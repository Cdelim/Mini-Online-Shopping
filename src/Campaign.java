import java.util.ArrayList;

public class Campaign {
	/**This class is required to create a new campaign
	 * 
	 */
	String startDate;
	String endDate;
	String Type;
	double Rate;
	static ArrayList<Campaign> Campaigns=new ArrayList<Campaign>();	
	/**To create a campaign object. According to the type of the item, the discount rate applied for that item type is applied.
	 * Campaign discount rate can not be more than 50%.
	* @param adname To check if the entered name is admin name
	 * @param startDate	Campaign start date
	 * @param endDate	Campaign end date
	 * @param Type	What type of item the campaign will be
	 * @param Rate		Discount rate of the campaign
	 */
	public Campaign(String startDate,String endDate,String Type,double Rate){
		this.startDate=startDate;
		this.endDate=endDate;
		this.Type=Type;
		this.Rate=Rate;
		double Discount=Rate/100.0;
		if(Rate<50){
			if(Type.equals("BOOK")){
				for(Book qwe:Main.books){
					double cost=Double.parseDouble(qwe.price)-(Double.parseDouble((qwe.price))*Discount);
					qwe.price=Double.toString(cost);
				}
			}
			if(Type.equals("CDDVD")){
				for(CdDvd qwe:Main.cddvds){
					double cost=Double.parseDouble(qwe.price)-(Double.parseDouble((qwe.price))*Discount);
					qwe.price=Double.toString(cost);
				}
			}
			if(Type.equals("DESKTOP")){
				for(Desktop qwe:Main.desktops){
					double cost=Double.parseDouble(qwe.price)-(Double.parseDouble((qwe.price))*Discount);
					qwe.price=Double.toString(cost);
				}
			}
			if(Type.equals("LAPTOP")){
				for(Laptop qwe:Main.laptops){
					double cost=Double.parseDouble(qwe.price)-(Double.parseDouble((qwe.price))*Discount);
					qwe.price=Double.toString(cost);
				}
			}
			if(Type.equals("TABLET")){
				for(Tablet qwe:Main.tablets){
					double cost=Double.parseDouble(qwe.price)-(Double.parseDouble((qwe.price))*Discount);
					qwe.price=Double.toString(cost);
				}
			}
			if(Type.equals("TV")){
				for(Tv qwe:Main.tvs){
					double cost=Double.parseDouble(qwe.price)-(Double.parseDouble((qwe.price))*Discount);
					qwe.price=Double.toString(cost);
				}
			}
			if(Type.equals("SMARTPHONE")){
				for(SmartPhone qwe:Main.smartphones){
					double cost=Double.parseDouble(qwe.price)-(Double.parseDouble((qwe.price))*Discount);
					qwe.price=Double.toString(cost);
				}
			}
			if(Type.equals("HAIRCARE")){
				for(HairCare qwe:Main.haircares){
					double cost=Double.parseDouble(qwe.price)-(Double.parseDouble((qwe.price))*Discount);
					qwe.price=Double.toString(cost);
				}
			}
			if(Type.equals("PERFUME")){
				for(Perfume qwe:Main.perfumes){
					double cost=Double.parseDouble(qwe.price)-(Double.parseDouble((qwe.price))*Discount);
					qwe.price=Double.toString(cost);
				}
			}
			if(Type.equals("SKINCARE")){
				for(SkinCare qwe:Main.skincares){
					double cost=Double.parseDouble(qwe.price)-(Double.parseDouble((qwe.price))*Discount);
					qwe.price=Double.toString(cost);
				}
			}						
		}
		else{
			System.out.println("Campaign was not created. Discount rate exceeds maximum rate of 50%.");
		}
	}
	public String toString(){
		return((int)(this.Rate)+"% sale of "+this.Type+" until "+this.endDate);
	}
}
