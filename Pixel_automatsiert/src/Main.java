import java.util.*;
import java.io.*;

public class Main
{
    static Queue<Kunde> meineQueue = new Queue<Kunde>(); //die Art der Elemente, die mit der Schlange (Queue)
    static Ware[] warenregal = new Ware[10];

    private static String[] nachName = {" Glodstein"," Gerhardt", " Unruh", " Falkenroth", " Bornhoff", " Guen", " Leib", " Jung", " Marr�", " Windfuhr", " Janoschka", " vom Brocke", " Buller", " Kraja", " Mavidis", " Koerbi", " Ackerschott", " Ruthenbeck"};
    private static String[] vorName = {"Karolina","Cora","Nele", "Lara", "Zehra", "Linda","Florian", "Kevin", "Niklas", "Marious", "Enrico", "Sven", "Maik", "Nikolas", "Moritz", "Elias"};

    public static void main(String[] args)
    {
		update();
		
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

    	
        Scanner meinScanner = new Scanner(System.in);


        while(true) 
        {
        	System.out.println("Hauptmenue");
			System.out.println("----------");
			System.out.println();
            System.out.println("1. Kunden anglegen");
            System.out.println("2. Kunden anzeigen");
            System.out.println("3. Kunde xy loeschen");
            System.out.println("4. Kunden zaehlen");
            System.out.println("5. Erster Kunde verlaesst Pixel");
            System.out.println("6. Ware anliefern");
            System.out.println("7. Warenbestand");
            System.out.println("8. Programm beenden");
            System.out.println();
            System.out.println("Deine Eingabe?");
            System.out.println();
            int eingabe = meinScanner.nextInt();
            System.out.println("Es wird zum Menuepunkt "+eingabe+" gewechselt!");
            System.out.println();

            if (eingabe == 1)
            {
                takt();
            }
            if (eingabe == 2)
            {
                anzeigen();
            }
            if (eingabe == 3)
            {
                loeschen();
            }
            if (eingabe == 4)
            {
                zaehlen();
            }
            if (eingabe == 5)
            {
                bedient();
            }
            if(eingabe == 6)
            {
                anliefern();
            }
            if(eingabe == 7)
            {
                Bestandaufnahme();
            }
            if(eingabe == 8)
            {
                System.out.println("Das Pixel hat gerade geschlossen.");
                System.exit(0);
            }
        }
    }

    
    
    public static void takt()
    {
        for(int i = 0; i<100; i++)
        {
            Random mR = new Random();
            
            //die Wahrscheilichkeit in dem ein Kunde erstellt wird
            if (mR.nextDouble() <= 0.4)
            {
                anlegen();
            }
            else
            {
                System.out.println(); 
                System.out.println("Es kam kein neuer Kunde.");
                System.out.println();
            }

            anzeigen();
            
            //die Wahrscheilichkeit in dem ein Kunde bedient wird
            if(mR.nextDouble() <= 0.5 && !(meineQueue.isEmpty()))
            {
                System.out.println(meineQueue.front().getName()+ " wurde bedient und verlaesst das Pixel");
                meineQueue.dequeue();
            }
            
            System.out.println();
            
        }
    }

    
    
    public static void anlegen()
    {
        Random RD = new Random();
        //ZZ = Zufallszahl
        int ZZ;
        int ZZ1;
        int ZZ2;
        int ZZ3;
        int Zaehler;
        Zaehler = 0;

        //zufallszahlen werden erstellt
        ZZ = RD.nextInt(9);
        ZZ1 = RD.nextInt(8);
        ZZ2 = RD.nextInt(4);
        ZZ3 = RD.nextInt(8);
        
        //Name und warenwunsch werden in var gespeichert
        String eingegebenerName = vorName[ZZ]+ nachName[ZZ1];
        String Warenwunsch = warenregal[ZZ3].getName();
        System.out.println();
        
        Double getGeld = RD.nextDouble()*10;

        // Kunde wird erstellt
        Kunde meinKunde = new Kunde(eingegebenerName, getGeld, Warenwunsch);
        meineQueue.enqueue(meinKunde);
        Zaehler++;

        System.out.println();
        System.out.println("Der Kunde mit dem Namen " + meinKunde.getName() + " wurde eingereiht und hat " + meinKunde.getGeld() + " Taschengeld bei sich und haette gerne " + Warenwunsch + ".");
    }

    
    
