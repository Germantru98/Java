package patterns.Fabric.factories;

import patterns.Fabric.buttons.Button;
import patterns.Fabric.buttons.MacOSButton;
import patterns.Fabric.checkboxes.Checkbox;
import patterns.Fabric.checkboxes.MacOSCheckbox;
import patterns.Fabric.factories.GUIFactory;

/**
 * Каждая конкретная фабрика знает и создаёт только продукты своей вариации.
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}