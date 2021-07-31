package com.example.education;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Courses extends AppCompatActivity {
        Button button;
        ImageView img;
        ImageView img1;
        //ImageView img2;
        ImageView img3;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_courses);


        }
        public void python(View view) {
            Intent i = new Intent(com.example.education.Courses.this,MainActivity3.class);
            startActivity(i);
        }
        public void java(View view){
            Intent i = new Intent(com.example.education.Courses.this, MainActivity4.class);
            startActivity(i);
        }
        public void network(View view){
            Intent i = new Intent(com.example.education.Courses.this, MainActivity7.class);
            startActivity(i);
        }
        public void ml(View view) {
            Intent i = new Intent(com.example.education.Courses.this, MainActivity6.class);
            startActivity(i);
        }
        public void C(View view){
            Intent i = new Intent(com.example.education.Courses.this, MainActivity2.class);
            startActivity(i);
        }
        public void eh(View view){
            Intent i = new Intent(com.example.education.Courses.this, MainActivity5.class);
            startActivity(i);
        }

    }
