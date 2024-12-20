package ders7;

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
	
	void bastanSilme() {
		if(head == null) {
			System.out.println("Liste bos!");
		} else if(head.next == null) {
			head = null;
			tail = null;
			System.out.println("Listedeki son eleman bastan silindi.");
		} else {
			head = head.next;
			System.out.println("Listenin baş elamanı silindi.");
		}
	}
	
	void sondanSilme() {
		if(head == null) {
			System.out.println("Liste bos!");
		} else if(head.next == null) {
			head = null;
			tail = null;
			System.out.println("Listedeki son eleman sondan silindi.");
		} else {
			Node temp = head;
			Node temp2 = head;
			while(temp.next != null) {
				temp2 = temp;
				temp = temp.next;
			}
			temp2.next = null;
			tail = temp2;
			System.out.println("Listenin son elemanı silindi.");
		}
	}
	
	void aradanSil(int indis) {
		if(head == null) {
			System.out.println("Liste bos!");
		} else if(head.next == null && indis == 0) {
			head = null;
			tail = null;
			System.out.println("Listedeki son eleman sondan silindi.");
		} else if(head.next != null && indis == 0) {
			head = head.next;
			System.out.println("Listenin baş elamanı silindi.");
		} else {
			int i = 0;
			Node temp = head;
			Node temp2 = head;
			while(temp != null) {
				i++;
				temp2 = temp;
				temp = temp.next;
			} if(i == indis) {
				temp2.next = null;
				tail = temp2;
				System.out.println("Listenin son elamanı silindi.");
			} else {
				int j = 0;
				temp = head;
				temp2 = head;
				while(j != indis) {
					j++;
					temp2 = temp;
					temp = temp.next;
				}
				temp2.next = temp.next;
				System.out.println("Listenin arasından eleman silindi.");
			}
		}
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
