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

@SuppressWarnings("unused")
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

    static void returnBook(java.util.Scanner sc) {
    sc.nextLine();
    System.out.print("Enter Book Name: ");
    String name = sc.nextLine();

    Book book = searchBook(name);
    if (book != null) {
        book.returnBook();
    } else {
        System.out.println("Book not found!");
    }
    }

    static void showIssuedBooks() {
    for (int i = 0; i < count; i++) {
        if (books[i].isIssued) {
            books[i].display();
        }
    }
    }


    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);

    while (true) {
        System.out.println("\n1.Add Book 2.Available 3.Issue 4.Return 5.Search 6.Issued 7.Exit");
        int ch = sc.nextInt();

        switch (ch) {
            case 1 -> addBook(sc);
            case 2 -> displayAvailableBooks();
            case 3 -> issueBook(sc);
            case 4 -> returnBook(sc);
            case 5 -> {
                sc.nextLine();
                System.out.print("Enter Book Name: ");
                Book b = searchBook(sc.nextLine());
                if (b != null) b.display();
                else System.out.println("Not found");
                }
            case 6 -> showIssuedBooks();
            case 7 -> {
                return;
                }
            default -> System.out.println("Invalid choice!");
        }
    }
}
}