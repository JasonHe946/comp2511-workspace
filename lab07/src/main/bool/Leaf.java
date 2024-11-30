package main.bool;

public class Leaf implements BooleanNode {

    boolean status;

    public Leaf (boolean status) {
        super();
        this.status = status;
    }

    @Override
    public boolean evaluateBoolean() {
        return this.status;
    }

    @Override
    public String printString() {
        return this.status;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}   
