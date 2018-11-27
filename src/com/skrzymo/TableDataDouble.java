package com.skrzymo;

import java.text.DecimalFormat;

public class TableDataDouble extends TableData {

    private double data;
    private DecimalFormat df = new DecimalFormat("#.00");

    public TableDataDouble() {

        data = 10.0 + rnd.nextDouble() * 90.0;
    }

    @Override
    public String toString() {
        return df.format(data);
    }

    @Override
    public TableData clone() {
        return new TableDataDouble();
    }
}

