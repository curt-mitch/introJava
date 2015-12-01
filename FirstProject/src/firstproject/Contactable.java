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
public interface Contactable {
    
    public void contact();
    
    public default void callTwice() {
        contact();
        contact();
    }
}
