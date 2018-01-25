package com.thobs.code;

import com.codename1.ui.Dialog;
import com.codename1.ui.events.ActionEvent;

public class MyForm extends com.codename1.ui.Form {
    public MyForm() {
        this(com.codename1.ui.util.Resources.getGlobalResources());
    }
    
    public MyForm(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }

    public void onButtonActionEvent(ActionEvent ev) {
        Dialog.show("Hello","Sho!","Eswaar!",null);
    }

    //-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.ui.Label gui_Label = new com.codename1.ui.Label();
    private com.codename1.ui.Button gui_Button = new com.codename1.ui.Button();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.LayeredLayout());
        setInlineStylesTheme(resourceObjectInstance);
                setInlineStylesTheme(resourceObjectInstance);
        setTitle("MyForm");
        setName("MyForm");
        addComponent(gui_Label);
        addComponent(gui_Button);
        gui_Label.setText("Label");
                gui_Label.setInlineStylesTheme(resourceObjectInstance);
        gui_Label.setName("Label");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Label.getParent().getLayout()).setInsets(gui_Label, "14.956737% auto auto 29.121422%").setReferenceComponents(gui_Label, "-1 -1 -1 -1").setReferencePositions(gui_Label, "0.0 0.0 0.0 0.0");
        gui_Button.setText("Button");
                gui_Button.setInlineStylesTheme(resourceObjectInstance);
        gui_Button.setName("Button");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Button.getParent().getLayout()).setInsets(gui_Button, "auto auto 0.0mm 46.100693%").setReferenceComponents(gui_Button, "-1 -1 0 -1").setReferencePositions(gui_Button, "0.0 0.0 0.0 0.0");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
    

}
