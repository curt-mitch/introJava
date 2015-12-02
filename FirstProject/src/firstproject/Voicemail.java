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
public class Voicemail implements Contactable {
    
    private final String name;
    
    public Voicemail(String myName) {
        name = myName;
    }
    
    @Override
    public void contact() {
        System.out.println(name + " took a message.");
    }
    
}
