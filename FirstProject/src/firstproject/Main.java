/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstproject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
        
        Person ben = new Person("Ben", "Evans", new Voicemail("Ben's answering machine"));
        ben.setAge(38);
        ben.setFavoriteColor(Color.VIOLET);
        
        Person mum = new Person("Sue", "Evans", new Voicemail("Mum's answering machine"));
        mum.setAge(67);
        
        ben.setMother(mum);
        
        Person dad = new Person("Martin", "Evans", new Voicemail("Dad's answering machine"));
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
        
        
        Contactable o = new Student("Ben", "Evans", mum);
        
        o.callTwice();
//        c.contact();
//        c.getLastName(); 
        
    }

}
