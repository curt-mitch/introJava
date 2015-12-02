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
public class TestPerson {
    
    @Test
    public void testCreation() {
        Person p = new Person("Ben", "Evans", new Voicemail("Ben's answering machine"));
        
        // assertion that p.getFullName() == "Ben Evans"
    }
}
