package visitor.visitable;

import visitor.visitor.Visitor;

public class Xml implements Visitable {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
