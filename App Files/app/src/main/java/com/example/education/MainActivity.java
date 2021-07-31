package com.example.education;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void courses(View view) {
        Intent i = new Intent(MainActivity.this,Courses.class);
        startActivity(i);
    }
    public void loc(View view){
        String url = "https://www.google.com/maps/place/University+of+Engineering+%26+Management+(UEM),+Kolkata/@22.560214,88.4879874,17z/data=!3m1!4b1!4m5!3m4!1s0x3a020b267a3cdc13:0xb3b21d652126f40!8m2!3d22.560214!4d88.4901761";
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,  Uri.parse(url));
        startActivity(intent);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        menu.add("Courses");
        menu.add("Contact Us");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getTitle().equals("Courses")){
            Intent i = new Intent(MainActivity.this,Courses.class);
            startActivity(i);
        }
        else if(item.getTitle().equals("Contact Us")){
            String url = "https://www.google.com/maps/place/University+of+Engineering+%26+Management+(UEM),+Kolkata/@22.560214,88.4879874,17z/data=!3m1!4b1!4m5!3m4!1s0x3a020b267a3cdc13:0xb3b21d652126f40!8m2!3d22.560214!4d88.4901761";
            Intent intent = new Intent(android.content.Intent.ACTION_VIEW,  Uri.parse(url));
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}