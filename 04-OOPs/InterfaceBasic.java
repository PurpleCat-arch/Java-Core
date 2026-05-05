interface Printable {
    void print(); // Abstract by default
}

class Document implements Printable {
    public void print() {
        System.out.println("Printing document...");
    }
}

public class InterfaceBasic {
    public static void main(String[] args) {
        Document doc = new Document();
        doc.print();
    }
}
