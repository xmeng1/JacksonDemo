import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * User:    mengxin
 * Date:    27/03/17
 * Project: JacksonDemo
 */
public class Test {
    public static void main(String[] args) throws IOException {
        Business businessA = new Business("1", "businessA");

        Business businessB = new Business("2", "businessB");

        User userA = new User("1", "userA", businessA, "testA");
        User userB = new User("2", "userB", businessB, "testB");

        Phone phoneA = new Phone("1", "phoneA", userA);
        Phone phoneB = new Phone("2", "phoneB", userB);

        ObjectMapper mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(new DataNamingStrategy(userA.parent.getClass().getSimpleName().toLowerCase()));
        String out = mapper.writeValueAsString(userA);
        System.out.println(out);
        out = mapper.writeValueAsString(userA);
        System.out.println(out);
        out = mapper.writeValueAsString(userB);
        System.out.println(out);
        out = mapper.writeValueAsString(phoneA);
        System.out.println(out);
        out = mapper.writeValueAsString(phoneB);
        System.out.println(out);
    }

}
