package com.example.proteintracker;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.mainActivityTextView);
        textView.setText(R.string.Test_Untuk_Update_View);


        Button myBtn = (Button) findViewById(R.id.button);
        myBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                EditText myEditText = (EditText) findViewById(R.id.editText1);
                Log.d("Proteintracker", myEditText.getText().toString());
            }
        });
