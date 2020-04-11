package modules;

import annotations.ColorValue;
import annotations.EdgeValue;
import com.google.inject.AbstractModule;
import com.google.inject.Scope;
import com.google.inject.Scopes;
import requests.SquareRequest;
import requests.SquareRequestSubclass;
import services.DrawSquareImpl;
import services.DrawShape;

import java.util.Scanner;

public class AppModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(DrawShape.class).to(DrawSquareImpl.class).in(Scopes.SINGLETON);
        //example for subclass of concrete class
        //bind(SquareRequest.class).to(SquareRequestSubclass.class);
        bind(String.class).annotatedWith(ColorValue.class).toInstance("RED");
        bind(Integer.class).annotatedWith(EdgeValue.class).toInstance(100);

        bind(SquareRequest.class).in(Scopes.SINGLETON);
    }
}
