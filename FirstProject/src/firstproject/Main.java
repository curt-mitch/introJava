/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstproject;

/**
 *
 * @author curtismitchell
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Main m = new Main();
        m.run();
    }

    private void run() {
        Person p = new Person();
        p.setFirstName("Ben");
        p.setLastName("Evans");
        System.out.println(p.getFullName());
    }
    
}
