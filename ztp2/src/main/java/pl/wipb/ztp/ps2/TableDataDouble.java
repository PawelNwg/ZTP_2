package pl.wipb.ztp.ps2;

public class TableDataDouble implements TableData
{
    private double data;
    public TableDataDouble() {data = rnd.nextDouble();}
    public String toString() {return Double.toString(data);}
}
