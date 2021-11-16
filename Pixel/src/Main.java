import java.util.*;

public class Main
{

	static Queue<Kunde> meineQueue = new Queue<Kunde>();
	static Ware[] warenregal = new Ware[10];
	
	private int i = 0; 
	

	public static void main(String[] args)
	{
			System.out.println("Willkommen im Cafe Pixel");
			System.out.println("------------------------");
			System.out.println();

			System.out.println("_________________¶¶¶1___¶¶¶____¶¶¶1_______________\r\n"
						 + "__________________¶¶¶____¶¶¶____1¶¶1______________\r\n"
      			         + "___________________¶¶¶____¶¶¶____¶¶¶______________\r\n"
      			         + "___________________¶¶¶____¶¶¶____¶¶¶______________\r\n"
      			         + "__________________¶¶¶____1¶¶1___1¶¶1______________\r\n"
      			         + "________________1¶¶¶____¶¶¶____¶¶¶1_______________\r\n"
      			         + "______________1¶¶¶____¶¶¶1___¶¶¶1_________________\r\n"
      			         + "_____________¶¶¶1___1¶¶1___1¶¶1___________________\r\n"
      			         + "____________1¶¶1___1¶¶1___1¶¶1____________________\r\n"
      			         + "____________1¶¶1___1¶¶1___1¶¶¶____________________\r\n"
      			         + "_____________¶¶¶____¶¶¶1___¶¶¶1___________________\r\n"
      			         + "______________¶¶¶¶___1¶¶¶___1¶¶¶__________________\r\n"
      			         + "_______________1¶¶¶1___¶¶¶1___¶¶¶¶________________\r\n"
      			         + "_________________1¶¶1____¶¶¶____¶¶¶_______________\r\n"
      			         + "___________________¶¶1____¶¶1____¶¶1______________\r\n"
      			         + "___________________¶¶¶____¶¶¶____¶¶¶______________\r\n"
      			         + "__________________1¶¶1___1¶¶1____¶¶1______________\r\n"
      			         + "_________________¶¶¶____¶¶¶1___1¶¶1_______________\r\n"
      			         + "________________11_____111_____11_________________\r\n"
      			         + "__________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶________\r\n"
      			         + "1¶¶¶¶¶¶¶¶¶¶¶__¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶________\r\n"
      			         + "1¶¶¶¶¶¶¶¶¶¶¶__1¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶________\r\n"
      			         + "1¶¶_______¶¶__1¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶________\r\n"
      			         + "1¶¶_______¶¶__1¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶________\r\n"
      			         + "1¶¶_______¶¶__¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶________\r\n"
      			         + "1¶¶_______¶¶__1¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶________\r\n"
      			         + "_¶¶¶¶¶¶¶¶¶¶¶__¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶________\r\n"
      			         + "_¶¶¶¶¶¶¶¶¶¶¶__¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶________\r\n"
      			         + "__________¶¶___1¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶1________\r\n"
      			         + "__________1¶¶___¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_________\r\n"
      			         + "____________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶11__________\r\n"
      			         + "11_____________________________________________111\r\n"
      			         + "1¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶1\r\n"
      			         + "__¶¶111111111¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶111111111¶__\r\n"
      			         + "");

		Scanner mS = new Scanner(System.in);
		while(true)
		{
			//System.out.println();
			System.out.println("Hauptmenue");
			System.out.println("----------");
			System.out.println();
			System.out.println("1. Kunde anlegen");
			System.out.println("2. Kunden anzeigen");
			System.out.println("3. Kunde xy loeschen");
			System.out.println("4. Kunden zaehlen");
			System.out.println("5. Erster Kunde verlaesst Pixel");
			System.out.println("6. Ware anliefern");
			System.out.println("7. Ware anzeigen");
			System.out.println("8. Programm verlassen");
			System.out.println();
			System.out.println("Deine Eingabe?");
			System.out.println();
			int eingabe = mS.nextInt();
			System.out.println();
			System.out.println("Es wird zum Menuepunkt "+eingabe+" gewechselt!");
			System.out.println();
			
			if(eingabe == 1)
			{
				anlegen();
			}
			if(eingabe == 2)
			{
				anzeigen();
			}
			if(eingabe == 3)
			{
				loeschen();
			}
			if(eingabe == 4)
			{
				zaehlen();
			}
			if(eingabe == 5)
			{
				bedient();
			}
			if(eingabe == 6)
			{
				anliefern();
			}
			if(eingabe == 7)
			{
				wAnzeigen();
			}
			if(eingabe == 8)
			{
				System.out.println("Pixel wurde beendet");
				System.exit(0);
			}
		}
	} 
	

	public static void anlegen()
	{
		Scanner mS = new Scanner(System.in);
    	System.out.println();
    	System.out.println("Kunde anlegen");
    	System.out.println("-------------");
    	System.out.println();
    	
    	System.out.println("Wie heisst der Kunde?");
    	System.out.println();
    	String eingegebenerName = mS.next();
    	System.out.println();
    	
    	System.out.println("Wie viel Geld hat der Kunde?");
    	System.out.println();
    	double eingegebenerWert = mS.nextDouble();
    	System.out.println();

    	Kunde meinKunde = new Kunde(eingegebenerName, eingegebenerWert);
    	meineQueue.enqueue(meinKunde); // Der Kunde wird eingereiht

    	System.out.println();
    	System.out.println("Der Kunde mit dem Namen "+meinKunde.getName()+" wurde erzeugt und eingereiht.");
	} 
	

