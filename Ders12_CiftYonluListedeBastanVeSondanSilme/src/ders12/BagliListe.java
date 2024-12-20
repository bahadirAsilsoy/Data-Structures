package ders12;

public class BagliListe {
	//cift yönlü doğrusal baglı liste yapisi
	
	Node head = null;
	Node tail = null;
	
	void basaEkle(int data) {
		Node eleman = new Node(data);
		
		if(head == null) {
			head = eleman;
			tail = eleman;
			System.out.println("Listeye eleman eklendi");
		} else {
			eleman.next = head;
			head.prev = eleman;
			head = eleman;
			System.out.println("Listenin basına eleman eklendi");
		}
	}
	
	void sonaEkle(int data) {
		Node eleman = new Node(data);
		
		if(head == null) {
			head = eleman;
			tail = eleman;
			System.out.println("Listeye eleman eklendi");
		} else {
			eleman.prev = tail;
			tail.next = eleman;
			tail = eleman;
			System.out.println("Listenin sonuna eleman eklendi");
		}
	}
	
	void arayaEkle(int indis, int data) {
		// anlamadım
	}
	
	void bastanSil() {
		if(head == null) {
			System.out.println("Liste Bos");
		} else if(head.next == null) {
			head = null;
			tail = null;
			System.out.println("Listedeki tek elemanda silindi");
		} else {
			head = head.next;
			head.prev = null;
			System.out.println("Listenin basından eleman silindi");
		}
	}
	
	void sondanSil() {
		if(head == null) {
			System.out.println("Liste Bos");
		} else if (head.next == null) {
			head = null;
			tail = null;
			System.out.println("Listedeki tek elemanda silindi");
		} else {
			tail = tail.prev;
			tail.next = null;
			System.out.println("Listenin sonundan eleman silindi");
		}
	}
	
	void aradanSil(int indis) {
		if(head == null) {
			System.out.println("Liste Bos");
		} else if( head.next == null) {
			head = null;
			tail = null;
			System.out.println("Listedeki tek elemanda silindi");
		} else if(head.next != null && indis == 0) {
			head = head.next;
			head.prev = null;
			System.out.println("Listenin basından eleman silindi");
		} else {
			int i = 0;
			Node temp = head;
			while (temp != null) {
				i++;
				temp = temp.next;
			}
			if(indis == i-1) {
				tail = tail.prev;
				tail.next = null;
				System.out.println("Listenin sonundan eleman silindi");
			} else {
				 int j = 0;
				 temp = head;
				 while( j != indis) {
					 j++;
					 temp =temp.next;
				 }
				 temp.next.prev = temp.prev;
				 temp.prev.next = temp.next;
				 System.out.println("Listenin arasından eleman silindi");
			}
		}
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
