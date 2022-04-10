
public class Pokemon {
	
	private String Name;
	private int Entry;
	private String Type;
	
	
	public Pokemon(String name, int entry, String type) {
		super();
		this.Name = name;
		this.Entry = entry;
		this.Type = type;
	}

///////////////////////////
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getEntry() {
		return Entry;
	}

	public void setEntry(int entry) {
		Entry = entry;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	/////////////////////////
	
	@Override
	public String toString() {
		return "Pokemon | " + Name + " | Entry: " + Entry + " | Type: " + Type + "]";
	}
	
	public static void main (String[] args) {
		

		Pokemon pk1 = new Pokemon("Bulbasaur", 1, "Grass");
		Pokemon pk2 = new Pokemon("Ivysaur", 2, "Grass / Poison");
		
	
		System.out.println("Name is " + pk1.getName());
		System.out.println(pk1);
		System.out.println(pk2);

	}

	
}