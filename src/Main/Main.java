package Main;

import Abstract.Keyboard;
import Interfaces.USBDevice;
import Methods.KeyboardAdapter;
import Methods.PS2Keyboard;
import Methods.USBKeyboard;

public class Main {
    public static void main(String[] args) {

        Keyboard ps2Keyboard = new PS2Keyboard();
        Keyboard usbKeyboard = new USBKeyboard();
        // Crie um adaptador para conectar o teclado PS2 ao gabinete USB
        USBDevice ps2Adapter = new KeyboardAdapter(ps2Keyboard);
        // Conecte o teclado PS2 ao gabinete USB usando o adaptador
        ps2Adapter.connectUSB();
    }
}