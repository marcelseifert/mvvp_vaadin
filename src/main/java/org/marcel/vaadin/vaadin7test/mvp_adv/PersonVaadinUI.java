package org.marcel.vaadin.vaadin7test.mvp_adv;

import org.marcel.vaadin.vaadin7test.*;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;
import java.util.ArrayList;
import java.util.List;
import org.marcel.vaadin.vaadin7test.mvp_adv.PersonView;

/**
 * The Application's "main" class
 */
@SuppressWarnings("serial")
public class PersonVaadinUI extends CustomComponent implements PersonView {
  
    private Label output = new Label();
    private Button b = new Button("Click me"); 
     
    public PersonVaadinUI() {
        HorizontalLayout layout = new HorizontalLayout();
        setCompositionRoot(layout);  
        layout.addComponent(output); 
        layout.addComponent(b); 
    }

    @Override
    public void setName(String value) {
        output.setValue(value);
    }

    @Override
    public Button getActionButton() {
       return b;
    }
}
