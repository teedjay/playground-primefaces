package teedjay;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * A simple session scoped bean - holding some dummy user data.
 *
 * @author thore
 */
@ManagedBean
@SessionScoped
public class UserView implements Serializable {

    transient private List<UserData> users = new ArrayList<>(); // no need to serialize, it's generated by constructor

    public UserView() {
        for (int t=0; t<25; t++) {
            UserData ud = new UserData();
            ud.setName("Name" + t);
            ud.setCity("Oslo" + t);
            ud.setCode("Code" + System.nanoTime() * t);
            users.add(ud);
        }
    }

    public String getInstanceId() {
        return this.toString();
    }

    public List<UserData> getUsers() {
        return users;
    }

}