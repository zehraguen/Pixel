public class Ware
{
  private String name;
  private double wert;
  private int menge;
  
  public Ware(String pName, double pWert, int pMenge) // Konstruktor
  {
    name = pName;
    wert = pWert;
    menge = pMenge;
  }
  
  public String getName()
  {
    return name;
  }
  
  public double getWert()
  {
    return wert;
  }
  
  public int getMenge()
  {
    return menge;
  }
  
  public void setMenge(int pMenge)
  {
    menge = pMenge;
  }
  
  public void setWert(double pWert)
  {
    wert = pWert;
  }
}
