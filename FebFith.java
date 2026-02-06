import java.util.*;
public class FebFith {

    public static ArrayList<Integer> name( ArrayList<Integer> list){

        ArrayList<Integer> newList = new ArrayList<Integer>(); 
        //newList = list;

        for(int i = 0; i < list.size(); i++){

            newList.add(i, list.get(i));
            newList.add(i + 1, list.get(i));

            System.out.println(newList);
        }

        return newList;
    }

    public static void main(String[]args){
        ArrayList<Integer> newList = new ArrayList<Integer>(); 
        newList.add(5);
        newList.add(6);
        newList.add(7);
        newList.add(8);
        newList.add(9);
        System.out.println("fgldflg");
        System.out.println(name(newList));
    }
}