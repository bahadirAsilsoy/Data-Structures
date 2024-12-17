package ders15;

public class BagliListe {
	Node head = null;
	Node tail = null;
	
	void basaEkle(int data) {
		Node eleman = new Node(data);
		if(head == null) {
			head = eleman;
			tail = eleman;
			tail.next = head;
			System.out.println("Liste oluşturuldu.");
		} else {
			eleman.next = head;
			head = eleman;
			tail.next = head;
			System.out.println("Listenin başına eleman eklendi.");
		}
	}
	
	void sonaEkle(int data) {
		Node eleman = new Node(data);
		if(head == null) {
			head = eleman;
			tail = eleman;
			tail.next = head;
			System.out.println("Liste oluşturuldu.");
		} else {
			tail.next = eleman;
			tail = eleman;
			tail.next = head;
			System.out.println("Listenin sonuna eleman eklendi.");
		}
	}
	void arayaEkle(int indis, int data) {
		Node eleman = new Node(data);
		if(head == null) {
			head = eleman;
			tail = eleman;
			tail.next = head;
			System.out.println("Liste oluşturuldu.");
		} else if(head != null && indis == 0) {
			eleman.next = head;
			head = eleman;
			tail.next = head;
			System.out.println("Listenin başına eleman eklendi.");
		} else {
			int i = 0;
			Node temp = head;
			while(temp != tail) {
				i++;
				temp = temp.next;
			}
			i++; // BURAYA COK DİKKAT !!! i bir kere daha artıyor cünkü temp != null değil çünkü dairesel liste.
			if(i == indis) {
				tail.next = eleman;
				tail = eleman;
				tail.next = head;
				System.out.println("Listenin sonuna eleman eklendi.");
			} else {
				int j = 0;
				temp = head;
				Node temp2 = head;
				while ( j != indis ) {
					j++;
					temp2 = temp;
					temp = temp.next;
				}
				temp2.next = eleman;
				eleman.next = temp;
				System.out.println("Listenin arasına eleman eklendi.");
			}

		}
	}
	
	void yazdir() {
		if( head == null) {
			System.out.println("Liste bos");
		} else {
			Node temp = head;
			System.out.print("bas ->");
			while( temp != tail) {
				System.out.print(temp.data + " -> ");
				temp = temp.next;
			} System.out.print(temp.data + " -> son");
		}
	}
}
