package pl.wipb.ztp.ps2;

public class TableHeaderBoolean extends TableHeader
{

    public TableHeaderBoolean()
    {
        type = "Boolean";
    }

    public TableData createTable() {return new TableDataBoolean();}
}
