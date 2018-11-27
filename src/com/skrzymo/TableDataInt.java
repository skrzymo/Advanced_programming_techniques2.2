package com.skrzymo;

public class TableDataInt extends TableData {

    private int data;

    public TableDataInt() {

        data = 10 + rnd.nextInt(90);
    }

    @Override
    public String toString() {
        return Integer.toString(data);
    }

    @Override
    public TableData clone() {
        return new TableDataInt();
    }
}
