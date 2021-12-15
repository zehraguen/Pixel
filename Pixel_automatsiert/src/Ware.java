
public class Ware {
	
	// Attribute

	private String name;
	private double wert;
	private int menge;

	// Konstruktor
	public Ware(String pName, double pWert, int pMenge)
	{
		name = pName;
		wert = pWert;
		menge = pMenge;
	}
	
	// Name
	public String getName()
	{
		return name;
	}
	
	// Wert
	public double getWert()
	{
		return wert;
	}

	public void setWert(double pWert)
	{
		wert = pWert;
	}
	
	// Menge
	public double getMenge()
	{
		return menge;
	}

	public void setMenge(double pMenge)
	{
		wert = pMenge;
	}
	
}
