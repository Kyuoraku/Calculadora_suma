package com.example.suma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText text1;
    private EditText text2;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = (EditText) findViewById(R.id.editText);
        text2 = (EditText) findViewById(R.id.editText2);
        tv = (TextView) findViewById(R.id.resultado);
    }

    //Suma.
    public void sumar (View view){

        String valor1 = text1.getText().toString();
        String valor2 = text2.getText().toString();
        Integer v1 = Integer.parseInt(valor1);
        Integer v2 = Integer.parseInt(valor2);
        Integer resultado = v1+v2;
        String mostrar = String.valueOf(resultado);
        tv.setText(mostrar);


    }
}
