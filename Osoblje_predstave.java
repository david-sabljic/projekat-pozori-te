package Projekat_OOP;

import java.util.ArrayList;

public class Osoblje_predstave {
	protected int id;
	protected Predstava predstava;
	protected ArrayList<Osoblje> osoblje = new ArrayList<>();
	public static ArrayList<Osoblje_predstave> sve_osoblje_predstave = new ArrayList<>();
	
	public Osoblje_predstave(int id,int predstava_id,int osoblje_id) {
		this.id=id;
		this.predstava=Predstava.get_predstavu(predstava_id);
		Osoblje pomocna=Osoblje.get_osoblje(osoblje_id);
		boolean postoji=false;
		int indeks_ako_posotji=0;
		for(Osoblje_predstave x:sve_osoblje_predstave) {
			if(x.get_predstava().uporedi_predstavu(predstava)) {
				postoji=true;
				indeks_ako_posotji=sve_osoblje_predstave.indexOf(x);
				break;
			}
		}
		if(postoji) {
			sve_osoblje_predstave.get(indeks_ako_posotji).osoblje.add(pomocna);
		}
		else {
			this.osoblje.add(pomocna);
			sve_osoblje_predstave.add(this);
		}
	}
	
	public Osoblje_predstave() {
		this.predstava=null;
		this.osoblje=null;
	}
	
	public int get_id() {
		return this.id;
	}
	
	public Predstava get_predstava() {
		return this.predstava;
	}
	
	public ArrayList<Osoblje> get_osoblje(){
		return this.osoblje;
	}
	
	public static ArrayList<Osoblje_predstave> get_sve_osoblje_predstave(){
		return sve_osoblje_predstave;
	}
	
	public void set_predstava(Predstava x) {
		this.predstava=x;
	}
	
	public void set_id(int x) {
		this.id=x;
	}
	
	public String toString() {
		String rez="id: "+this.id+"\n";
		rez+="predstava: "+this.predstava+"\n";
		rez+="osoblje:\n";
		for(Osoblje x:this.osoblje) {
			rez+=x+"\n";
		}
		return rez;
	}
}
