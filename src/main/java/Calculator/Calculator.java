package Calculator;

import javax.swing.undo.StateEdit;

public class Calculator {
    private int firstValue;
    private int secondValue;
    private char operation;
    private State state;

    public int getFirstValue(){
        return firstValue;
    }
    public void setFirstValue(int firstValue){
        this.firstValue = firstValue;
    }

    public int getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(int secondValue) {
        this.secondValue = secondValue;
    }

    public char getOperation() {
        return operation;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public State getState(){
        return state;
    }

    public void setState(State state){
        this.state = state;
    }

    Calculator(){

    }

}
