package edu.temple.signupform;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText name2, email2, confirm2, password2;
        Button button1;

        name2 = findViewById(R.id.name2);
        email2 = findViewById(R.id.email2);
        confirm2 = findViewById(R.id.confirm2);
        password2 = findViewById(R.id.password2);
        button1 = findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int duration = Toast.LENGTH_SHORT;
                if(!(confirm2.getText().toString().equals(password2.getText().toString()))){
                    Toast.makeText(FormActivity.this, "Password not match", duration).show();
                }else if(name2.getText().toString().isEmpty() ||email2.getText().toString().isEmpty() ||password2.getText().toString().isEmpty()||confirm2.getText().toString().isEmpty()){
                    Toast.makeText(FormActivity.this, "Please enter something", duration).show();
                }else{
                    Toast.makeText(FormActivity.this, "Welcome!", duration).show();
                }

            }
        });


    }
}