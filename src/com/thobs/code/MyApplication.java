package com.thobs.code;

import com.codename1.io.Log;
import com.codename1.ui.*;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.plaf.UIManager;
import com.codename1.ui.util.Resources;

import static com.codename1.ui.CN.getCurrentForm;

public class MyApplication {

    private Form current;
    private Resources theme;

    public void init(Object context) {
        theme = UIManager.initFirstTheme("/theme");

        // Enable Toolbar on all Forms by default
        Toolbar.setGlobalToolbar(true);

        // Pro only feature
        Log.bindCrashProtection(true);
    }
    
    public void start() {
        if(current != null){
            current.show();
            return;
        }
        showLoginForm();

    }

    public void stop() {
        current = getCurrentForm();
        if(current instanceof Dialog) {
            ((Dialog)current).dispose();
            current = getCurrentForm();
        }
    }
    
    public void destroy() {
    }

    private void showLoginForm() {
        Form loginForm = new Form();

        // the blue theme styles the title area normally this is good but in this case we don't want the blue bar at the top
        loginForm.getTitleArea().setUIID("Container");
        loginForm.setLayout(new BorderLayout());
        loginForm.setUIID("MainForm");
        Container cnt = new Container(new BoxLayout(BoxLayout.Y_AXIS));
        cnt.setUIID("Padding");
        Button loginWithGoogle = new Button("Signin with Google");
        Button loginWithFacebook = new Button("Signin with Facebook");
        cnt.addComponent(loginWithGoogle);
        cnt.addComponent(loginWithFacebook);
        loginWithGoogle.addActionListener((e) -> {
            //doLogin(GoogleConnect.getInstance());
        });
        loginWithFacebook.addActionListener((e) -> {
            //doLogin(FacebookConnect.getInstance());
        });
        loginForm.addComponent(BorderLayout.SOUTH, cnt);
        loginForm.show();
    }

}
