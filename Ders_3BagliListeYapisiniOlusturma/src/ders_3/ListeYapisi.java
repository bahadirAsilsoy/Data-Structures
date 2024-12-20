package ders_3;

public class ListeYapisi {
	Node head = null;
	Node tail = null;
	
	void ekle (int x) {
		Node eleman = new Node(); // eklenecek olan dugum
		eleman.data = x;
		eleman.next = null;
		
		if (head == null) {
			head = eleman;
			tail = eleman;
			System.out.println("Liste basariyle olusturuldu ve ilk dugum eklendi");
		} else {
			tail.next = eleman;
			tail = eleman;
			System.out.println("Listeye sonuna yeni bir dugum eklendi");
		}
	}
	
	void yazdir () {
		if(head == null) {
			System.out.println("Liste yapisi bos!");
		} else {
			Node temp = head;
			System.out.print("bas -> ");
			while( temp != null) {
				System.out.print(temp.data + " -> ");
				temp = temp.next;
			}
			System.out.println("null");
		}
	}
}