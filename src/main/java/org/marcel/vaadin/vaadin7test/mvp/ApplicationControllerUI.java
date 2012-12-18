package org.marcel.vaadin.vaadin7test.mvp;

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
public class ApplicationControllerUI extends UI   {
 
    
    @Override
    protected void init(VaadinRequest request) {
        HorizontalLayout content = new HorizontalLayout();
        content.setSizeFull(); // Use entire window
        
        PersonVaadinUI ui = new PersonVaadinUI();
        new PersonPresenter(new PersonModell(), ui);
        
        // Add some component
        content.addComponent(ui);
         
        
      
    }

}
