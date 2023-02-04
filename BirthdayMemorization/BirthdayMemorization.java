import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class BirthdayMemorization{

    public static void main(String args[]){

        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        HashMap<String, friend> friends = new HashMap<String, friend>();
        LinkedList<friend> list = new LinkedList<friend>();

        for(int i = 0; i < num; i++){

            friend temp = new friend(in.next(), in.nextInt());

            String date = in.next();

            if(friends.get(date) == null || friends.get(date).val < temp.val){

                friends.put(date, temp);

            }

        }

        for (friend x : friends.values()) {

            list.add(x);

        }


        Collections.sort(list);

        System.out.println(list.size());

        for (friend friend : list) {
            
            System.out.println(friend.getName());

        }

    }

}

