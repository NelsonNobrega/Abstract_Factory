package aula;

/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */
public class Application { // Declara��o de uma vari�vel para o bot�o e caixa
    private Button button; 
    private Checkbox checkbox; 

    public Application(GUIFactory factory) {
        // Aqui, criamos um bot�o e uma caixa de sele��o usando a f�brica passada como argumento.
        button = factory.createButton(); 
        checkbox = factory.createCheckbox(); 
    }

    public void paint() {
        // Aqui, o m�todo paint() e chamado para o bot�o e a caixa de sele��o.
        
        button.paint(); 
        checkbox.paint(); 
    }
}
