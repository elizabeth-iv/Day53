import java.util.Scanner;

public class CounterMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Create counter with given starting value");
        System.out.print("Enter value: ");
        int startValue = Integer.valueOf(scanner.nextLine());
        Counter countVal = new Counter(startValue);
        System.out.println(countVal);
        System.out.println("Enter value to increase by: ");
        int incrVal = Integer.valueOf(scanner.nextLine());
        countVal.increase(incrVal);
        System.out.println(countVal);
        System.out.println("Enter value to decrease by: ");
        int decrVal = Integer.valueOf(scanner.nextLine());
        countVal.decrease(decrVal);
        System.out.println(countVal);


    }
}
