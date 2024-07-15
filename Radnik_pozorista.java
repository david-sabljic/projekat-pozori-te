package Projekat_OOP;

import java.util.ArrayList;

public class Radnik_pozorista extends Osoba {
	protected Pozoriste pozoriste;
	public static ArrayList <Radnik_pozorista> svi_radnici_pozorista = new ArrayList<>();
	
	public Radnik_pozorista(int id, int id_pozorista, String ime, String prezime, String korisnicko_ime, String lozinka) {
		super(id,ime,prezime,korisnicko_ime,lozinka);
		this.pozoriste=Pozoriste.get_pozoriste(id_pozorista);
		svi_radnici_pozorista.add(this);
	}
	
	public Radnik_pozorista() {
		super();
		this.pozoriste=null;
	}
	
	public Pozoriste get_pozoriste() {
		return this.pozoriste;
	}
	
	public void set_pozoriste(Pozoriste x) {
		this.pozoriste=x;
	}
	
	public static ArrayList <Radnik_pozorista> get_sve_radnike_pozorista(){
		return svi_radnici_pozorista;
	}
	
	public String toString() {
		return super.toString()+", pozoriste: "+this.pozoriste;
		
	}
}
