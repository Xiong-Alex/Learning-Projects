// the blueprint for what makes an entry
public class Pokemon {
	public String Name; // instance variables
	int Entry;
	String Type;

	Pokemon(String n, int e, String t){ //constructors
		this.Name = n;
		this.Entry = e;
		this.Type = t; 
		
	
			
		}
	
	
	
	void introduceSelf() {
		System.out.println(this.Name + " looks confused but seems excited");
	}
	
/*	void LostPokemon(){
		System.out.println(this.Name + "is looking for their trainer" + tr1 .Name + ".");
	}                      //Charizard                                   Kyouko
	
	//I want to reference the Class(Trainer) and object (tr1) name but can't figure out how to
	*/
	
}

