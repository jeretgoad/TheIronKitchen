package com.example.theironkitchen.view;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.example.theironkitchen.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link signIn.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link signIn#newInstance} factory method to
 * create an instance of this fragment.
 */
public class signIn extends Fragment implements View.OnClickListener
{
    private Button ikBtn, labBtn;
    View daView;

    public signIn(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        daView = inflater.inflate(R.layout.fragment_sign_in, container,false);
        ikBtn = daView.findViewById(R.id.ik_button);
        labBtn = daView.findViewById(R.id.lab_button);
        ikBtn.setOnClickListener(this);
        labBtn.setOnClickListener(this);
        return daView;
    }

    @Override
    public void onClick(View v) {

        if(v == ikBtn){
            Intent ikIntent = new Intent(getActivity(), IkNav.class);
            startActivity(ikIntent);
        }
        else if(v == labBtn){
            Intent labIntent = new Intent(getActivity(), LabNav.class);
            startActivity(labIntent);
        }
    }
}
