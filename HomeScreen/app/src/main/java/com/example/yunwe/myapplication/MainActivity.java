package com.example.yunwe.myapplication;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addNewFragment(new HomeFragment());
    }

    public void addNewFragment(Fragment fragment){
        getFragmentManager().beginTransaction().replace(R.id.main_content, fragment, "SubFragment")
                .addToBackStack("SubFragment").commit();
    }
}

