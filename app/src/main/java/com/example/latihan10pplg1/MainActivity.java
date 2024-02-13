package com.example.latihan10pplg1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // variable component
    EditText txtUsername;
    EditText txtPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.github_loginpage);
         txtUsername = findViewById(R.id.editText);
         txtPassword = findViewById(R.id.editText2);
         btnLogin = findViewById(R.id.button);

         btnLogin.setOnClickListener(new View.OnClickListener() {
          @Override
            public void onClick(View view) {
                if (txtUsername.getText().toString().equals("Aldi") && txtPassword.getText().toString().equals("Aldi")){
                    // Menampilkan toast "Login berhasil"
                    Toast.makeText(MainActivity.this, "Login berhasil", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(MainActivity.this, activity_kalkulator.class);
                    startActivity(intent);

                } else {
                    // Menampilkan toast "Login Tidak berhasil"
                    Toast.makeText(MainActivity.this, "Login Tidak berhasil", Toast.LENGTH_LONG).show();
                }

          }

    });
}


}