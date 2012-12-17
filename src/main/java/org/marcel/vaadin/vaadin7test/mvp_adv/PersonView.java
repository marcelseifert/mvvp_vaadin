/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.marcel.vaadin.vaadin7test.mvp_adv;

import com.vaadin.ui.Button;

/**
 *
 * @author Marcel
 */
public interface PersonView {
    
    void setName(String value);
    
    Button getActionButton();
      
}
