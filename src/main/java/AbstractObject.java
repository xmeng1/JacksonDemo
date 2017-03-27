/**
 * User:    mengxin
 * Date:    27/03/17
 * Project: JacksonDemo
 */
public class AbstractObject {

    public AbstractObject(String id, String name) {
        this.id = id;
        this.name = name;
    }

    String id;
    String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
