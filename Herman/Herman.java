import java.util.Scanner;

public class Herman{

    public static void main(String args[]){

        Scanner in = new Scanner(System.in);

        int radius = in.nextInt();
        radius *= radius;

        System.out.println(3.141592653589 * radius);
        System.out.println(2 * radius);

    }

}