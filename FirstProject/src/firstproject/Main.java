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
    }

    private void run() {
        Person p = new Person();
//        p.setFirstName("Ben");
        p.setFirstName("Ben");
        p.setLastName("Evans");
        p.setAge(38);

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

        for (int i=0; i<40; i++) {
            System.out.println(Math.random());
        }
        
        int i = 0;
        
        try {
            i = Integer.parseInt("42gwgwgge");
        } catch (Exception e) {
        
        }
        
        System.out.println(5 + i);
    }

}
