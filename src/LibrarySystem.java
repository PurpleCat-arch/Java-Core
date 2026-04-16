class Book{
    int id;
    String name;
    boolean isIssued;

    Book(int id, String name) {
    this.id = id;
    this.name = name;
    this.isIssued = false;
    }

   // Issue Book Method
    void issueBook() {
    if (!isIssued) {
        isIssued = true;
        System.out.println("Book issued successfully.");
    } else {
        System.out.println("Book already issued.");
    }
    }

    void returnBook() {
    if (isIssued) {
        isIssued = false;
        System.out.println("Book returned successfully.");
    } else {
        System.out.println("Book was not issued.");
    }
    }

    void display() {
    System.out.println("ID: " + id + ", Name: " + name +
            ", Status: " + (isIssued ? "Issued" : "Available"));
    }

}

public class LibrarySystem {
    public static void main(String[] args){

    }
}
