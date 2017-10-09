package visitor.visitor;

import visitor.visitable.Csv;
import visitor.visitable.MySql;
import visitor.visitable.Xml;

public abstract class Visitor {

    public abstract void visit(MySql mySql);
    public abstract void visit(Csv csv);
    public abstract void visit(Xml xml);

}
