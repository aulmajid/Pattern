package visitor.visitor;

import visitor.visitable.Csv;
import visitor.visitable.MySql;
import visitor.visitable.Xml;

public class ToJsonVisitor extends Visitor {

    @Override
    public void visit(MySql mySql) {
        System.out.println("Converting mysql to json");
    }

    @Override
    public void visit(Csv csv) {
        System.out.println("Converting mysql to json");
    }

    @Override
    public void visit(Xml xml) {
        System.out.println("Converting mysql to json");
    }
}
