package aula;

/**
 * Demo class. Everything comes together here.
 */
public class Demo {

    /**
     * Application picks the factory type and creates it at run time (usually at
     * initialization stage), depending on the configuration or environment
     * variables.
     */
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory(); // Cria uma fábrica específica para sistemas Mac
        } else {
            factory = new WindowsFactory(); // Cria uma fábrica específica para sistemas Windows
        }
        app = new Application(factory); // Cria uma instância da aplicação com a fábrica escolhida
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication(); // Configura a aplicação com a fábrica adequada
        app.paint(); // Renderiza os componentes da aplicação
    }
}
