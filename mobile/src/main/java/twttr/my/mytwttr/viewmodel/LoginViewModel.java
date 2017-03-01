package twttr.my.mytwttr.viewmodel;

import android.util.Log;

import twttr.my.mytwttr.model.object.Login;
import twttr.my.mytwttr.model.object.User;

/**
 * Created by Home on 28/02/2017.
 */

public class LoginViewModel implements ViewModel {
    private Login login = null;

    public LoginViewModel() {
        this.login = new Login();
        this.login.setUserName("");
        this.login.setPassword("");
    }

    //region lifecycle
    public void onCreate() {

    }

    public void onStart() {

    }

    public void onResume() {

    }

    public void onPause() {

    }

    public void onStop() {

    }

    public void onDestroy() {

    }
    //endregion

    /**
     * Action when user click on Login button
     */
    public void onClickedLogin(Login login){
        this.login = login;
        Log.i("Bicca", String.format("userName: %s - password: %s", this.login.getUserName(), this.login.getPassword()));
        //TODO call API to login
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }
}
