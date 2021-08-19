package com.example.screensapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import org.jetbrains.annotations.NotNull;


public class Screen1Fragment extends Fragment {
OnclickedFrag onclickedFrag ;
ImageView ivAdd;
String TAG ="Screen1";
    public Screen1Fragment(OnclickedFrag onclickedFrag) {
        // Required empty public constructor
        this.onclickedFrag = onclickedFrag;
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_screen1, container, false);
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ivAdd = view.findViewById(R.id.iv_add);
        ivAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Toast.makeText(getContext(), v.toString(), Toast.LENGTH_SHORT).show();
               // Log.d(TAG, "onClick: "+v);

               // onclickedFrag.resul(1);

             onclickedFrag.resul(1);

            }
        });

    }



}