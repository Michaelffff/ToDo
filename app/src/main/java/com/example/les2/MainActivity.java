package com.example.les2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class  MainActivity extends AppCompatActivity {

    private EditText UserName;
    private EditText Password;
    private TextView Attempts;
    private Button LogIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UserName = (EditText)findViewById(R.id.etUserName);
        Password = (EditText)findViewById(R.id.etPassword);
        Attempts = (TextView)findViewById(R.id.Attempts);
        LogIn = (Button)findViewById(R.id.btnLogIn);

    }
    private void validate(String userName, String userPassowrd){
        if(userName == "")

    }
    public void goToAddActivity(View view){
        Intent intent = new Intent(this,AddPersonActivity.class);
        startActivity(intent);
    }

}