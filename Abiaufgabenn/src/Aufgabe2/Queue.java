package Aufgabe2;

public class Queue {
private LinkedList first = null;

	public void enqueue(Object d) {
		LinkedList n = new LinkedList(d, null);
		if (first == null) {
			first = n;
		} else {
			LinkedList l = first;
			while (l.getNext() != null) {
				l = l.getNext();
			}
			l.setNext(n);
		}
	}
}
