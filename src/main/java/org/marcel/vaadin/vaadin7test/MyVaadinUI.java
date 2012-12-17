package org.marcel.vaadin.vaadin7test;

import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;
import java.util.ArrayList;
import java.util.List;
import org.marcel.vaadin.vaadin7test.mvp.PersonView;

/**
 * The Application's "main" class
 */
@SuppressWarnings("serial")
public class MyVaadinUI extends UI implements PersonView, Button.ClickListener {
 
    private List<PersonView.PersonViewActionHandler> presenter = new ArrayList<PersonView.PersonViewActionHandler>();
    
    private Label output = new Label();
    @Override
    protected void init(VaadinRequest request) {
        HorizontalLayout content = new HorizontalLayout();
        content.setSizeFull(); // Use entire window
        
        // Add some component
        content.addComponent(output);
        
        Button b = new Button("Click me");
        b.addClickListener(this);
        
      
    }

    @Override
    public void setValue(String something) { 
        output.setValue(something);
    }

    @Override
    public void addPresenter(PersonViewActionHandler handler) {
         presenter.add(handler);
    }

    @Override
    public void buttonClick(ClickEvent event) {
        for(PersonViewActionHandler handler: presenter) {
            handler.doRandomStuff();
        }
    }

}
