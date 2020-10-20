package pl.wipb.ztp.ps2;

public class TableHeaderDouble extends TableHeader
{
    public TableHeaderDouble()
    {
        type = "Double";
    }

    public TableData createTable() {return new TableDataDouble();}
}
