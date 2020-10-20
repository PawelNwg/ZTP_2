package pl.wipb.ztp.ps2;

public class TableHeaderInt extends TableHeader
{
    public TableHeaderInt()
    {
        type = "Int";
    }

    public TableData createTable() {return new TableDataInt();}
}
