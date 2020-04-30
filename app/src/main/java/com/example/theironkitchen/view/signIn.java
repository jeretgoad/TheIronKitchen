package com.example.theironkitchen.view;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.theironkitchen.view.IkNav;
import com.example.theironkitchen.R;


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
        String signUpString = "Need account? Sign-Up";
        SpannableString sText = new SpannableString(signUpString);
        sText.setSpan(new UnderlineSpan(),14, 21, 0);
        ForegroundColorSpan fcsBlue = new ForegroundColorSpan(Color.BLUE);
        sText.setSpan(fcsBlue, 14, 21, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ClickableSpan signUpClickSpan = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                final FragmentManager signUpFM = getActivity().getSupportFragmentManager();
                signUpFM.beginTransaction().replace(R.id.content, new signUp()).commit();
            }
        };
        sText.setSpan(signUpClickSpan, 14, 21, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        signUp.setText(sText);
        logInBtn.setOnClickListener(this);
        skipImgBtn.setOnClickListener(this);
        return daView;
    }

    @Override
    public void onClick(View v) {
        final Intent homeIntent = new Intent(getActivity(), IkNav.class);
        startActivity(homeIntent);
    }
}
