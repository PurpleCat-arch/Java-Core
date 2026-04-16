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

class User{
    int userId;
    String userName;

    User(int userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }
}

public class LibrarySystem {
    static Book[] books = new Book[100];
    static int count = 0;

    static void addBook(java.util.Scanner sc) {
    System.out.print("Enter Book ID: ");
    int id = sc.nextInt();
    sc.nextLine();

    System.out.print("Enter Book Name: ");
    String name = sc.nextLine();

    books[count++] = new Book(id, name);
    System.out.println("Book added!");
    }

    static void displayAvailableBooks() {
    for (int i = 0; i < count; i++) {
        if (!books[i].isIssued) {
            books[i].display();
        }
    }

    }

    static Book searchBook(String name) {
    for (int i = 0; i < count; i++) {
        if (books[i].name.equalsIgnoreCase(name)) {
            return books[i];
        }
    }
    return null;
    }

    static void issueBook(java.util.Scanner sc) {
    sc.nextLine();
    System.out.print("Enter Book Name: ");
    String name = sc.nextLine();

    Book book = searchBook(name);
    if (book != null) {
        book.issueBook();
    } else {
        System.out.println("Book not found!");
    }
    }

    
    public static void main(String[] args){

    }
}
