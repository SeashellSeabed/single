import java.util.ArrayList;

import java.util.*;

public class findDuplicates {

    public static boolean findDuplicates(ArrayList <Integer> array){
        
        for(int i = 0; i < array.size(); i++){

            for(int j = i + 1; j < array.size(); j++){

                    if(array.get(i) == array.get(j)){

                        return true;
                    }
            }
        }
        
        
        
        
        
        
        
        return false;


    }

    public static void main(String[]args){

        ArrayList <Integer> array = new ArrayList<Integer>();

        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(6);
        array.add(7);
        array.add(8);
        array.add(9);
        array.add(9);

        System.out.println(findDuplicates(array));
    }
    
}
