package Calculator;

public abstract class State {
    abstract void clearCalc(Calculator calculator);
    abstract void selectDigit(Calculator calculator, char key);
    abstract void selectArithOperation(Calculator calculator, char key);
    abstract void getResult(Calculator calculator);
}
