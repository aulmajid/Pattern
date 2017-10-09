package visitor.visitable;

import visitor.visitor.Visitor;

public class MySql implements Visitable {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
