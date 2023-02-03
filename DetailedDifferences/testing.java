import java.util.Scanner;

public class testing{

    public static void main(String args[]){

        Scanner in = new Scanner(System.in);

        int size = in.nextInt();

        String[] strings = new String[size*2];

        for(int i = 0; i < size*2; i++){

            strings[i] = in.next();

        }

        for(int i = 0; i < size; i++){

            String x = strings[i*2];
            String y = strings[i*2+1];

            System.out.println(x);
            System.out.println(y);
            System.out.println(difference(x, y));
            System.out.println();


        }

    }

    public static String difference(String x, String y){

        String answ = "";

        for(int i = 0; i < x.length(); i++){

            if(x.charAt(i) == y.charAt(i)){

                answ += '.';

            }

            else{

                answ += '*';

            }

        }

        return answ;

    }

}