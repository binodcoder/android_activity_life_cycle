package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String message="method is invoked";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("onCreate()", message);
        Toast.makeText(this, "onCreate() method is called", Toast.LENGTH_SHORT).show();
    }

    public void onStart(){
        super.onStart();
        Log.d("onStart()", message);
        Toast.makeText(this, "onStart() method is called", Toast.LENGTH_SHORT).show();
    }

    public void onRestart(){
        super.onRestart();
        Log.d("onRestart()", message);
        Toast.makeText(this, "onRestart() method is called", Toast.LENGTH_SHORT).show();
    }

    public void onResume(){
        super.onResume();
        Log.d("onResume()", message);
        Toast.makeText(this, "onResume() method is called", Toast.LENGTH_SHORT).show();
    }

    public void onPause(){
        super.onPause();
        Log.d("onPause()", message);
        Toast.makeText(this, "onPause() method is called", Toast.LENGTH_SHORT).show();
    }
    public void onStop(){
        super.onStop();
        Log.d("onStop()", message);
        Toast.makeText(this, "onStop() method is called", Toast.LENGTH_SHORT).show();
    }
    public void onDestroy(){
        super.onDestroy();
        Log.d("onDestroy", message);
        Toast.makeText(this, "onDestroy() method is called", Toast.LENGTH_SHORT).show();
    }

}