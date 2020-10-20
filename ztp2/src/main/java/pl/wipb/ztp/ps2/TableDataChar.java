package pl.wipb.ztp.ps2;

public class TableDataChar implements TableData
{
    private char data;
    public TableDataChar() {data = (char)(rnd.nextInt(24) + 'a');}
    public String toString(){return Character.toString(data);}
}
