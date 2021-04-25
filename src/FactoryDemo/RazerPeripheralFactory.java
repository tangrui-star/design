package FactoryDemo;

public class RazerPeripheralFactory implements PeripheralFactory{
    @Override
    public Mouse createMouse() {
        return  new RazerMouse();
    }

    @Override
    public KeyBoard createKeyBoard() {
        return new RazerKeyBoard();
    }
}
