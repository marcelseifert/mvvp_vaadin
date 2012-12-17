package org.marcel.vaadin.vaadin7test.mvp_adv;

import org.marcel.vaadin.vaadin7test.*;
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
import org.marcel.vaadin.vaadin7test.mvp_adv.PersonView;

/**
 * The Application's "main" class
 */
@SuppressWarnings("serial")
public class ApplicationControllerUI extends UI  {
   
    private  PersonVaadinUI ui = new PersonVaadinUI();
    private  PersonPresenter presenter;
   
    @Override
    protected void init(VaadinRequest request) {
        final HorizontalLayout layout = new HorizontalLayout();
         
        layout.setMargin(true);
        setContent(layout); 
         
        layout.addComponent(ui);
        
        presenter = new PersonPresenter(ui);
        presenter.bind();
        
    }
   
    @Override
    public void close() {
        super.close(); 
        presenter.unbind(); 
    }
}
