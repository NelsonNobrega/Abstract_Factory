package aula;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class WindowsFactory implements GUIFactory { // A  classe chamada WindowsFactory que implementa a interface GUIFactor

    @Override
    public Button createButton() { //As classes abaixo s�o m�todos de cria��o
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}