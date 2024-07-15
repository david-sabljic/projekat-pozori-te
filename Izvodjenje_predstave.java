package Projekat_OOP;

import java.util.ArrayList;
import java.sql.*;

public class Izvodjenje_predstave {
	protected ArrayList <Integer> id = new ArrayList<>();
	protected Predstava predstava;
	protected ArrayList <Pozoriste> pozoriste = new ArrayList<>();
	protected ArrayList <Double> cijena=new ArrayList<>();;
	protected ArrayList<Date> datum =new ArrayList<>();
	protected ArrayList<Time> vrijeme =new ArrayList<>();
	public static ArrayList<Izvodjenje_predstave> sva_izvodjenja_predstave =new ArrayList<>();
	
	public Izvodjenje_predstave(int id, int predstava_id, int pozoriste_id, double cijena, Date datum,Time vrijeme) {
		this.predstava=Predstava.get_predstavu(predstava_id);
		boolean postoji=false;
		int indeks_ako_posotji=0;
		for(Izvodjenje_predstave x:sva_izvodjenja_predstave) {
			if(x.get_predstava().uporedi_predstavu(predstava)) {
				postoji=true;
				indeks_ako_posotji=sva_izvodjenja_predstave.indexOf(x);
				break;
			}
		}
		if(postoji) {
			sva_izvodjenja_predstave.get(indeks_ako_posotji).pozoriste.add(Pozoriste.get_pozoriste(pozoriste_id));
			sva_izvodjenja_predstave.get(indeks_ako_posotji).cijena.add(cijena);
			sva_izvodjenja_predstave.get(indeks_ako_posotji).datum.add(datum);
			sva_izvodjenja_predstave.get(indeks_ako_posotji).vrijeme.add(vrijeme);
			sva_izvodjenja_predstave.get(indeks_ako_posotji).id.add(id);
		}
		else {
			this.pozoriste.add(Pozoriste.get_pozoriste(pozoriste_id));
			this.cijena.add(cijena);
			this.datum.add(datum);
			this.vrijeme.add(vrijeme);
			this.id.add(id);
			sva_izvodjenja_predstave.add(this);
		}
	}
	
	public Predstava get_predstava() {
		return this.predstava;
	}
	
	public ArrayList <Integer> get_id() {
		return this.id;
	}
	
	public ArrayList <Pozoriste> get_pozoriste() {
		return this.pozoriste;
	}
	
	public ArrayList <Double> get_cijena() {
		return this.cijena;
	}
	
	public ArrayList<Date> get_datum() {
		return this.datum;
	}
	
	public ArrayList<Time> get_vrijeme() {
		return this.vrijeme;
	}
	
	public static ArrayList <Izvodjenje_predstave> get_sva_izvodjenja_predstave(){
		return sva_izvodjenja_predstave;
	}
	
	public void set_predstava(Predstava x) {
		this.predstava=x;
	}
	
	public static Izvodjenje_predstave get_izvodjenje_predstave(int id) {
		for(Izvodjenje_predstave x:sva_izvodjenja_predstave) {
			for(int t:x.id) {
				if(t==id) {
					return x;
				}
			}
		}
		return null;
	}
	
	public String toString() {
		String rez="";
		rez+="predstava: "+this.predstava+"\n";
		for(int x=0;x<this.pozoriste.size();x++) {
			rez+="id: "+this.id.get(x)+", pozoriste: "+this.pozoriste.get(x)+", cijena: "+this.cijena.get(x)+", datum i vrijeme: "+this.datum.get(x)+" "+this.vrijeme.get(x)+"\n";
		}
		return rez;
	}

}
