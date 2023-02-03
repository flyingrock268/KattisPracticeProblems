import java.util.Scanner;

public class testing{

    public static void main(String args[]){

        Scanner in = new Scanner(System.in);

        int size = in.nextInt();

        int answ = 0;

        for(int i = 0; i < size; i++){

            if(in.nextInt() < 0){

                answ++;

            }

        }

        System.out.println(answ);


    }

}