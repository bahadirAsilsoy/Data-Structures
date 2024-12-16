package ders5;

public class TekYonluListeYapisi {
	
	Node head = null;
	Node tail = null;
	
	
	void basaEkle(int x) {
		Node eleman = new Node();
		eleman.data = x;
		
		if(head == null) {
			eleman.next = null;
			head = eleman;
			tail = eleman;
			System.out.println("Liste olusturuldu.");
		} else {
			eleman.next = head;
			head = eleman;
			System.out.println("Listenin basına eleman eklendi.");
		}
	}
	
	void sonaEkle(int x) {
		Node eleman = new Node();
		eleman.data = x;
		
		if(head == null) {
			head = eleman;
			tail = eleman;
			System.out.println("Liste olusturuldu.");
		} else {
			tail.next = eleman;
			tail = eleman;
			System.out.println("Listenin sonuna eleman eklendi.");
		}
	}
	
	void arayaEkle() {
		// anlamadım.
	}
	
	void yazdir() {
		if(head == null) {
			System.out.println("Liste bos!");
		} else {
			Node temp = head;
			System.out.print("bas");
			while(temp != null) {
				System.out.print(" -> "+temp.data);
				temp = temp.next;
			}
			System.out.println(" -> null");
		}
	}
}