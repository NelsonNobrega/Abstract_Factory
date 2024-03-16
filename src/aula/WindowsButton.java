package aula;

/**
 * All products families have the same varieties (MacOS/Windows).
 *
 * This is another variant of a button.
 */
public class WindowsButton implements Button {

    @Override
    public void paint() { //ness classe o WindowsButton implementa a interface Button
        System.out.println("You have created WindowsButton.");
    }
}