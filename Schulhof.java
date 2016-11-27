
//Klasse Schulhof bildet unsere Hautpklasse mit der Main-Methode. 
public class Schulhof {
	
	public static void main (String [] args){
		
		//Neues Objekt von Typ Schüler erstellen
		Schüler eins = new Schüler();
		//Attribute mit Werten belegen.
		eins.name ="Jan";
		eins.alter= 17;
		eins.klasse = 12; 
		
		//Attribute ausgeben lassen
		System.out.printf("%s,%s Jahre, geht in die %s Klasse!",eins.name,eins.alter,eins.klasse);
		
		//Leerzeile
		System.out.println("");
		
		//Weitere Attribute belegen. 
		eins.hunger = 5;
		eins.iq = 3; 
		
		//Methoden aufrufen & Werte ausgeben lasssen.
		eins.chillen();
		System.out.println("IQ = "+eins.iq);
		
		eins.essen();
		System.out.println("Hunger= "+eins.hunger);
		
		eins.lernen();
		System.out.println("IQ = "+eins.iq);

		
	}
}


