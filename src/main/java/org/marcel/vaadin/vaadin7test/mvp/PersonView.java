/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.marcel.vaadin.vaadin7test.mvp;

/**
 *
 * @author Marcel
 */
public interface PersonView {
    
    void setValue(String something);
    
    void addPresenter(PersonViewActionHandler presenter);
    
    interface PersonViewActionHandler {
    
        void doRandomStuff(); 
    }
}