    public static void anzeigen()
    {
    	Queue<Kunde> zwischenspeicher = new Queue<Kunde>();
    	
        if (meineQueue.isEmpty())
        {
        	System.out.println("Es stehen keine Kunden an");
			System.out.println();
        }
        else
        {
            System.out.println("Aktuell warten:");
            System.out.println("---------------");

            while(!meineQueue.isEmpty())
            {
                Kunde aktuellerKunde = meineQueue.front();
                
                System.out.println(aktuellerKunde.getName());
                
                zwischenspeicher.enqueue(aktuellerKunde);
                meineQueue.dequeue(); 
            }
            
            System.out.println();
            
            while(!zwischenspeicher.isEmpty())
            {
                Kunde aktuellerKunde = zwischenspeicher.front();
                
                meineQueue.enqueue(aktuellerKunde);
                zwischenspeicher.dequeue();
            }
        }
    }
    
    
    
    public static void loeschen()
    {
    	Queue<Kunde> zwischenspeicher = new Queue<Kunde>();
        Scanner meinScanner = new Scanner(System.in);
        
        int anzahlVor = 0;
		int anzahlNach = 0;
        
        System.out.println("Kunde löschen");
		System.out.println("-------------");
        System.out.println();
        
        System.out.println("Welcher Kunde soll gelöscht werden?");
        System.out.println();
        
        String eingegebenerName = meinScanner.next(); //String hat die Methode equals 

        while (!meineQueue.isEmpty())
        {
            Kunde aktuellerKunde = meineQueue.front();
            
            if (eingegebenerName.equals(aktuellerKunde.getName()))
            {
                meineQueue.dequeue();
            }
            else
            {
                meineQueue.dequeue();
                zwischenspeicher.enqueue(aktuellerKunde);
            }
            
            anzahlVor++;
            
        } 
        
        System.out.println();
        
        while(!zwischenspeicher.isEmpty())
        {
            Kunde aktuellerKunde = zwischenspeicher.front();
            zwischenspeicher.dequeue();
            meineQueue.enqueue(aktuellerKunde);
            
            anzahlNach++;
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
		System.out.println("Der Kunde "+aktuellerKunde.getName()+"wurde bedient");
		meineQueue.dequeue();
	}
    
    
    
    public static void anliefern()
    {
        int i = 0;
        
        while(i < 10)
        {
            Scanner mS = new Scanner(System.in);
            
            System.out.println("Ware anlegen");
			System.out.println("------------");
            System.out.println();
            
            System.out.println("Wie heisst die Ware?");
			System.out.println();
			String eingegebenerName = mS.next();
			System.out.println();
	
			System.out.println("Wie viel kostet die Ware?");
			System.out.println();
			double eingegebenerWert = mS.nextDouble();
			System.out.println();
	
			System.out.println("Die Menge der Waren");
			System.out.println();
			int eingegebeneMenge = mS.nextInt();
			System.out.println();

            Ware meineWare = new Ware(eingegebenerName, eingegebenerWert, eingegebeneMenge);
            warenregal[i]=meineWare;

            System.out.println();
			System.out.println("Die Ware " +meineWare.getName()+ " wurde angelegt");
			System.out.println();
		
			System.out.println("du kannst noch " +(9 - i)+ " Ware anlegen");
			System.out.println();
            
            i++;

            try 
            {
                FileWriter writer1 = new FileWriter("warenregal.txt", true);
                writer1.write(eingegebenerName + " " + eingegebenerWert + " " + eingegebeneMenge + "\n");
                writer1.close();
            } 
            catch (IOException ex) 
            {
                System.err.println(ex);
            }
        }
    }
    
    

    public static void Bestandaufnahme()
    {
        if (warenregal == null)
        {
            System.out.println("Es tut mir leid, wir sind ausverkauft.");
        }
        else
        {
            System.out.println();
            System.out.println("Aktuell haben wir im Lager:");
            System.out.println("-----------------------------");

            int j = 0;
            while(j < 10)
            {
                Ware meineWare = warenregal[j];
                System.out.println(meineWare.getName());
                System.out.println("Menge: " + meineWare.getMenge());
                System.out.println("Geld: " + meineWare.getWert());
                System.out.println();
                j++;
            }
        }
    }

    
    
    public static void update()
    {
        try
        {
            FileReader reader1 = new FileReader("warenregal.txt");
            BufferedReader reader = new BufferedReader(reader1);
            String a = null;
            
            int i = 0;
            
            while ((a = reader.readLine())!= null)
            {
                String[] buch = a.split(" ");
                String gWarenname = buch[0];
                double gWarenpreis = Double.parseDouble(buch[1]);
                int gWarenanzahl = Integer.parseInt(buch[2]);
                Ware meineWare = new Ware(gWarenname, gWarenpreis, gWarenanzahl);
                warenregal[i] = meineWare;
                i++;
            }
            
            reader.close();
            
        }
        
        catch (IOException ex)
        {
            System.err.println(ex);
        }
    }
}
