package com.manroaaashni.lab_05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView onCreate;
    TextView onStart;
    TextView onResume;
    TextView onPause;
    TextView onStop;
    TextView onRestart;
    TextView onDestroy;
    TextView onCreate_curr;
    TextView onStart_curr;
    TextView onResume_curr;
    TextView onPause_curr;
    TextView onStop_curr;
    TextView onRestart_curr;
    TextView onDestroy_curr;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    Button reset_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sharedPreferences = getSharedPreferences("sharedPreferences", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();

        onCreate = findViewById(R.id.onCreate_txt);

        int count = sharedPreferences.getInt("onCreate", 0);
        editor.putInt("onCreate", count+1);
        editor.apply();
        onCreate.setText("Long Term: "  + Integer.toString(count+1));

        onCreate_curr = findViewById(R.id.onCreate_current);
        Counter curr = new Counter();
        curr.setCount(Integer.parseInt(onCreate_curr.getText().toString().substring(9)) +1);
//        int curr = Integer.parseInt(onCreate_curr.getText().toString().substring(9)) +1;
        onCreate_curr.setText("Current: " + curr.getCount());

//        editor.clear();


        reset_button = findViewById(R.id.reset);
        reset_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onCreate_curr = findViewById(R.id.onCreate_current);
                onStart_curr = findViewById(R.id.onStart_current);
                onResume_curr = findViewById(R.id.onResume_current);
                onPause_curr = findViewById(R.id.onPause_current);
                onStop_curr = findViewById(R.id.onStop_current);
                onRestart_curr = findViewById(R.id.onRestart_current);
                onDestroy_curr = findViewById(R.id.onDestroy_current);

                onCreate_curr.setText("Current: 0");
                onStart_curr.setText("Current: 0");
                onResume_curr.setText("Current: 0");
                onPause_curr.setText("Current: 0");
                onStop_curr.setText("Current: 0");
                onRestart_curr.setText("Current: 0");
                onDestroy_curr.setText("Current: 0");

            }
        });
    }
    protected void onStart(){
        super.onStart();
        onStart = findViewById(R.id.onStart_txt);
        int count = sharedPreferences.getInt("onStart", 0);
        editor.putInt("onStart", count+1);
        editor.apply();
        onStart.setText("Long Term: "  + Integer.toString(count+1));

        onStart_curr = findViewById(R.id.onStart_current);
        Counter curr = new Counter();
        curr.setCount(Integer.parseInt(onStart_curr.getText().toString().substring(9)) +1);
        onStart_curr.setText("Current: " + curr.getCount());
    }
    protected void onResume(){
        super.onResume();
        onResume = findViewById(R.id.onResume_txt);
        int count = sharedPreferences.getInt("onResume", 0);
        editor.putInt("onResume", count+1);
        editor.apply();
        onResume.setText("Long Term: "  + Integer.toString(count+1));

        onResume_curr = findViewById(R.id.onResume_current);
        Counter curr = new Counter();
        curr.setCount(Integer.parseInt(onResume_curr.getText().toString().substring(9)) +1);
        onResume_curr.setText("Current: " + curr.getCount());
    }
    protected void onPause(){
        super.onPause();
        onPause = findViewById(R.id.onPause_txt);
        int count = sharedPreferences.getInt("onPause", 0);
        editor.putInt("onPause", count+1);
        editor.apply();
        onPause.setText("Long Term: "  + Integer.toString(count+1));

        onPause_curr = findViewById(R.id.onPause_current);
        Counter curr = new Counter();
        curr.setCount(Integer.parseInt(onPause_curr.getText().toString().substring(9)) +1);
        onPause_curr.setText("Current: " + curr.getCount());
    }
    protected void onStop(){
        super.onStop();
        onStop = findViewById(R.id.onStop_txt);
        int count = sharedPreferences.getInt("onStop", 0);
        editor.putInt("onStop", count+1);
        editor.apply();
        onStop.setText("Long Term: "  + Integer.toString(count+1));

        onStop_curr = findViewById(R.id.onStop_current);
        Counter curr = new Counter();
        curr.setCount(Integer.parseInt(onStop_curr.getText().toString().substring(9)) +1);
        onStop_curr.setText("Current: " + curr.getCount());
    }
    protected void onRestart(){
        super.onRestart();
        onRestart = findViewById(R.id.onRestart_txt);
        int count = sharedPreferences.getInt("onRestart", 0);
        editor.putInt("onRestart", count+1);
        editor.apply();
        onRestart.setText("Long Term: "  + Integer.toString(count+1));

        onRestart_curr = findViewById(R.id.onRestart_current);
        Counter curr = new Counter();
        curr.setCount(Integer.parseInt(onRestart_curr.getText().toString().substring(9)) +1);
        onRestart_curr.setText("Current: " + curr.getCount());
    }
    protected void onDestroy(){
        super.onDestroy();
        onDestroy = findViewById(R.id.onDestroy_txt);
        int count = sharedPreferences.getInt("onDestroy", 0);
        editor.putInt("onDestroy", count+1);
        editor.apply();
        onDestroy.setText("Long Term: "  + Integer.toString(count+1));

        onDestroy_curr = findViewById(R.id.onRestart_current);
        Counter curr = new Counter();
        curr.setCount(Integer.parseInt(onDestroy_curr.getText().toString().substring(9)) +1);
        onDestroy_curr.setText("Current: " + curr.getCount());
    }
}

class Counter{
    int count;

    public int getCount(){
        return count;
    }
    public void setCount(int new_count){
        count = new_count;
    }
    public int increment(){
        count = count +1;
        return count;
    }
}


