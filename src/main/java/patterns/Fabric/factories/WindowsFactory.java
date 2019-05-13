package patterns.Fabric.factories;

import patterns.Fabric.factories.GUIFactory;
import patterns.Fabric.buttons.Button;
import patterns.Fabric.buttons.WindowsButton;
import patterns.Fabric.checkboxes.Checkbox;
import patterns.Fabric.checkboxes.WindowsCheckbox;

/**
 * Каждая конкретная фабрика знает и создаёт только продукты своей вариации.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}