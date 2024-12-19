package ders18;

public class Uygulama {

	public static void main(String[] args) {
	
		BagliListe CiftYonluDaireselListe = new BagliListe();
		
		CiftYonluDaireselListe.basaEkle(8);
		CiftYonluDaireselListe.basaEkle(6);
		CiftYonluDaireselListe.basaEkle(4);
		CiftYonluDaireselListe.basaEkle(2);
		
		CiftYonluDaireselListe.sonaEkle(11);
		CiftYonluDaireselListe.sonaEkle(13);
		
		CiftYonluDaireselListe.arayaEkle(3, 7);
		CiftYonluDaireselListe.arayaEkle(1, 3);

		CiftYonluDaireselListe.yazdir();
	}

}
