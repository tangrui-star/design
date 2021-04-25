package FactoryDemo;

public class LogitechPeripheralFactory implements PeripheralFactory{
    @Override
    public Mouse createMouse() {
        return new LogitechMouse();
    }

    @Override
    public KeyBoard createKeyBoard() {
        return new LogitechKeyBoard();
    }
}
