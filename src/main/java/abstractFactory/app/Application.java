package abstractFactory.app;

import abstractFactory.buttons.Button;
import abstractFactory.checkboxes.CheckBox;
import abstractFactory.factory.GUIFactory;


/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */


public class Application {
    private Button btn;
    private CheckBox ckb;

    public Application(GUIFactory factory){
        btn = factory.createButton();
        ckb = factory.createCheckBox();
    }

    public void paint(){
        btn.paint();
        ckb.paint();
    }
}
