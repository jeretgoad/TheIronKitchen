package com.example.theironkitchen.view;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import com.example.theironkitchen.R;
import com.example.theironkitchen.view.ui.login.signIn;

public class MainActivity extends FragmentActivity {

    FragmentManager fm = getSupportFragmentManager();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fm.beginTransaction().replace(R.id.content, new signIn()).commit();

    }
}
