package com.example.login_2;

import static com.example.login_2.R.*;
import static com.example.login_2.R.id.edtusername;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtusername=(EditText)findViewById(id.edtusername) ;
    EditText edpassword=(EditText)findViewById(id.edpassword) ;
    Button log1=(Button)findViewById(id.log1) ;
    private String msg="Good";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
        log1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usern = edtusername.getText().toString();
                String passn = edpassword.getText().toString();
                if (usern.equals("") && passn.equals("")) {
                    edtusername.setError("Empty username!!");
                    edpassword.setError("Empty password!!");}
                else {
                    if (!usern.equals("") && passn.equals("")) {
                        edpassword.setError("Empty password!!");
                    } else {
                        if (usern.equals("anwar") && passn.equals("1234")) {
                        }
                        Intent intt = new Intent();
                        startActivity(intt);
                    }

                }
            }
        });

    }

    public void log(View view) {

        Intent in=new Intent(this,Login.class);
        startActivity(in);
    }
}