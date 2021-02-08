/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workingwitharraylists;

/**
 *
 * @author SHEKHAR
 */
import java.util.ArrayList;

public class WorkingWithArrayLists {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates an arraylist with an initial size of 5
        ArrayList<String> colors = new ArrayList<String>(5);
        colors.add("red");
        colors.add("blue");
        colors.add("green");
        colors.add("black");
        colors.add("orange");
        colors.remove("black");
        System.out.println(colors.contains("red"));
        System.out.println(colors.get(1));
        System.out.println("Size of this ArrayList is: "+ colors.size());
        //colors.clear(); -This removes all elements from the array list
    }
    
}
