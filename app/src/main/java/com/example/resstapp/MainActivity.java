package com.example.resstapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import java.util.List;
import com.example.resstapp.databinding.ActivityMainBinding;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends Activity {

    private TextView mTextView;
    private Button mButton;
    private  final List<String> mensajes= Arrays.asList(
            "Hola",
            "Como estas?",
            "Bye"
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mTextView=findViewById(R.id.mensajetxtview);
        mButton=findViewById(R.id.botonbtn);

        mTextView,setText(mensajes.get(1));
    }
}