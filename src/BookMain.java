import java.util.ArrayList;
import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> list = new ArrayList<>();
        while(true) {
            System.out.println("Please enter a book title");
            String bookTitle = scanner.nextLine();
            if(bookTitle.equals("")){
                break;
            }
            System.out.println("How many pages does it have?");
            int numOfPages = Integer.valueOf(scanner.nextLine());

            System.out.println("What year was it published?");
            int pubYear = Integer.valueOf(scanner.nextLine());

            list.add(new Book(bookTitle, numOfPages, pubYear));
        }

        while (true) {
            System.out.println("What information will be printed? Everything or Name");
            String infoToBePrinted = scanner.nextLine();
            if (infoToBePrinted.equals("")){
                break;
            }
            if (infoToBePrinted.equalsIgnoreCase("everything")) {
                for (Object Book : list) {
                    System.out.println(Book.toString());

                }
                break;
            }
            if (infoToBePrinted.equalsIgnoreCase("name")) {
                for (Book Book : list) {
                    System.out.println(Book.getbookTitle());

                }
                break;
            }
        }
    }
}