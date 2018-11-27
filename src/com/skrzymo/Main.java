package com.skrzymo;

public class Main {

    public static void main(String[] args) {

        Table table = new Table();
        table.addCol(new TableHeader(new TableDataInt()));
        table.addCol(new TableHeader(new TableDataDouble()));
        table.addCol(new TableHeader(new TableDataBool()));
        table.addCol(new TableHeader(new TableDataFloat()));
        table.addCol(new TableHeader(new TableDataString()));

        table.addRow();
        table.addRow();
        table.addRow();
        table.addRow();
        table.addRow();
        System.out.println(table);


        //table.addCol(new TableHeader("IJ"));
        table.addRow();
        table.addRow();
        System.out.println(table);

    }
}
