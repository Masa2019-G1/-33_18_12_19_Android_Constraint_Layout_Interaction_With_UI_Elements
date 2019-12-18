package com.telran.a18_12_19;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "MY_TAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.my_btn);
        Button secondBtn = findViewById(R.id.btn_second);

        TextView myTxt = findViewById(R.id.my_txt);

        Log.d("MY_TAG","Hello");

//        Log.d(TAG, "onCreate: " + btn);
//        Log.d(TAG, "onCreate: " + myTxt);

        String str = String.valueOf(myTxt.getText());
        Log.d(TAG, "onCreate: " + str);
        myTxt.setText("My super text");

        btn.setOnClickListener(this);
        secondBtn.setOnClickListener(this);
    }


    public void myBtnClick(View view){
        Log.d(TAG, "myBtnClick: ");
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.my_btn){
            Log.d(TAG, "onClick: My Btn");
        }else if(v.getId() == R.id.btn_second){
            Log.d(TAG, "onClick: Second btn");
        }
    }
}
