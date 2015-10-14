/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstproject;

import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author curtismitchell
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Main m = new Main();
        m.run();
    }

    private void run() {   
        
        Person ben = new Person();
        ben.setFirstName("Ben");
        ben.setLastName("Evans");
        ben.setAge(38);
        
        Person mum = new Person();
        mum.setFirstName("Sue");
        mum.setLastName("Evans");
        mum.setAge(67);
        
        ben.setMother(mum);
        
        Person dad = new Person();
        dad.setFirstName("Martin");
        dad.setLastName("Evans");
        dad.setAge(68);
        
        Person[] myFamily = {ben, mum, dad};
        System.out.println(Arrays.toString(myFamily));
        
        double ave = 0.0;
        for (Person p : myFamily) {
            ave += p.getAge();
        }
        
        ave = ave / myFamily.length;
        
        System.out.println(ave);
    }

}
