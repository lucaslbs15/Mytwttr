package twttr.my.mytwttr.view.activity;

import android.databinding.DataBindingUtil;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import twttr.my.mytwttr.R;
import twttr.my.mytwttr.databinding.ContentLoginBinding;
import twttr.my.mytwttr.view.component.CustomPalette;
import twttr.my.mytwttr.viewmodel.LoginViewModel;

public class LoginActivity extends AppCompatActivity {

    private ContentLoginBinding binding = null;
    private LoginViewModel loginViewModel = null;
    private CustomPalette customPalette = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.content_login);
        loginViewModel = new LoginViewModel();
        binding.setViewModel(loginViewModel);
        loginViewModel.onCreate();

        customPalette = new CustomPalette();
        customPalette.createPaletteSync(BitmapFactory.decodeResource(getResources(), R.drawable.image_background_login_02));
        binding.contentLoginButtonLogin.setTextColor(customPalette.getLightVibrantRgb());
        binding.contentLoginButtonLogin.setBackgroundColor(customPalette.getVibrantRgb());
    }

    @Override
    public void onStart(){
        super.onStart();
        loginViewModel.onStart();
    }

    @Override
    public void onResume(){
        super.onResume();
        loginViewModel.onResume();
    }

    @Override
    public void onPause(){
        super.onPause();
        loginViewModel.onPause();
    }

    @Override
    public void onStop(){
        super.onStop();
        loginViewModel.onStop();
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        loginViewModel.onDestroy();
    }
}
