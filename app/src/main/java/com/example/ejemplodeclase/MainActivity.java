package com.example.ejemplodeclase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Ejemplo n=new Ejemplo();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ejemplo(View view){
        EditText s;
        TextView s2;
        s=(EditText)findViewById(R.id.editText );
        s2=(TextView)findViewById(R.id.text2);
        s2.setText(n.cambiar(s.getText().toString()+""));
    }
}
