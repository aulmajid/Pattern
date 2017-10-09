package visitor.visitable;

import visitor.visitor.Visitor;

public class Csv implements Visitable {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
