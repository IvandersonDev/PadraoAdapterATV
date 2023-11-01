package Methods;

import Interfaces.USBDevice;

class USBGabinete implements USBDevice {
    @Override
    public void connectUSB() {
        System.out.println("Conectado a uma porta USB no gabinete.");
    }
}