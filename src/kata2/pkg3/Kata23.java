/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2.pkg3;

import java.util.ArrayList;


public class Kata23 {

    public static void main(String[] args) {
        ArrayList<Integer> people = new ArrayList<>();
        for (int i = 0; i < 4000000; i++) {
            people.add((int)(Math.random()*100));
        }
        ArrayList<Integer> elderPeople = new ArrayList<>();
        for (Integer value : people) {
            if(value>=70)elderPeople.add(value);
        }
        int addition=0;
        for (Integer value : elderPeople) {
            addition+=value;
        }
        System.out.println(addition + " años viejos");
        addition=0;
        for (Integer value : people) {
            addition+=value;
        }
        System.out.println(addition + " años totales");
    }
}
