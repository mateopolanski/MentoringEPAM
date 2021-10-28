import java.util.*;

public class AddNumberThree {


        public static void main(String[] args) {

            int test = plusThree();
            System.out.print(test);
        }

        public static int plusThree(){

            Scanner sc = new Scanner( System.in );
            System.out.println("Enter a number: ");
            int i = 2;
            int j = sc.nextInt();

            int result = i + j;
            System.out.print ("Your Total number plus 3 is: "+ result);
            return result;
        }

}
