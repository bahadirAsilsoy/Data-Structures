package ders11;


public class BagliListe {
	//cift yönlü doğrusal baglı liste yapisi
	
	Node head = null;
	Node tail = null;
	
	void basaEkle(int data) {
		Node eleman = new Node(data);
		
		if(head == null) {
			head = eleman;
			tail = eleman;
		} else {
			eleman.next = head;
			head.prev = eleman;
			head = eleman;
		}
	}
	
	void sonaEkle(int data) {
		Node eleman = new Node(data);
		
		if(head == null) {
			head = eleman;
			tail = eleman;
		} else {
			eleman.prev = tail;
			tail.next = eleman;
			tail = eleman;
		}
	}
	
	void arayaEkle(int indis, int data) {
		// anlamadım
	}
	
	void bastanYazdir() {
		Node temp = head;
		System.out.print("head -> ");
		while(temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.print("son");
	}
	void sondanYazdir() {
		Node temp = tail;
		System.out.print("son -> ");
		while(temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.prev;
		}
		System.out.print("bas");
	}
}
