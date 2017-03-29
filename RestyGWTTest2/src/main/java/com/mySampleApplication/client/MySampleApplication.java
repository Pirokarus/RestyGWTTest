package com.mySampleApplication.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.user.client.ui.*;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.mySampleApplication.shared.Responce;
import org.fusesource.restygwt.client.Defaults;
import org.fusesource.restygwt.client.Method;
import org.fusesource.restygwt.client.MethodCallback;

/**
 * Entry point classes define <code>onModuleLoad()</code>
 */
public class MySampleApplication implements EntryPoint {

    /**
     * This is the entry point method.
     */
    public void onModuleLoad() {

        Defaults.setServiceRoot(com.google.gwt.core.client.GWT.getHostPageBaseURL());

        final Button button = new Button("Click me");
        final Label label = new Label("x");
       final EndPoint endPoint = GWT.create(EndPoint.class);
        final String y = "y";

        button.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {

                endPoint.responce(new MethodCallback<Responce>(){

                    public void onFailure(Method method, Throwable throwable) {
                        throw new RuntimeException("call faild");
                    }

                    public void onSuccess(Method method, Responce response) {
                        String a = response.getA();

                        label.setText(a);
                    }
                });
            }
        });


        RootPanel.get("slot1").add(button);
        RootPanel.get("slot2").add(label);
    }

}
