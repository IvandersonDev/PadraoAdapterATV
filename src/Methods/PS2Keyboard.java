package Methods;

import Abstract.Keyboard;

public class PS2Keyboard extends Keyboard {
    @Override
    public void connect() {
        System.out.println("Conectado a uma porta PS2 no teclado.");
    }
}