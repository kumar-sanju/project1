package com.sanju.navdrawer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginActivity extends AppCompatActivity {

    private Button Login;
    private EditText Email, Password;
    private FirebaseAuth mAuth;
    private ProgressBar loginProgress;
    private FirebaseAuth.AuthStateListener mAuthStateListener;
    private ImageView loginPhoto;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Email = (EditText) findViewById(R.id.login_mail);
        Password = (EditText) findViewById(R.id.login_password);
        Login = (Button) findViewById(R.id.loginBtn);
        loginProgress = findViewById(R.id.login_progress);
        loginPhoto = findViewById(R.id.login_photo);
        mAuth = FirebaseAuth.getInstance();

        textView = (TextView) findViewById(R.id.textlogin);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });

        loginProgress.setVisibility(View.INVISIBLE);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginProgress.setVisibility(View.VISIBLE);
                Login.setVisibility(View.INVISIBLE);

                final String email = Email.getText().toString();
                final String pwd = Password.getText().toString();

                if (email.isEmpty()) {
                    Email.setError("Please enter your email id...");
                    Email.requestFocus();
                } else if (pwd.isEmpty()) {
                    Password.setError("Please enter your password...");
                    Password.requestFocus();
                } else if (email.isEmpty() && pwd.isEmpty()) {
                    Toast.makeText(LoginActivity.this, "Field are Empty!", Toast.LENGTH_SHORT);

                    Login.setVisibility(View.VISIBLE);
                    loginProgress.setVisibility(View.INVISIBLE);

                } else if (!(email.isEmpty() && pwd.isEmpty())) {
                    mAuth.signInWithEmailAndPassword(email, pwd).addOnCompleteListener(LoginActivity.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (!task.isSuccessful()) {
                                Toast.makeText(LoginActivity.this, "Login Error, Please login Again!!", Toast.LENGTH_SHORT).show();
                                loginProgress.setVisibility(View.INVISIBLE);
                                Login.setVisibility(View.VISIBLE);
                                updateUI();
                            } else {
                                Toast.makeText(LoginActivity.this, "Login Successful!", Toast.LENGTH_LONG).show();

                                startActivity(new Intent(LoginActivity.this, MainActivity.class));
                                Login.setVisibility(View.VISIBLE);
                                loginProgress.setVisibility(View.INVISIBLE);
                            }
                        }
                    });
                } else {
                    Toast.makeText(LoginActivity.this, "Error Occurred!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        mAuthStateListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser mFirebaseUser = mAuth.getCurrentUser();
                if (mFirebaseUser != null) {
                    Toast.makeText(LoginActivity.this, "You are logged in successfully!!", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(LoginActivity.this, MainActivity.class));
                } else {
                    Toast.makeText(LoginActivity.this, "Please Login...", Toast.LENGTH_SHORT).show();
                }
            }
        };
    }

    private void updateUI() {

        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser user = mAuth.getCurrentUser();

        if(user != null) {
            //user is already connected  so we need to redirect him to home page
            updateUI();
        }
    }
}