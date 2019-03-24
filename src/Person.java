public class Person {
	/**Person class has 2 subclass.The names are Customer and Employee.
	 * 
	 */
	String name;	
	String e_mail;
	String Date_of_Birth;
	/**To create an object from the	Person class
	 * @param name	Person's name
	 * @param e_mail	Person's e_mail
	 * @param Date_of_Birth	Person's Date of Birth
	 */
	public Person(String name ,String e_mail,String Date_of_Birth){
		this.name=name;
		this.e_mail=e_mail;
		this.Date_of_Birth=Date_of_Birth;		
	}
	/**
	 * @return It returns to the name of the person's e-mail and birth date.
	 */
	public String DisplayPersonalData(){
		return  name+" "+e_mail+" "+Date_of_Birth;
	}
}