	public static void anzeigen()
	{
		Queue<Kunde> zwischenSpeicher = new Queue<Kunde>();

		if(meineQueue.isEmpty())
		{
			System.out.println("Es stehen keine Kunden an");
			System.out.println();
		}
		else
		{
			System.out.println("Aktuell warten:");
			System.out.println("---------------");

			while( !meineQueue.isEmpty() )
			{
				Kunde aktuellerKunde = meineQueue.front();

				System.out.println( aktuellerKunde.getName() );

				zwischenSpeicher.enqueue(aktuellerKunde);
				meineQueue.dequeue();
			}

			System.out.println();

			while( !zwischenSpeicher.isEmpty() )
			{
				Kunde aktuellerKunde = zwischenSpeicher.front();
				meineQueue.enqueue(aktuellerKunde);
				zwischenSpeicher.dequeue();
			}
		}
	}
	
	
	public static void loeschen()
	{
		Queue<Kunde> zwischenSpeicher = new Queue<Kunde>();
		Scanner mS = new Scanner(System.in);
		int anzahlVor = 0;
		int anzahlNach = 0;
		
		System.out.println("Kunde löschen");
		System.out.println("-------------");
		System.out.println();
		
		System.out.println("Welcher Kunde soll gelöscht werden?");
		System.out.println();
		
		String eingegebenerName = mS.next();
    	
    	while( !meineQueue.isEmpty() )
    	{
    		Kunde aktuellerKunde = meineQueue.front();

    		if( eingegebenerName.equals(aktuellerKunde.getName()) )
    		{
    			meineQueue.dequeue();
    		}
    		else
    		{
    			zwischenSpeicher.enqueue(aktuellerKunde);
    			meineQueue.dequeue();
    		}
    		
    		anzahlVor = anzahlVor + 1;
    	}
    	
    	System.out.println();
    	
    	while( !zwischenSpeicher.isEmpty() )
		{
			Kunde aktuellerKunde = zwischenSpeicher.front();
			meineQueue.enqueue(aktuellerKunde);
			zwischenSpeicher.dequeue();
			
			anzahlNach = anzahlNach + 1;
		}
    	
    	//kontrolliert ob der Name in der Schlange ansteht
    	if(anzahlVor == anzahlNach)
    	{
    		System.out.println("Der Kunde " +eingegebenerName+ " steht nicht in der Schlange");
    	}
	}

	
	public static void zaehlen()
	{
		Queue<Kunde> zwischenSpeicher = new Queue<Kunde>();
		int anzahl = 0;

		while( !meineQueue.isEmpty() )
		{
			Kunde aktuellerKunde = meineQueue.front();

			zwischenSpeicher.enqueue(aktuellerKunde);
			meineQueue.dequeue();
			anzahl++;
		}

		System.out.println(anzahl+" Kunden warten in der Schlange");
		System.out.println();

		while( !zwischenSpeicher.isEmpty() )
		{
				Kunde aktuellerKunde = zwischenSpeicher.front();
				
				meineQueue.enqueue(aktuellerKunde);
				zwischenSpeicher.dequeue();
		}
	}
	
	
	public static void bedient()
	{
		Kunde aktuellerKunde = meineQueue.front();
		System.out.println("Der Kunde"+aktuellerKunde.getName()+"wurde bedient");
		meineQueue.dequeue();
	}
	
	
	public static void anliefern()
	{
		boolean z = true;
    	
    	while(z || i < 10)
    	{
    		Scanner mS = new Scanner(System.in);
    		System.out.println();
    		System.out.println("Ware anlegen");
    		System.out.println("------------");
    		System.out.println();
    	
	public static void anliefern()
	{
		//boolean z = true;
		int i = 0;
    	
    		while(i < 10) 
    		{ 
    		Scanner mS = new Scanner(System.in);
    		System.out.println();
    		System.out.println("Ware anlegen");
    		System.out.println("------------");
    		System.out.println();
    	
    		System.out.println("Wie heisst die Ware?");
    		System.out.println();
    		String eingegebenerName = mS.next();
    		System.out.println();
    	
    		System.out.println("Wie viel Geld kostet die Ware?");
    		System.out.println();
    		double eingegebenerWert = mS.nextDouble();
    		System.out.println();
    	
    		System.out.println("Die Menge der Waren");
    		System.out.println();
    		int eingegebeneMenge = mS.nextInt();
    		System.out.println();
    		
    		Ware meineWare = new Ware(eingegebenerName, eingegebenerWert, eingegebeneMenge);
    		warenregal[i] = meineWare;
    		
    		System.out.println();
    		System.out.println("Die Ware " +meineWare.getName()+ " wurde angelegt");
    		System.out.println();
    		System.out.println();
    		
    		System.out.println("du kannst noch " +(9 - i)+ " Ware anlegen");
    		System.out.println();
    		/*System.out.println("klicke 1 um noch eine Ware anzulegen");
    		System.out.println("klicke 2 um den Menuepunkt zu verlassen");
    		System.out.println();
    		int eingabe = mS.nextInt();
    		System.out.println();*/
    		
    		i++;
    		
    		//if(eingabe == 2)
    		//{
    			//z = false;
    		//}
    		}
	}
	
	public static void wAnzeigen()
	{
		int j = 0;
		
		while(j < 10)
		{
			Ware meineWare = warenregal[j];
			System.out.println(meineWare.getName());
			j++;
		}
	}
}
