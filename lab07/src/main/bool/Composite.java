package main.bool;

import java.util.ArrayList;


public class Composite implements BooleanNode {
    boolean status;

    ArrayList<BooleanNode> children = new arrayList<BooleanNode>();


    public Composite (boolean status) {
        super();
        this.status = status;
    }

    @Override
    public boolean evaluateBoolean() {
        
    }

    @Override
    public String printString() {
        
    }

    public boolean add(BooleanNode child) {
        children.add(child);
        return true;
    }

    public boolean remove(BooleanNode child) {
        children.remove(child);
        return false;
    }





}
