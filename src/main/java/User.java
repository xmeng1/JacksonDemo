/**
 * User:    mengxin
 * Date:    27/03/17
 * Project: JacksonDemo
 */
public class User extends AbstractParentObject<Business>{

    @Override
    public Business getParent() {
        return super.getParent();
    }

    @Override
    public void setParent(Business parent) {
        super.setParent(parent);
    }

    public User(String id, String name, Business parent, String pa) {
        super(id, name, parent, pa, Business.class);
    }
}
