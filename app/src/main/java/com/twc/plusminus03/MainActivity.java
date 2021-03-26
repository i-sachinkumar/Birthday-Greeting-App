 package com.twc.plusminus03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity {
   Button button ;
   EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      button = (Button)  findViewById(R.id.button);
        editText = (EditText)  findViewById(R.id.editText);
    }

    public void printToast(View view) {
     String name = editText.getEditableText().toString();
   Toast.makeText(this, name +", your greeting is ready", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, GreetingView.class);
        intent.putExtra("name", name);
        startActivity(intent);

    }

}