package ders16;

public class Uygulama {

	public static void main(String[] args) {
	
		BagliListe TekYonluDaireselListe = new BagliListe();
		
		TekYonluDaireselListe.basaEkle(8);
		TekYonluDaireselListe.basaEkle(6);
		TekYonluDaireselListe.basaEkle(4);
		TekYonluDaireselListe.basaEkle(2);
		
		TekYonluDaireselListe.sonaEkle(11);
		TekYonluDaireselListe.sonaEkle(13);
		
		TekYonluDaireselListe.arayaEkle(3, 7);
		TekYonluDaireselListe.arayaEkle(1, 3);
		
		//TekYonluDaireselListe.bastanSil();
		//TekYonluDaireselListe.sondanSil();
		
		TekYonluDaireselListe.aradanSil(1);

		TekYonluDaireselListe.yazdir();
	}

}
