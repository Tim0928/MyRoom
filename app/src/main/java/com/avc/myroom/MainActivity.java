package com.avc.myroom;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    public static FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager=getSupportFragmentManager();
        if(findViewById(R.id.fragment)!=null)
        {
            if(savedInstanceState!=null)
            {
                return;
            }
        fragmentManager.beginTransaction().add(R.id.fragment,new HomeFragment()).commit();

        }
    }
}
