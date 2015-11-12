/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstproject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

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
        
        Person ben = new Person("Ben", "Evans");
        ben.setAge(38);
        
        Person mum = new Person("Sue", "Evans");
        mum.setAge(67);
        
        ben.setMother(mum);
        
        Person dad = new Person("Martin", "Evans");
        dad.setAge(68);
        
        List<Person> myFamily = new ArrayList<>();
        myFamily.add(ben);
        myFamily.add(mum);
        myFamily.add(dad); 
        
        double ave = 0.0;
        for (Iterator<Person> it = myFamily.iterator(); it.hasNext(); ) {
            Person p = it.next();
            ave += p.getAge();
        }
        
        ave /= myFamily.size();
        
        System.out.println(ave);
        
        
        Student o = new Student("Billy", "Bunter");
        Address a = new Address();
        a.setCity("London");
        a.setStreetAndHouseNumber("10 Downing Street");
        a.setPostcode("SW1A xxx");
        o.setAddr(a);
                
        System.out.println(o.getClass());
        
//        o = "Otter";
        System.out.println(o.getClass());
        
        if (o instanceof Person) {
            System.out.println("o is a person");
        }
    }

}
