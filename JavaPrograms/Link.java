public class Link {
    long dData;
    Link previous, next;

    Link(long element) {
        this.dData = element;
    }

    void displayLink() {
        System.out.print(dData + " ");
    }
}