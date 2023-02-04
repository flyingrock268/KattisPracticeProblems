public class friend implements Comparable<friend>{

    String name;
    int val;

    public friend(String name, int val){

        this.name = name;
        this.val = val;

    }

    public String getName(){

        return name;

    }

    public int getVal(){

        return val;

    }

    @Override
    public int compareTo(friend x){

        return this.name.compareTo(x.name);

    }

}