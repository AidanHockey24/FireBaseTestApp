package com.example.user1.firebasetestapp;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.google.firebase.storage.FirebaseStorage;


public class Main4Activity extends AppCompatActivity {

    private ImageView imageView;
    private FirebaseStorage mStorage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        imageView = (ImageView) findViewById(R.id.DailyBulletinImage);


        }
    }
}
