/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.marcel.vaadin.vaadin7test.mvp;

/**
 *
 * @author Marcel
 */
public class PersonPresenter implements PersonView.PersonViewActionHandler {

    private PersonModell model;
    private PersonView view;
    
    public PersonPresenter(PersonModell person, PersonView view) {
        this.model = person;
        this.view = view;
        view.addPresenter(this);
    }
    
    
    @Override
    public void doRandomStuff() {
       view.setValue(model.getName());
    }
    
}
