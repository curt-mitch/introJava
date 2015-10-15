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
        
        Map<String, Person> myFamily = new HashMap<>();
        myFamily.put("me", ben);
        myFamily.put("mum", mum);
        myFamily.put("dad", dad);
        
        double ave = 0.0;
        for (String s : myFamily.keySet()) {
            Person p = myFamily.get(s);
            ave += p.getAge();
        }
        
        ave = ave / myFamily.size();
        
        System.out.println(ave);
        System.out.println(myFamily.get("dad"));
    }

}
