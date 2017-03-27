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
    final Class<P> clazzP;

    public AbstractParentObject(String id, String name, P parent, String pa,Class<P> clazz) {
        super(id, name);
        this.parent = parent;
        this.pa = pa;
        clazzP = clazz;
    }

    public String getPa() {
        return pa;
    }

    public void setPa(String pa) {
        this.pa = pa;
    }

    String pa;

    AbstractParentObject(String id, String name, P parent, Class<P> clazz) {
        super(id, name);
        this.parent = parent;
        clazzP = clazz;
    }

    @SuppressWarnings("")
    public P getParent() {
        return parent;
    }

    //@Logger(name = "xxx")
    public void setParent(P parent) {
        this.parent = parent;
    }
}
