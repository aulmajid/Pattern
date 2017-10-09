package visitor.visitable;

import visitor.visitor.Visitor;

public interface Visitable {

    public void accept(Visitor visitor);

}
