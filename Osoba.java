package Projekat_OOP;

import java.util.ArrayList;

public class Osoba {
	protected int id;
	protected String ime;
	protected String prezime;
	protected String korisnicko_ime;
	protected String lozinka;
	public static ArrayList <Osoba> sve_osobe = new ArrayList<>();
	
	public Osoba(int id,String ime, String prezime, String korisnicko_ime, String lozinka ) {
		this.id=id;
		this.ime=ime;
		this.prezime=prezime;
		this.korisnicko_ime=korisnicko_ime;
		this.lozinka=lozinka;
		sve_osobe.add(this);
	}
	
	public Osoba() {
		this.id=0;
		this.ime="";
		this.prezime="";
		this.korisnicko_ime="";
		this.lozinka="";
	}
	
	public int get_id() {
		return this.id;
	}
	
	public String get_ime() {
		return this.ime;
	}
	
	public String get_prezime() {
		return this.prezime;
	}
	
	public String get_korisnicko_ime() {
		return this.korisnicko_ime;
	}
	
	public String get_lozinka() {
		return this.lozinka;
	}
	
	public void set_id(int x) {
		this.id=x;
	}
	
	public void set_ime(String x) {
		this.ime = x;
	}
	
	public void set_prezime(String x) {
		this.prezime = x;
	}
	
	public void set_korisnicko_ime(String x) {
		this.korisnicko_ime = x;
	}
	
	public void set_lozinka(String x) {
		this.lozinka = x;
	}
	
	public String toString() {
		return "id: "+this.id+", ime: "+this.ime+", prezime: "+this.prezime+", korisnicko ime: "+this.korisnicko_ime+", lozinka: "+this.lozinka;
	}
}
