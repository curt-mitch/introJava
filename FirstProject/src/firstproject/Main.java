/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstproject;

import java.io.IOException;

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
        System.in.read();
    }

    private void run() {
        Person p = new Person();
//        p.setFirstName("Ben");
        p.setFirstName("Ben");
        p.setLastName("Evans");
        p.setAge(21);

        Person mom = new Person();
        mom.setFirstName("Sue");
        mom.setLastName("Evans");

        AGE: while (p.getAge() < 55) {
            switch (p.getAge()) {
                case 40:
                    System.out.println(p.getFullName() + " - Significant Birthday ; " + p.getAge());
                    break;
            
                case 50:
                    System.out.println(p.getFullName() + " - Significant Birthday ; " + p.getAge());
                    break AGE;
            }

            p.birthday();
        }
        
        System.out.println(p.getFullName() + " : Age: " + p.getAge());
    }

}
