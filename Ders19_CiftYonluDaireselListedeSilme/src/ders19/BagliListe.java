package ders19;

public class BagliListe {
	Node head = null;
	Node tail = null;
	
	void basaEkle (int data) {
		Node eleman = new Node(data);
		
		if( head == null) {
			head = eleman;
			tail = eleman;
			tail.next = head;
			head.prev = tail;
			tail.prev = head; // dizide sadece 1 eleman oldugu icin
			head.next = tail; // dizide sadece 1 eleman oldugu icin
			System.out.println("Liste olusturuldu.");
		} else {
			eleman.next = head;
			head.prev = eleman;
			head = eleman;
			tail.next = head;
			head.prev = tail;
		}
	}
	
	void sonaEkle(int data) {
		Node eleman = new Node(data);
		if (head == null) {
			head = eleman;
			tail = eleman;
			head.prev = tail;
			head.next = tail;
			tail.prev = head; // dizide sadece 1 eleman oldugu icin
			tail.next = head; // dizide sadece 1 eleman oldugu icin
		} else {
			eleman.prev = tail;
			tail.next = eleman;
			tail = eleman;
			tail.next = head;
			head.prev = tail;
		}
	}
	
	void arayaEkle(int indis ,int data) {
		Node eleman = new Node(data);
		if (head == null) {
			head = eleman;
			tail = eleman;
			head.next = tail;
			head.prev = tail;
			tail.next = head;
			tail.prev = head;
		} else {
			int j = 0;
			Node temp = head;
			Node temp2 = head;
			while(j != indis) {
				j++;
				temp2 = temp;
				temp = temp.next;
			}
			temp2.next = eleman;
			temp.prev = eleman;
			eleman.next = temp;
			eleman.prev = temp2;
			tail.next = head;
			head.prev = tail;
		}
	}
	
	void bastanSil() {
		if(head == null) {
			System.out.println("Liste bos!");
		} else if (head == tail) { // dairesel olduğu için head.next == null kontrolü işe yaramaz!
			head = null;
			tail = null;
			System.out.println("listedeki tek eleman silindi.");
		} else {
			head = head.next;
			tail.next = head;
			head.prev = tail;
			System.out.println("Listenin basından eleman silindi.");
		}
	}
	
	void sondanSil() {
		if(head == null) {
			System.out.println("Liste bos!");
		} else if (head == tail) { // dairesel olduğu için head.next == null kontrolü işe yaramaz!
			head = null;
			tail = null;
			System.out.println("listedeki tek eleman silindi.");
		} else {
			tail = tail.prev;
			tail.next = head;
			head.prev = tail;
		}
	}
	
	void aradanSil(int indis) {
		if(head == null) {
			System.out.println("Liste bos!");
		} else {
			int j = 0;
			Node temp = head;
			while( j != indis) {
				j++;
				temp = temp.next;
			}
			temp.prev.next = temp.next;
			temp.next.prev = temp.prev;
		}
	}
	
	void yazdir() {
		if( head == null) {
			System.out.println("Liste bos!");
		} else {
			Node temp = head;
			System.out.print("bas ->");
			while(temp != tail) {
				System.out.print(temp.data + " -> ");
				temp = temp.next;
			} System.out.println(temp.data +" -> son.");
		}
	}
}