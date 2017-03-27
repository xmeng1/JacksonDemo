/**
 * User:    mengxin
 * Date:    27/03/17
 * Project: JacksonDemo
 */
public class AbstractParentObject<P> extends AbstractObject{

    //@JsonProperty(DataNamingStrategy.DATA_FIELD)
    P parent;

//    public String getTypeOfParent() {
//        return this.parent.getClass().getSimpleName();
//    }

    public AbstractParentObject(String id, String name, P parent, String pa) {
        super(id, name);
        this.parent = parent;
        this.pa = pa;
    }

    public String getPa() {
        return pa;
    }

    public void setPa(String pa) {
        this.pa = pa;
    }

    String pa;

    AbstractParentObject(String id, String name, P parent) {
        super(id, name);
        this.parent = parent;
    }

    public P getParent() {
        return parent;
    }

    //@Logger(name = "xxx")
    public void setParent(P parent) {
        this.parent = parent;
    }
}
