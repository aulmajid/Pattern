package visitor;

import visitor.visitable.Csv;
import visitor.visitable.MySql;
import visitor.visitable.Xml;
import visitor.visitor.PrintVisitor;
import visitor.visitor.ToJsonVisitor;

public class VisitorDemo {

    public static void main(String[] args) {
        PrintVisitor printVisitor = new PrintVisitor();
        ToJsonVisitor toJsonVisitor = new ToJsonVisitor();

        MySql mySql = new MySql();
        Csv csv = new Csv();
        Xml xml = new Xml();

        mySql.accept(printVisitor);
        csv.accept(toJsonVisitor);
        xml.accept(printVisitor);
    }

}
