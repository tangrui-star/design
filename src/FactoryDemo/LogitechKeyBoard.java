package FactoryDemo;

public class LogitechKeyBoard implements KeyBoard{
    @Override
    public String click() {
        return "罗技键盘按下";
    }
}
