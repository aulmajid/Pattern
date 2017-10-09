package visitor.visitor;

import visitor.visitable.Csv;
import visitor.visitable.MySql;
import visitor.visitable.Xml;

public class PrintVisitor extends Visitor{

    @Override
    public void visit(MySql mySql) {
        System.out.println("Printing mysql");
    }

    @Override
    public void visit(Csv csv) {
        System.out.println("Printing csv");
    }

    @Override
    public void visit(Xml xml) {
        System.out.println("Printing xml");
    }

}
