package pl.wipb.ztp.ps2;

public class TableHeaderChar extends TableHeader
{
    public TableHeaderChar()
    {
        type = "Character";
    }

    public TableData createTable() {return new TableDataChar();}
}
