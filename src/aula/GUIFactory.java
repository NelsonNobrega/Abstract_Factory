package aula;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton(); // M�todo para criar um bot�o
    Checkbox createCheckbox(); // M�todo para criar uma caixa de sele��o
}
