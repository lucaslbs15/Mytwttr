package twttr.my.mytwttr.view.activity;

import android.databinding.DataBindingUtil;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

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

        setBackground();
        setColorsByPalette();
    }

    //region lifecycle
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
    //endregion

    private void setBackground(){
        int drawableId = R.drawable.image_background_login_01;
        binding.contentLoginBackground.setTag(drawableId);
        binding.contentLoginBackground.setBackgroundResource(drawableId);
    }

    private void setColorsByPalette(){
        Integer backgroundID = (Integer)binding.contentLoginBackground.getTag();
        if(backgroundID != null && backgroundID != 0){
            customPalette = new CustomPalette();
            customPalette.createPaletteSync(BitmapFactory.decodeResource(getResources(), backgroundID));
            //button
            binding.contentLoginButtonLogin.setTextColor(customPalette.getLightVibrantRgb());
            binding.contentLoginButtonLogin.setBackgroundColor(customPalette.getVibrantRgb());
            //user name & password EditText
            binding.contentLoginEditTextUserName.setTextColor(customPalette.getLightVibrantTitleTextColor());
            binding.contentLoginEditTextUserName.setHintTextColor(customPalette.getLightMutedTitleTextColor());
            binding.contentLoginEditTextPassword.setTextColor(customPalette.getLightVibrantTitleTextColor());
            binding.contentLoginEditTextPassword.setHintTextColor(customPalette.getLightMutedTitleTextColor());
        }
    }
}
