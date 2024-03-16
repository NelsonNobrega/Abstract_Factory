package aula;

/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */
public class Application { // Declaração de uma variável para o botão e caixa
    private Button button; 
    private Checkbox checkbox; 

    public Application(GUIFactory factory) {
        // Aqui, criamos um botão e uma caixa de seleção usando a fábrica passada como argumento.
        button = factory.createButton(); 
        checkbox = factory.createCheckbox(); 
    }

    public void paint() {
        // Aqui, o método paint() e chamado para o botão e a caixa de seleção.
        
        button.paint(); 
        checkbox.paint(); 
    }
}
