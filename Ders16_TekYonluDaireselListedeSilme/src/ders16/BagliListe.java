package ders16;

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
	
	void bastanSil() {
		if(head == null) {
			System.out.println("Listede eleman yok");
		} else if(head.next == null) {
			head = null;
			tail = null;
			System.out.println("Listedeki son eleman silindi");
		} else {
			head = head.next;
			tail.next = head;
			System.out.println("Listenin basından eleman silindi");
		}
	}
	
	void sondanSil() {
		if(head == null) {
			System.out.println("Listede eleman yok");
		} else if(head.next == null) {
			head = null;
			tail = null;
			System.out.println("Listedeki son eleman silindi");
		} else {
			Node temp = head;
			
			while(temp.next != tail) { // dairesel bağlı listede (!= null) yerine (!= tail) kullanıyoruz. (temp != tail) ile sondan bir önceki elemanı temp ile bulduk
				temp = temp.next;
			}
			temp.next = head;
			tail = temp;
			System.out.println("Listenin sonundan eleman silindi");
		}
	}
	
	void aradanSil(int indis) {
		if(head == null) {
			System.out.println("Listede eleman yok");
		} else if(head.next == null) {
			head = null;
			tail = null;
			System.out.println("Listedeki son eleman silindi");
		} else {
			int j = 0;
			Node temp = head;
			Node temp2 = head;
			while(j != indis) {
				j++;
				temp2 = temp;
				temp = temp.next;
			}
			temp2.next = temp.next;
			tail.next = head;
			System.out.println("Listedenin arasından eleman silindi");
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

