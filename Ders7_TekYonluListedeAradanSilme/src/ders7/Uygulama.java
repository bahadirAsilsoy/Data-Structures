package ders7;

public class Uygulama {

	public static void main(String[] args) {
		
		TekYonluListeYapisi tekYonList = new TekYonluListeYapisi();
		tekYonList.basaEkle(44);
		tekYonList.basaEkle(33);
		tekYonList.basaEkle(22);
		tekYonList.basaEkle(11);
		tekYonList.sonaEkle(55);
		tekYonList.basaEkle(5);
		
		tekYonList.aradanSil(5);


		
		tekYonList.yazdir();
	}

}