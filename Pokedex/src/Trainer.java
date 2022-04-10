
public class Trainer {
	int ID;
	public String Name;
	int Age;
	String Gender;
	int Money;
	Pokemon PDEX;
	int Time;
	String Badges;
	
	Trainer(int id, String nn, int a, String g, int m, int tt, String b){
		this.ID = id;
		this.Name = nn;
		this.Age = a;
		this.Gender = g;
		this.Money = m;
//		Pokemon.PDEX = px;
		this.Time = tt;
		this.Badges = b;
	}
		
		
	void inSelf() {
			System.out.println(this.Name + " Gotta catch em all");
			
	}
	void introSelf() {
		System.out.println("Hello, my name is " + this.Name + ".");
	}
}