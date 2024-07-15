package Projekat_OOP;

import java.util.ArrayList;

public class Pozoriste {
	protected int id;
	protected String naziv;
	protected String grad;
	protected int br_sjedista;
	public static ArrayList<Pozoriste> sva_pozorista = new ArrayList<>();
	
	public Pozoriste() {
		this.id=0;
		this.naziv="";
		this.grad="";
		this.br_sjedista=0;
	}
	
	public Pozoriste(int id,String naziv, String grad,int br_sjedista) {
		this.id=id;
		this.naziv=naziv;
		this.grad=grad;
		this.br_sjedista=br_sjedista;
		sva_pozorista.add(this);
	}
	
	public int get_id() {
		return this.id;
	}
	
	public String get_naziv() {
		return this.naziv;
	}
	
	public String get_grad() {
		return this.grad;
	}
	
	public int get_br_sjedista() {
		return br_sjedista;
	}
	
	public static ArrayList<Pozoriste> get_sva_pozorista(){
		return Pozoriste.sva_pozorista;
	}
	
	public void set_id(int x) {
		this.id=x;
	}
	
	public void set_naziv(String x) {
		this.naziv=x;
	}
	
	public void set_grad(String x) {
		this.grad=x;
	}
	
	public void set_br_sjedista(int x) {
		this.br_sjedista=x;
	}
	
	public String toString() {
		return "id: "+this.id+", naziv: "+this.naziv+", grad: "+this.grad+", br sjedista: "+this.br_sjedista;
	}
	
	public static Pozoriste get_pozoriste(int id) {
		for(Pozoriste pozoriste:sva_pozorista) {
			if(pozoriste.get_id()==id) {
				return pozoriste;
			}
		}
		return null;
	}
}
