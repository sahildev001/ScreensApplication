package com.example.screensapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.BadgeUtils;

public class MainActivity extends AppCompatActivity implements OnclickedFrag {
FrameLayout frameLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        frameLayout = findViewById(R.id.warper);

getSupportFragmentManager().beginTransaction().replace(R.id.warper,new Screen1Fragment(MainActivity.this),"Screen1").commit();


    }

    @Override
    public int resul(int pos) {
        if(pos ==1){
            getSupportFragmentManager().beginTransaction().remove(new Screen1Fragment(MainActivity.this)).commit();
            getSupportFragmentManager().beginTransaction().replace(R.id.warper,new Screen2Frafment(MainActivity.this)).addToBackStack(null).commit();
        }
        if(pos ==2){
            getSupportFragmentManager().beginTransaction().remove(new Screen2Frafment(MainActivity.this)).commit();
            getSupportFragmentManager().beginTransaction().replace(R.id.warper,new Screen1Fragment(MainActivity.this)).commit();
        }
        return 0;
    }
}