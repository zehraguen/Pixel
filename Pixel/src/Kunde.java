
public class Kunde {

	// Attribute
	
	private String name;
	private double geld;
	private String geschlecht;
	
	
	// Konstruktor
	
	public Kunde(String pName, double pGeld)
	{
		name = pName;
		geld = pGeld;
	}
	
	
	// Dienste oder Methoden
	
	//get-Methode
	public String getName()
	{
		return name;
	}
	
	public double getGeld()
	{
		return geld;
	}
	
	//setMethode
	public void setGeld(double pGeld)
	{
		geld = pGeld;
	}
}
