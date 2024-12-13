package ders5;

public class Uygulama {

	public static void main(String[] args) {
		
		TekYonluListeYapisi tekYonList = new TekYonluListeYapisi();
		tekYonList.basaEkle(44);
		tekYonList.basaEkle(33);
		tekYonList.basaEkle(22);
		tekYonList.basaEkle(11);
		tekYonList.sonaEkle(55);
		tekYonList.basaEkle(5);
		
		System.out.println("Listenin basındaki dugum: " + tekYonList.head.data);
		System.out.println("Listenin sonundaki dugum: " + tekYonList.tail.data);
		
		tekYonList.yazdir();
	}

}