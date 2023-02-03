import java.util.LinkedList;
import java.util.Scanner;

public class testing{

    public static void main(String args[]){

        Scanner in = new Scanner(System.in);

        LinkedList<LinkedList<Double>> xs = new LinkedList<LinkedList<Double>>();
        LinkedList<LinkedList<Double>> ys = new LinkedList<LinkedList<Double>>();

        for(int times = 0; times < 25; times++){

            int sides = in.nextInt();

            if(sides <= 0){

                break;

            }

            xs.add(new LinkedList<Double>());
            ys.add(new LinkedList<Double>());

            for (int i = 0; i < sides; i++) {
                
                xs.get(times).add(in.nextDouble());
                ys.get(times).add(in.nextDouble());

            }
    
        }

        for(int times = 0; times < xs.size(); times++){

            double sum = 0;
            //System.out.println();

            for(int i = 0; i < xs.get(times).size(); i++){

                if(i == xs.get(times).size() - 1){

                    sum += (xs.get(times).get(0) - xs.get(times).get(i)) * (ys.get(times).get(0) + ys.get(times).get(i));

                }

                else{

                    sum += (xs.get(times).get(i+1) - xs.get(times).get(i)) * (ys.get(times).get(i+1) + ys.get(times).get(i));

                }

            }

            if(sum < 0){

                System.out.print("CCW ");

            }

            else{

                System.out.print("CW ");

            }

            System.out.print(String.format("%.1f",Math.abs(sum/2)));
            System.out.println();


        }

    }
}