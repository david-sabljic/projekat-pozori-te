package Projekat_OOP;

import java.util.ArrayList;

public class Predstava {
	protected int id;
	protected String naziv;
	protected int zanr_id;
	protected String zanr;
	public static ArrayList <Predstava> sve_predstave = new ArrayList<>();
	
	public Predstava(int id, String naziv, int zanr) {
		this.id=id;
		this.naziv=naziv;
		this.zanr_id=zanr;
		if(zanr==1) {
			this.zanr="komedija";
		}
		else if(zanr==2) {
			this.zanr="farsa";
		}
		else if(zanr==3) {
			this.zanr="satira";
		}
		else if(zanr==4) {
			this.zanr="komedija restauracije";
		}
		else if(zanr==5) {
			this.zanr="tragedija";
		}
		else if(zanr==6) {
			this.zanr="istorija";
		}
		else if(zanr==7) {
			this.zanr="mjuzikl";
		}
		else {
			this.zanr="";
		}
		sve_predstave.add(this);
	}
	
	public Predstava() {
		this.id=0;
		this.naziv="";
		this.zanr_id=0;
		this.zanr="";
	}
	
	public int get_id() {
		return this.id;
	}
	
	public String get_naziv() {
		return this.naziv;
	}
	
	public int get_zanr_id() {
		return this.zanr_id;
	}
	
	public String get_zanr() {
		return this.zanr;
	}
	
	public static ArrayList <Predstava> get_sve_predstave(){
		return sve_predstave;
	}
	
	public static Predstava get_predstavu(int id) {
		for(Predstava predstava: sve_predstave) {
			if(predstava.get_id()==id) {
				return predstava;
			}
		}
		return null;
	}
	
	public void set_id(int x) {
		this.id=x;
	}
	
	public void set_naziv(String x) {
		this.naziv=x;
	}
	
	public void set_zanr_id(int x) {
		this.zanr_id=x;
	}
	
	public void set_zanr(String x) {
		this.zanr=x;
	}
	
	public String toString() {
		return "id: "+this.id+", naziv: "+this.naziv+", zanr: "+this.zanr;
	}
	
	public boolean uporedi_predstavu(Predstava x) {
		if(this.naziv==x.get_naziv()) {
			return true;
		}
		return false;
	}
}
