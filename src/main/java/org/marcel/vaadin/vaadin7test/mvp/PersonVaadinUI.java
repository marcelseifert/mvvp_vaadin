package org.marcel.vaadin.vaadin7test.mvp;

import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import java.util.ArrayList;
import java.util.List;

/**
 * The Application's "main" class
 */
@SuppressWarnings("serial")
public class PersonVaadinUI extends CustomComponent implements PersonView {
  
    private Label output = new Label();
    private Button b = new Button("Click me"); 
     
    private final List<PersonViewActionHandler> handler = new ArrayList <PersonViewActionHandler>();
    
    public PersonVaadinUI() {
        HorizontalLayout layout = new HorizontalLayout();
        setCompositionRoot(layout);  
        layout.addComponent(output); 
        layout.addComponent(b); 
        b.addClickListener( new Button.ClickListener() {

            @Override
            public void buttonClick(ClickEvent event) {
                for(PersonViewActionHandler presenter : handler) {
                    presenter.doRandomStuff();
                }
            }
        });
    }

    @Override
    public void setValue(String something) {
      output.setValue(something);
    }

    @Override
    public void addPresenter(PersonViewActionHandler presenter) {
        handler.add(presenter);
    }
 
}
