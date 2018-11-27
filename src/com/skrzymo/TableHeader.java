package com.skrzymo;

public class TableHeader {

    private String name;
    private TableData tableData;

    public TableHeader(TableData tableData)
    {
        this.name = tableData.getClass().getName().replaceFirst("com.skrzymo.TableData", "");
        this.tableData = tableData;
    }

    public TableData getTableData() {
        return tableData;
    }

    public String toString()
    {
        return name;
    }
}
