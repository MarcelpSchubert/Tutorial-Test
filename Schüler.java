//Klasse Schüler -> Daraus können wir dann Objekte erstellen.
public class Schüler {

	//Attribute von Schüler festlegen.
	String name;
	int alter;
	int klasse; 
	
	int iq;
	int hunger;
	
	
	//Operationen/Methoden erstellen.
	void chillen(){
		System.out.println("Jo Bro, ich chill hier!");
		iq--; //Verringert iq um 1.
	}
	
	void essen(){
		System.out.println("Lecker! Lecker!");
		hunger--; //Verringert hunger um 1. 
	}
	
	void lernen(){
		System.out.println("Ich lern jetzt mit TheSimpleClub+!");
		iq++; //Erhöht iq um 1.
	}
	
}

