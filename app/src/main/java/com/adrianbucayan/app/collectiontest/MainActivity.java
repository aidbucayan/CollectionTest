package com.adrianbucayan.app.collectiontest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.adrianbucayan.app.collectiontest.Fragments.LoginFragment;

/**
 * @author Adrian Bucayan on 12/21/16.
 */
public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // to Login Fragment
        LoginFragment loginFragment = new LoginFragment();
        getSupportFragmentManager().beginTransaction()
                .setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out)
                .detach(loginFragment)
                .replace(R.id.frmContentFrame, loginFragment, LoginFragment.class.getSimpleName())
                .attach(loginFragment)
                .commit();
    }


}
