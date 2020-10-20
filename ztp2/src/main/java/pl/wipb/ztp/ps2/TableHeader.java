package pl.wipb.ztp.ps2;

abstract class TableHeader {

    protected String type;

    public TableHeader() { }

    public String toString() {
        return type;
    }

    public abstract TableData createTable ();

}
