package com.example.theironkitchen.view.ui.login;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.theironkitchen.R;
import com.example.theironkitchen.view.ui.home.IkNav;
import com.example.theironkitchen.view.ui.signup.signUp;


public class signIn extends Fragment implements View.OnClickListener{

    private View daView;
    private EditText eMail, pWord;
    private TextView signUp;
    private Button logInBtn;
    private ImageView skipImgBtn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        daView = inflater.inflate(R.layout.fragment_sign_in, container, false);
        eMail = daView.findViewById(R.id.emailText);
        pWord = daView.findViewById(R.id.passwordText);
        signUp = daView.findViewById(R.id.signUpText);
        logInBtn = daView.findViewById(R.id.logInBtn);
        skipImgBtn = daView.findViewById(R.id.skip_knifes_arrow);
        SpannableString sText = new SpannableString(signUp.getText().toString());
        sText.setSpan(new UnderlineSpan(),0, sText.length(), 0);
        ForegroundColorSpan fcsBlue = new ForegroundColorSpan(Color.BLUE);
        sText.setSpan(fcsBlue, 0, sText.length(), 0);
        signUp.setText(sText);
        signUp.setOnClickListener(this);
        logInBtn.setOnClickListener(this);
        skipImgBtn.setOnClickListener(this);
        return daView;
    }

    @Override
    public void onClick(View view) {
        if(view == logInBtn || view == skipImgBtn) {
            final Intent homeIntent = new Intent(getActivity(), IkNav.class);
            startActivity(homeIntent);

        }
        else if(view == signUp){
            final FragmentManager signUpFM = getActivity().getSupportFragmentManager();
            signUpFM.beginTransaction().replace(R.id.content, new signUp()).commit();
        }
    }
}
