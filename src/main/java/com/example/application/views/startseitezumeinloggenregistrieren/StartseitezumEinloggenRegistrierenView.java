package com.example.application.views.startseitezumeinloggenregistrieren;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.H5;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import jakarta.annotation.security.PermitAll;

@PageTitle("Startseite zum Einloggen/ Registrieren")
@Route(value = "my-view2")
@PermitAll
@Uses(Icon.class)
public class StartseitezumEinloggenRegistrierenView extends Composite<VerticalLayout> {

    public StartseitezumEinloggenRegistrierenView() {
        FormLayout formLayout2Col = new FormLayout();
        H5 h5 = new H5();
        H5 h52 = new H5();
        FormLayout formLayout2Col2 = new FormLayout();
        LoginForm loginForm = new LoginForm();
        LoginForm loginForm2 = new LoginForm();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        formLayout2Col.setWidth("100%");
        h5.setText("RECOON");
        h5.setWidth("min-content");
        h52.setText("DIE ENTSPANNTE WEBAPP UM EINE ZWEITBETREUUNG FÜR DEINE BACHELORARBEIT ZU FINDEN");
        h52.setWidth("min-content");
        formLayout2Col2.setWidth("100%");
        loginForm.setWidth("500px");
        loginForm.setHeight("800px");
        loginForm2.setWidth("100%");
        loginForm2.setHeight("800px");
        getContent().add(formLayout2Col);
        formLayout2Col.add(h5);
        formLayout2Col.add(h52);
        getContent().add(formLayout2Col2);
        formLayout2Col2.add(loginForm);
        formLayout2Col2.add(loginForm2);
    }
}
