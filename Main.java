package Projekat_OOP;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		Baza_podataka.Povuci_podatke_iz_baze();
		launch(args);

	}

	@Override
	public void start(Stage pocetni_prozor) throws Exception {
		// TODO Auto-generated method stub
		pocetni_prozor.show();
	}

}
