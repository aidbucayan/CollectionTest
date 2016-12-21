package com.adrianbucayan.app.collectiontest.Fragments;


import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.adrianbucayan.app.collectiontest.MainActivity;
import com.adrianbucayan.app.collectiontest.Model.JsonReturn;
import com.adrianbucayan.app.collectiontest.R;
import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Adrian Bucayan on 12/21/16.
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends BaseFragment {

    private static final String TAG = MainActivity.class.getSimpleName();

    private String mJsonString;
    private JsonReturn mJsonReturn;

    private Button btnLogin;
    private EditText etEmail;

    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        etEmail = (EditText) view.findViewById(R.id.login_email_et);
        btnLogin = (Button) view.findViewById(R.id.login_button_btn);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etEmail.getText().toString().equals(mJsonReturn.getData().getAttributes().getEmailAddress()) ||
                        etEmail.getText().toString().equals(mJsonReturn.getIncluded().get(0).getAttributes().getMsn())) {
                    Toast.makeText(getActivity(), "Login Successful", Toast.LENGTH_LONG).show();

                    WelcomeFragment welcomeFragment = new WelcomeFragment();

                    Bundle args = new Bundle();
                    args.putSerializable("jsonReturn", mJsonReturn);
                    welcomeFragment.setArguments(args);

                    final MainActivity activity = ((MainActivity) getContext());
                    activity.getSupportFragmentManager().beginTransaction()
                            .setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out)
                            .detach(welcomeFragment)
                            .replace(R.id.frmContentFrame, welcomeFragment,
                                    WelcomeFragment.class.getSimpleName())
                            .attach(welcomeFragment)
                            .addToBackStack("welcomeFragment")
                            .commit();

                } else {
                    Toast.makeText(getActivity(), "Incorrect MSN or Email", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        btnLogin.setEnabled(false);
        writeJson();
    }

    private String loadJSONFromAsset() {

        mJsonString = null;
        try {
            InputStream is = getActivity().getAssets().open("collection.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            mJsonString = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            Toast.makeText(getActivity(), "Error on getting Collection.json", Toast.LENGTH_LONG).show();
            return null;
        }
        return mJsonString;
    }

    private void writeJson() {
        Gson gson = new Gson();
        mJsonReturn = gson.fromJson(loadJSONFromAsset(), JsonReturn.class);
        Log.d(TAG, "MSN = " +  mJsonReturn.getData().getAttributes().getEmailAddress());

        btnLogin.setEnabled(true);
    }

}
