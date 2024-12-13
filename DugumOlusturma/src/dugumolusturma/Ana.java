package dugumolusturma;

public class Ana {
	public static void main(String[] args) {
		
		Sinif A = new Sinif(); // bellekte dügüm olusturduk.
		Sinif B = new Sinif();
		Sinif C = new Sinif();
		
		A.sayi = 11; // dügümlere degerlerini atıyoruz.
		B.sayi = 22;
		C.sayi = 33;
	
		A.next = B;
		B.next = C;
		C.next = null;
		
		Sinif temp = A;
		
		while (temp != null) { // dügümlerin üzerinde dolastık
			System.out.println(temp.sayi);
			temp = temp.next;
		}
	}
}
