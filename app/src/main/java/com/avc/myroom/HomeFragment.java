package com.avc.myroom;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

//https://www.youtube.com/watch?v=qTRTwSMgly8
/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements View.OnClickListener {

private Button BnAdduser;
    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_home, container, false);
        BnAdduser=view.findViewById(R.id.adduser);
        BnAdduser.setOnClickListener(this);
        return view;
    }


    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.adduser:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.homelinearlayout,new
                        adduser()).addToBackStack(null).commit();
                break;

        }
    }
}
