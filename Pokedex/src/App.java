
public class App {
	public static void main(String [] args) {
		
		// Pokemons
		
		Pokemon pk1 =
				new Pokemon ("Bulbasaur", 1, "Grass");
		Pokemon pk2 =
				new Pokemon ("Ivysaur", 2, "Grass | Poison");
		Pokemon pk3 =
				new Pokemon ("Venasaur", 3, "Grass | Poison");
		Pokemon pk4 =
				new Pokemon ("Charmader", 4, "Fire");
		Pokemon pk5 =
				new Pokemon ("Charmeleon", 5, "Fire");
		Pokemon pk6 =
				new Pokemon ("Charizard", 6, "Fire | Flying");
		Pokemon pk7 =
				new Pokemon ("Squirtle", 7, "Water");
		Pokemon pk8 =
				new Pokemon ("Wartorle", 8, "Water");
		Pokemon pk9 =
				new Pokemon ("Blastoise", 9, "Water");

		// Trainers
		
		Trainer tr1 =
				new Trainer (4125, "Kyouko", 19, "Female", 132089, 622, "Boulder | Cascade | Thunder | Rainbow | Soul");
				tr1.PDEX = pk6;
		
		Trainer tr2 =
				new Trainer (4126, "Hiroshi", 27, "Male", 7089, 222, "Boulder | Cascade");
				tr2.PDEX = pk2;
				
		Trainer tr3 =
				new Trainer (4127, "Aiko", 18, "Female", 82089, 422, "Boulder | Cascade | Thunder");
				tr3.PDEX = pk9;
		// 
		
		
		
		pk7.introduceSelf();
		tr1.introSelf();
		tr2.inSelf();
		tr3.inSelf();
		tr3.PDEX.introduceSelf();
		tr1.PDEX.introduceSelf();
		//tr.PDEX.
		
		
	}
}
