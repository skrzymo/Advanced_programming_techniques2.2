package com.skrzymo;

public class TableDataBool extends TableData {

    private boolean data;

    public TableDataBool() {

        data = rnd.nextBoolean();
    }

    @Override
    public String toString() {
        return Boolean.toString(data);
    }

    @Override
    public TableData clone() {
        return new TableDataBool();
    }
}
