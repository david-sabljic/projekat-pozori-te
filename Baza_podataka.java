package Projekat_OOP;

import java.sql.*;

public class Baza_podataka {

	public static void Povuci_podatke_iz_baze() {
		
		//uspostavljanje konekcije sa bazom
		Connection con = null;
	    PreparedStatement p = null;
	    ResultSet rs = null;
	    con=Konekcija.konektuj_bazu_podataka();
	    
	    // upis posjetilaca pozorista iz baze
	    try {
	        String sql = "select * from posjetilac_pozorista";
	        p = con.prepareStatement(sql);
	        rs = p.executeQuery();
	        while (rs.next()) {
	            int id = rs.getInt("id");
	            String ime = rs.getString("ime");
	            String prezime = rs.getString("prezime");
	            String korisnicko_ime = rs.getString("korisnicko_ime");
	            String lozinka = rs.getString("lozinka");
	            new Posjetilac_pozorista(id,ime,prezime,korisnicko_ime,lozinka);
	        }
	    }
	    catch (SQLException e) {
	        System.out.println(e);
	    }
	    
	    // upis pozorista iz baze
	    try {
	        String sql = "select * from pozoriste";
	        p = con.prepareStatement(sql);
	        rs = p.executeQuery();
	        while (rs.next()) {
	            int id = rs.getInt("id");
	            String naziv = rs.getString("naziv");
	            String grad = rs.getString("grad");
	            int br_sjedista = rs.getInt("broj_sjedista");
	            new Pozoriste(id,naziv,grad,br_sjedista);
	        }
	    }
	    catch (SQLException e) {
	        System.out.println(e);
	    }
	    
	    // upis radnika pozorista iz baze
	    try {
	        String sql = "select * from radnik_pozorista";
	        p = con.prepareStatement(sql);
	        rs = p.executeQuery();
	        while (rs.next()) {
	        	int id = rs.getInt("id");
	        	int id_pozorista= rs.getInt("pozoriste_id");
	            String ime = rs.getString("ime");
	            String prezime = rs.getString("prezime");
	            String korisnicko_ime = rs.getString("korisnicko_ime");
	            String lozinka = rs.getString("lozinka");
	            new Radnik_pozorista(id,id_pozorista,ime,prezime,korisnicko_ime,lozinka);
	        }
	    }
	    catch (SQLException e) {
	        System.out.println(e);
	    }
	    
	    // upis predstava iz baze
	    try {
	        String sql = "select * from predstava";
	        p = con.prepareStatement(sql);
	        rs = p.executeQuery();
	        while (rs.next()) {
	        	int id = rs.getInt("id");
	            String naziv = rs.getString("naziv");
	            int zanr = rs.getInt("zanr");
	            new Predstava(id,naziv,zanr);
	        }
	    }
	    catch (SQLException e) {
	        System.out.println(e);
	    }
	    
	    // upis osoblja iz baze
	    try {
	        String sql = "select * from osoblje";
	        p = con.prepareStatement(sql);
	        rs = p.executeQuery();
	        while (rs.next()) {
	        	int id = rs.getInt("id");
	            String ime = rs.getString("ime");
	            String prezime = rs.getString("prezime");
	            int tip = rs.getInt("tip");
	            new Osoblje(id,ime,prezime,tip);
	        }
	    }
	    catch (SQLException e) {
	        System.out.println(e);
	    }
	    
	 // upis osoblja predstave iz baze
	    try {
	        String sql = "select * from osoblje_predstave";
	        p = con.prepareStatement(sql);
	        rs = p.executeQuery();
	        while (rs.next()) {
	        	int id = rs.getInt("id");
	            int osoblje_id = rs.getInt("osoblje_id");
	            int predstava_id = rs.getInt("predstava_id");
	            new Osoblje_predstave(id,predstava_id,osoblje_id);
	        }
	    }
	    catch (SQLException e) {
	        System.out.println(e);
	    }
	    
	 // upis izvodjenja predstave iz baze
	    try {
	        String sql = "select * from izvodjenje_predstave";
	        p = con.prepareStatement(sql);
	        rs = p.executeQuery();
	        while (rs.next()) {
	        	int id = rs.getInt("id");
	        	int predstava_id = rs.getInt("predstava_id");
	            int pozoriste_id = rs.getInt("pozoriste_id");
	            double cijena=rs.getDouble("cijena");
	            Date datum=rs.getDate("datum_i_vrijeme");
	            Time vrijeme=rs.getTime("datum_i_vrijeme");
	            new Izvodjenje_predstave(id,predstava_id,pozoriste_id,cijena,datum,vrijeme);
	        }
	    }
	    catch (SQLException e) {
	        System.out.println(e);
	    }
	    
	    // upis karte iz baze
	    try {
	        String sql = "select * from karta";
	        p = con.prepareStatement(sql);
	        rs = p.executeQuery();
	        while (rs.next()) {
	        	int id = rs.getInt("id");
	        	int izvodjenje_predstave_id = rs.getInt("izvodjenje_predstave_id");
	            int status = rs.getInt("status");
	            int posjetilac_id = rs.getInt("posjetilac_id");
	            int broj_karta=rs.getInt("broj_karta");
	            new Karta(id,izvodjenje_predstave_id,status,posjetilac_id,broj_karta);
	        }
	    }
	    catch (SQLException e) {
	        System.out.println(e);
	    }
	}
	
}
