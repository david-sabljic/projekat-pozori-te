package Projekat_OOP;

import java.util.ArrayList;

public class Posjetilac_pozorista extends Osoba{
	
	public static ArrayList <Posjetilac_pozorista> svi_posjetioci = new ArrayList<>();
	
	public Posjetilac_pozorista(int id,String ime, String prezime, String korisnicko_ime, String lozinka ) {
		super(id,ime,prezime,korisnicko_ime,lozinka);
		svi_posjetioci.add(this);
	}
	
	public Posjetilac_pozorista() {
		super();
	}
	
	public static ArrayList <Posjetilac_pozorista> get_svi_posjetioci(){
		return Posjetilac_pozorista.svi_posjetioci;
	}
	
	public static Posjetilac_pozorista get_posjetilac_pozorista(int id) {
		for(Posjetilac_pozorista x: svi_posjetioci) {
			if(x.id==id) {
				return x;
			}
		}
		return null;
	}
}
