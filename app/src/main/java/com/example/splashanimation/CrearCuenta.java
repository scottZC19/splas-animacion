package com.example.splashanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class CrearCuenta extends AppCompatActivity {

    EditText NC, EMAIL, PAS, PHONE;
    TextView mlogin;
    Button Registro;
    FirebaseAuth fAuth;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_cuenta);

        NC = findViewById(R.id.Nombre);
        EMAIL= findViewById(R.id.Email);
        PAS = findViewById(R.id.Contrasena);
        PHONE = findViewById(R.id.Telefono);

        Registro = findViewById(R.id.Unete);

    }
}