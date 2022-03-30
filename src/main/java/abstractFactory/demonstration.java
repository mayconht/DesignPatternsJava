package abstractFactory;

import abstractFactory.app.Application;
import abstractFactory.factory.GUIFactory;
import abstractFactory.factory.MacOsFactory;
import abstractFactory.factory.WindowsFactory;

/**
* This is where everything comes together
* */

public class demonstration {
    /**
     * Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or environment
     * variables.
     */

    private static Application configureApplication(){
        Application app;
        GUIFactory factory;

        String osName = System.getProperty("os.name").toLowerCase();
        if(osName.contains("mac")){
            factory = new MacOsFactory();
        }else{
            factory = new WindowsFactory();
        }

        app = new Application(factory);
        return app;
    }

    public static void main (String[] args){
        Application app = configureApplication();
        app.paint();
    }
}
