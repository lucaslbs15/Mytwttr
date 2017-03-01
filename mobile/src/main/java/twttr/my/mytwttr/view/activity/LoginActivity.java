package twttr.my.mytwttr.view.activity;

import android.database.DatabaseUtils;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import twttr.my.mytwttr.R;
import twttr.my.mytwttr.databinding.ContentLoginBinding;
import twttr.my.mytwttr.model.object.Login;
import twttr.my.mytwttr.viewmodel.LoginViewModel;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView isn't used in binding data concepts
        //setContentView(R.layout.login);
        //ContentLoginBinding class is generated automatically
        ContentLoginBinding binding = DataBindingUtil.setContentView(this, R.layout.content_login);
        binding.setViewModel(new LoginViewModel());
        Login login = new Login();
        binding.setLogin(login);

        /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        */
    }
}
