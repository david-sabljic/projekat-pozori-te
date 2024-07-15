package Projekat_OOP;

import java.util.ArrayList;

public class Karta {
	protected int id;
	protected Izvodjenje_predstave izvodjenje_predstave;
	protected int status_id;
	protected String status;
	protected Posjetilac_pozorista posjetilac_pozorista;
	protected int broj_karte;
	public static ArrayList <Karta> sve_karte = new ArrayList<>();
	
	public Karta(int id,int izvodjenje_predstave_id, int status, int posjetilac_pozorista_id, int broj_karte) {
		this.id=id;
		this.izvodjenje_predstave=Izvodjenje_predstave.get_izvodjenje_predstave(izvodjenje_predstave_id);
		this.status_id=status;
		if(status==1) {
			this.status="karta kupljena nekoristeći ovu aplikaciju";
		}
		else if(status==2) {
			this.status="rezervisana karta koristeći ovu aplikaciju ali nije preuzeta";
		}
		else if(status==3) {
			this.status="rezervisana karta koristeći ovu aplikaciju i preuzeta";
		}
		else {
			this.status="";
		}
		this.posjetilac_pozorista=Posjetilac_pozorista.get_posjetilac_pozorista(posjetilac_pozorista_id);
		this.broj_karte=broj_karte;
		sve_karte.add(this);
	}
	
	public String toString() {
		return "id: "+this.id+", izvodjenje predstave: "+this.izvodjenje_predstave+"status: "+this.status+"\nposjetilac pozorista: "+this.posjetilac_pozorista+", broj karte: "+this.broj_karte;
	}
}
