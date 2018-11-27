package com.skrzymo;

import java.util.Random;

public abstract class TableData {

    final static Random rnd = new Random();

    public abstract TableData clone();

}
