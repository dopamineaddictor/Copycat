package com.example.shawn.copycat;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class loginActivity extends ActionBarActivity {

    private TextView mLoginLable;
    private EditText mNameEditText;
    private EditText mPasswordEditText;
    private Button mLoginButton;
    private TextView mSignupNowTextLabel;
    private Button mSignupButton;
    private EditText mEmailEditText;
    private Button mRealSignupButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mLoginLable = (TextView) findViewById(R.id.loginTextLabel);
        mNameEditText = (EditText) findViewById(R.id.nameEditText);
        mPasswordEditText = (EditText) findViewById(R.id.passwordEditText);
        mLoginButton = (Button) findViewById(R.id.loginButton);
        mSignupNowTextLabel = (TextView) findViewById(R.id.signUpTextLabel);
        mSignupButton = (Button) findViewById(R.id.signupButton);
        mEmailEditText = (EditText) findViewById(R.id.emailEditText);
        mRealSignupButton = (Button) findViewById(R.id.realSignupButton);



        mSignupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSignupButton.setVisibility(View.GONE);
                mRealSignupButton.setVisibility(View.VISIBLE);

                mLoginLable.setText("Sign Up Now!");
                mSignupNowTextLabel.setVisibility(View.GONE);
                mLoginButton.setVisibility(View.GONE);
                mEmailEditText.setVisibility(View.VISIBLE);



            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
