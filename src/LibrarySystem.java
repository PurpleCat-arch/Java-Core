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

    
}

public class LibrarySystem {
    public static void main(String[] args){

    }
}
