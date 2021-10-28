import java.util.*;

public class AddNumberThree {


        public static void main(String[] args) {

            int test = plusThree();

        }

        public static int plusThree(){

            int x = 3;

            Scanner sc = new Scanner( System.in );
            System.out.println("Enter a number: ");
            int a = sc.nextInt();

            int result = a + x ;
            System.out.print ("Your Total number plus 3 is: "+ result);
            return result;
        }

}
