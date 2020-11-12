package com.example.gitdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

public class MainActivity extends AppCompatActivity {
    Button buttonadd, buttonsubtract;
    TextView textView;
    MyViewModel myViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myViewModel = new ViewModelProvider(this).get(MyViewModel.class);
        textView.setText(String.valueOf(myViewModel.number));
        buttonadd = findViewById(R.id.button);
        buttonsubtract = findViewById(R.id.button2);
        textView = findViewById(R.id.text);
        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(String.valueOf(myViewModel.number++));
            }
        });
    }
}