/**
 * User:    mengxin
 * Date:    27/03/17
 * Project: JacksonDemo
 */
public class Phone extends AbstractParentObject<User> {

    public Phone(String id, String name, User parent) {
        super(id, name, parent, User.class);
    }

    @Override
    public User getParent() {
        return super.getParent();
    }

    @Override
    public void setParent(User parent) {
        super.setParent(parent);
    }
}
