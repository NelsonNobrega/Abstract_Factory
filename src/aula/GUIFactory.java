package aula;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton(); // Método para criar um botão
    Checkbox createCheckbox(); // Método para criar uma caixa de seleção
}
