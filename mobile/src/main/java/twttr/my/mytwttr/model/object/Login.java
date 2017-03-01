package twttr.my.mytwttr.model.object;

/**
 * Created by Home on 28/02/2017.
 */

public class Login {
    private long id = 0;
    private String userName = null;
    private String password = null;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
