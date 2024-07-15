package Projekat_OOP;

import java.util.ArrayList;

public class Osoblje {
	protected int id;
	protected String ime;
	protected String prezime;
	protected int tip_id;
	protected String tip;
	public static ArrayList <Osoblje> sve_osoblje = new ArrayList<>();
	
	public Osoblje(int id, String ime, String prezime, int tip) {
		this.id=id;
		this.ime=ime;
		this.prezime=prezime;
		this.tip_id=tip;
		if(tip==1) {
			this.tip="glumac";
		}
		else if(tip==2) {
			this.tip="režiser";
		}
		else if(tip==3) {
			this.tip="autor";
		}
		else {
			this.tip="";
		}
		sve_osoblje.add(this);
	}
	
	public Osoblje() {
		this.id=0;
		this.ime="";
		this.prezime="";
		this.tip_id=0;
		this.tip="";
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
	
	public int get_tip_id() {
		return this.tip_id;
	}
	
	public String get_tip() {
		return this.tip;
	}
	
	public static ArrayList <Osoblje> get_sve_osoblje(){
		return sve_osoblje;
	}
	
	public static Osoblje get_osoblje(int id) {
		for(Osoblje osoblje: sve_osoblje) {
			if(osoblje.get_id()==id) {
				return osoblje;
			}
		}
		return null;
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
	
	public void set_tip_id(int x) {
		this.tip_id=x;
	}
	
	public void set_tip(String x) {
		this.tip = x;
	}
	
	public String toString() {
		return "id: "+this.id+", ime: "+this.ime+", prezime: "+this.prezime+", tip: "+this.tip;
	}
}
