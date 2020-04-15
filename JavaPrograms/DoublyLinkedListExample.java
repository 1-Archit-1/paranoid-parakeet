public class DoublyLinkedListExample {
    private Link first;
    private Link last;

    public void DoublyLinkedList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    // insert new node at front
    public void insertFirst(long dd) {
        Link newLink = new Link(dd);

        if (isEmpty())
            last = newLink;
        else
            first.previous = newLink;
        newLink.next = first;
        first = newLink;
    }

    // insert new node at end
    public void insertLast(long dd) {
        Link newLink = new Link(dd);
        if (isEmpty())
            first = newLink;
        else {
            last.next = newLink;
            newLink.previous = last;
        }
        last = newLink;
    }

    // delete node at front
    public Link deleteFirst() {
        Link temp = first;
        if (first.next == null)
            last = null;
        else
            first.next.previous = null;
        first = first.next;
        return temp;
    }

    // delete node at end
    public Link deleteLast() {
        Link temp = last;
        if (first.next == null)
            first = null;
        else
            last.previous.next = null;
        last = last.previous;
        return temp;
    }

    // insert new node after specified node
    public boolean insertAfter(long key, long dd) {
        Link current = first;
        while (current.dData != key) {
            current = current.next;
            if (current == null)
                return false;
        }

        Link newLink = new Link(dd);

        if (current == last) {
            newLink.next = null;
            last = newLink;
        } else {
            newLink.next = current.next;

            current.next.previous = newLink;
        }

        newLink.previous = current;
        current.next = newLink;
        return true;
    }

    public Link deleteKey(long key) {
        Link current = first;
        while (current.dData != key) {
            current = current.next;
            if (current == null)
            return null;
        }
        if (current == first)
            first = current.next;
        else
            current.previous.next = current.next;

        if (current == last)
            last = current.previous;
        else
            current.next.previous = current.previous;
        return current;
    }

    // display items from beginning to end
    public void displayForward() {
        System.out.print("List (first to last): ");
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }

    // display items from end to beginning
    public void displayBackward() {
        System.out.print("List (last to first): ");
        Link current = last;
        while (current != null) {
            current.displayLink();
            current = current.previous;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedListExample theList = new DoublyLinkedListExample();

        theList.insertFirst(2);
        theList.insertFirst(4);
        theList.insertLast(3);
        theList.insertLast(5);

        theList.displayForward();
        theList.displayBackward();

        theList.deleteFirst();
        theList.deleteLast();
        theList.deleteKey(1);

        theList.displayForward();

        theList.insertAfter(2, 7); // insert 7 after 2
        theList.insertAfter(3, 8); // insert 8 after 3

        theList.displayForward();
    }
}