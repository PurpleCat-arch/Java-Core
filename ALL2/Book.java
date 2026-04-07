class Book {
    String title;
    String author;

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    public static void main(String[] args) {
        Book b = new Book();
        b.title = "Java Basics";
        b.author = "James";
        b.display();
    }
}