public class CopyConstructor {
    String title;
    String author;

    public CopyConstructor(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public CopyConstructor(CopyConstructor original) {
        this.title = original.title;
        this.author = original.author;
    }

    public static void main(String[] args) {
        CopyConstructor book1 = new CopyConstructor("1984", "George Orwell");
        CopyConstructor book2 = new CopyConstructor(book1);
        System.out.println("Copied Book: " + book2.title + " by " + book2.author);
    }
}
