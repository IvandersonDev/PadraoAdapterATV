package Methods;

import Abstract.Keyboard;
import Interfaces.USBDevice;

public class KeyboardAdapter implements USBDevice {
    private Keyboard keyboard;

    public KeyboardAdapter(Keyboard keyboard) {
        this.keyboard = keyboard;
    }
    @Override
    public void connectUSB() {
        System.out.println("Adaptando conexão do teclado para USB.");
        keyboard.connect();
        System.out.println("Conectado a uma porta USB no gabinete.");
    }
}