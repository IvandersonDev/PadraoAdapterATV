package Methods;

import Abstract.Keyboard;

public class USBKeyboard extends Keyboard {
    @Override
    public void connect() {
        System.out.println("Conectado a uma porta USB no teclado.");
    }
}