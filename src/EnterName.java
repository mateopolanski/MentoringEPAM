import java.util.*;

public class EnterName {

    public static void main(String[] args) {

        String initial = "World";
        System.out.println("Hello " +initial);

        System.out.println("Dear User, What is Your Name?");

        Scanner scanner = new Scanner(System.in);
        initial = scanner.nextLine();

        System.out.println("Hello " +initial +", You are my World now");

    }

}
