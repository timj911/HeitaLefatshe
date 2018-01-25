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

    private void onBtnSayHelloActionEvent(ActionEvent ev) {
        Dialog.show("Attention!","Hello from the other side","OK",null);
    }

    private int count = 0;

    private void onButtonActionEvent(ActionEvent ev) {
        gui_Label.setText("You clicked the button: "+ ++count +" times");
        
    }

    //-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.ui.Container gui_Box_Layout_Y = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
    private com.codename1.ui.Label gui_Label = new com.codename1.ui.Label();
    private com.codename1.ui.Button gui_BtnCount = new com.codename1.ui.Button();
    private com.codename1.ui.Button gui_BtnSayHello = new com.codename1.ui.Button();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void guiBuilderBindComponentListeners() {
        EventCallbackClass callback = new EventCallbackClass();
        gui_BtnSayHello.addActionListener(callback);
    }

    class EventCallbackClass implements com.codename1.ui.events.ActionListener, com.codename1.ui.events.DataChangedListener {
        private com.codename1.ui.Component cmp;
        public EventCallbackClass(com.codename1.ui.Component cmp) {
            this.cmp = cmp;
        }

        public EventCallbackClass() {
        }

        public void actionPerformed(com.codename1.ui.events.ActionEvent ev) {
            com.codename1.ui.Component sourceComponent = ev.getComponent();

            if(sourceComponent.getParent().getLeadParent() != null && (sourceComponent.getParent().getLeadParent() instanceof com.codename1.components.MultiButton || sourceComponent.getParent().getLeadParent() instanceof com.codename1.components.SpanButton)) {
                sourceComponent = sourceComponent.getParent().getLeadParent();
            }

            if(sourceComponent == gui_BtnSayHello) {
                onBtnSayHelloActionEvent(ev);
            }
        }

        public void dataChanged(int type, int index) {
        }
    }
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        guiBuilderBindComponentListeners();
        setLayout(new com.codename1.ui.layouts.LayeredLayout());
        setInlineStylesTheme(resourceObjectInstance);
                setInlineStylesTheme(resourceObjectInstance);
        setTitle("Dumela");
        setName("MyForm");
        addComponent(gui_Box_Layout_Y);
        gui_Box_Layout_Y.setPreferredSizeStr("213.59018mm 59.48349mm");
                gui_Box_Layout_Y.setInlineStylesTheme(resourceObjectInstance);
        gui_Box_Layout_Y.setName("Box_Layout_Y");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Box_Layout_Y.getParent().getLayout()).setInsets(gui_Box_Layout_Y, "1.6934805mm 0.0mm 64.276886% 1.4817953mm").setReferenceComponents(gui_Box_Layout_Y, "-1 -1 -1 -1").setReferencePositions(gui_Box_Layout_Y, "0.0 0.0 0.0 0.0");
        gui_Box_Layout_Y.addComponent(gui_Label);
        gui_Box_Layout_Y.addComponent(gui_BtnCount);
        gui_Box_Layout_Y.addComponent(gui_BtnSayHello);
        gui_Label.setPreferredSizeStr("62.235394mm inherit");
        gui_Label.setText("Hello World!");
                gui_Label.setInlineStylesTheme(resourceObjectInstance);
        gui_Label.setName("Label");
        gui_BtnCount.setPreferredSizeStr("16.51143mm inherit");
        gui_BtnCount.setText("Count");
                gui_BtnCount.setInlineStylesTheme(resourceObjectInstance);
        gui_BtnCount.setName("BtnCount");
        gui_BtnSayHello.setText("Say Hello");
                gui_BtnSayHello.setInlineStylesTheme(resourceObjectInstance);
        gui_BtnSayHello.setName("BtnSayHello");
        gui_Box_Layout_Y.setPreferredSizeStr("213.59018mm 59.48349mm");
                gui_Box_Layout_Y.setInlineStylesTheme(resourceObjectInstance);
        gui_Box_Layout_Y.setName("Box_Layout_Y");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Box_Layout_Y.getParent().getLayout()).setInsets(gui_Box_Layout_Y, "1.6934805mm 0.0mm 64.276886% 1.4817953mm").setReferenceComponents(gui_Box_Layout_Y, "-1 -1 -1 -1").setReferencePositions(gui_Box_Layout_Y, "0.0 0.0 0.0 0.0");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!

}
