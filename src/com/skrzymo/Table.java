package com.skrzymo;

import java.util.ArrayList;

public class Table {

    // lista nagłówków
    private ArrayList<com.skrzymo.TableHeader> headers;
    // lista wierszy (każdy wiersz to lista komórek)
    private ArrayList<ArrayList<TableData>> rows;

    public Table()
    {
        headers = new ArrayList<com.skrzymo.TableHeader>();
        rows = new ArrayList<ArrayList<TableData>>();
    }
    // dodawanie wiersza
    public void addRow()
    {
        // nowy wiersz
        ArrayList<TableData> row = new ArrayList<TableData>();
        // wypełniamy komórkami - tyle, ile mamy kolumn
        for(com.skrzymo.TableHeader col:headers) {
            row.add(col.getTableData().clone());
        }
        // dodajemy do listy wierszy
        rows.add(row);
    }
    // dodawanie kolumny
    public void addCol(com.skrzymo.TableHeader header)
    {
        // dodajemy do listy nagłówków
        headers.add(header);
        // dodajemy po jednej komórce do każdego wiersza
        for(ArrayList<TableData> row:rows){
            row.add(header.getTableData().clone());
        }
    }
    // do wypisywania tabeli
    public String toString()
    {
        StringBuilder result = new StringBuilder();
        for(com.skrzymo.TableHeader header : headers)
            result.append("| " + header + " ");
        result.append("|\n");
        for(com.skrzymo.TableHeader header : headers)
            result.append("+----");
        result.append("+\n");
        for(ArrayList<TableData> row : rows)
        {
            for(TableData cell : row)
                result.append("| " + cell + " ");
            result.append("|\n");
        }
        return result.toString();
    }

}
