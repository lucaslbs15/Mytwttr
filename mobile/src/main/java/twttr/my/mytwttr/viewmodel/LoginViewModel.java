package twttr.my.mytwttr.viewmodel;

import android.databinding.ObservableField;
import android.text.Editable;
import android.text.TextWatcher;
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
    }

    //region lifecycle
    public void onCreate() {
        Log.i("Bicca", this.getClass().getSimpleName() + " - onCreate()");
    }

    public void onStart() {
        Log.i("Bicca", this.getClass().getSimpleName() + " - onStart()");
    }

    public void onResume() {
        Log.i("Bicca", this.getClass().getSimpleName() + " - onResume()");
    }

    public void onPause() {
        Log.i("Bicca", this.getClass().getSimpleName() + " - onPause()");
    }

    public void onStop() {
        Log.i("Bicca", this.getClass().getSimpleName() + " - onStop()");
    }

    public void onDestroy() {
        Log.i("Bicca", this.getClass().getSimpleName() + " - onDestroy()");
    }
    //endregion

    /**
     * Action when user click on Login button
     */
    public void onClickedLogin(){
        Log.i("Bicca", String.format("userName: %s - password: %s", this.login.getUserName(), this.login.getPassword()));
        //TODO call API to login
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public TextWatcher userNameTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void afterTextChanged(Editable editable) {
            login.setUserName(editable.toString());
        }
    };

    public TextWatcher passwordTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void afterTextChanged(Editable editable) {
            login.setPassword(editable.toString());
        }
    };
}
