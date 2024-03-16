package aula;

/**
 * All products families have the same varieties (MacOS/Windows).
 *
 * This is another variant of a checkbox.
 */
public class WindowsCheckbox implements Checkbox {

    @Override
    public void paint() { // A classe chamada WindowsCheckbox que implementa a interface Checkbox
        System.out.println("You have created WindowsCheckbox.");
    }
}