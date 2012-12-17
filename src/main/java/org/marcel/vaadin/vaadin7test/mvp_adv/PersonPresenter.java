/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.marcel.vaadin.vaadin7test.mvp_adv;

import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;

/**
 *
 * @author Marcel
 */
public class PersonPresenter implements Presenter, Button.ClickListener{
    private final PersonView view;

    public PersonPresenter(PersonView view) {
        this.view = view;
    }
    @Override
    public void bind() {
        view.getActionButton().addClickListener(this);
    }

    @Override
    public void unbind() {
         view.getActionButton().removeClickListener(this);
    }

    @Override
    public void buttonClick(ClickEvent event) {
        view.setName("Hallo");
    }
         
    
}
