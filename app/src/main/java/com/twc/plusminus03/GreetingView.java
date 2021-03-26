  package com.twc.plusminus03;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.TypeConverter;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.Serializable;

  public class GreetingView extends AppCompatActivity {
    TextView textView;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting_view);
        textView = (TextView) findViewById(R.id.textView);
        imageView = (ImageView) findViewById(R.id.imageView) ;
        String name = getIntent().getStringExtra("name");
        textView.setText("Happy Birthday \n" +name+  "!");
    }


  }