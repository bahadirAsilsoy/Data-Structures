package ders10;

public class Uygulama {

	public static void main(String[] args) {
		BagliListe CiftYonluDogrusalListe = new BagliListe();
		
		CiftYonluDogrusalListe.basaEkle(5);
		CiftYonluDogrusalListe.basaEkle(4);
		CiftYonluDogrusalListe.basaEkle(3);
		
		CiftYonluDogrusalListe.sonaEkle(6);
		CiftYonluDogrusalListe.sonaEkle(7);
		
		CiftYonluDogrusalListe.bastanYazdir();
		System.out.println();
		CiftYonluDogrusalListe.sondanYazdir();
	}

}
