import java.util.ArrayList;
import java.util.Scanner;

public class TvShowMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<TvShow> list = new ArrayList<>();

        while(true) {
            System.out.println("Name of the show: ");
            String showName = scanner.nextLine();

            if(showName.equals("")) {
                break;
            }
            System.out.println("How many episodes? ");
            int numOfEpisodes = Integer.valueOf(scanner.nextLine());

            System.out.println("What is the genre? ");

            String genre = scanner.nextLine();

            list.add(new TvShow(showName,numOfEpisodes, genre));
        }
        for(Object TvShow: list) {
            System.out.println(TvShow.toString());
        }



    }

}
