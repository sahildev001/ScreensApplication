package com.example.screensapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;

import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.BadgeUtils;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class Screen2Frafment extends Fragment {
OnclickedFrag onclickedFrag;
AppCompatButton button;
    public Screen2Frafment(OnclickedFrag onclickedFrag) {
        // Required empty public constructor
        this.onclickedFrag = onclickedFrag;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_screen2_frafment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull @org.jetbrains.annotations.NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

button = view.findViewById(R.id.SignUp);
button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        onclickedFrag.resul(2);
    }
});

    }
}