package jobsheet_16;
import java.util.Stack;
public class StackDemo {
    public static void main(String[] args) {
        Book book1 = new Book("1234", "Dasar Pemrograman");
        Book book2 = new Book("7145", "Hafalah Shalat Delisa");
        Book book3 = new Book("3562", "Muhammad AL-Fatih");

        Stack<Book> books = new Stack<>();
        books.push(book1);
        books.push(book2);
        books.push(book3);

        System.out.println("Peek Stack");
        Book temp = books.peek();

        if (temp != null) {
            System.out.println(temp.toString());
        }

        System.out.println("\nPop Stack");
        Book temp2 = books.pop();

        if (temp2 != null) {
            System.out.println(temp2.toString());
        }

        System.out.println("\nPrint Stack");
        for (Book book : books) {
            System.out.println(book.toString());
        }

        System.out.println("\nDebugging Stack");
        System.out.println(books);

        System.out.println("\nSearching Stack");
        int position = books.search(book2);
        if (position != -1) {
            System.out.println("Buku ditemukan di posisi: " + position);
        } else {
            System.out.println("Buku tidak ditemukan dalam stack.");
        }
    }
}
