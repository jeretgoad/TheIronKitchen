package com.example.theironkitchen.view.ui.meal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.theironkitchen.R;


public class MealFragment extends Fragment {

    private MealViewModel mealViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        mealViewModel =
                ViewModelProviders.of(this).get(MealViewModel.class);
        View root = inflater.inflate(R.layout.fragment_meal, container, false);
        final TextView textView = root.findViewById(R.id.text_meal);
        mealViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}