package com.example.proteintracker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.mainActivityTextView);
        textView.setText(R.string.Test_Untuk_Update_View);

        Button myBtn = (Button) findViewById(R.id.button1);
        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText myEditText = (EditText) findViewById(R.id.edittext1);
                Log.d("ProteinTracker", myEditText.getText().toString);
            }
        });

        private View.OnClickListener helpButtonListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }

            intent intent = new intent(MainActivity.this, HelpActivity.class);

            startActivity(intent);

        };
        Button helpBtn = (Button) findViewById(R.id.helpButton);
        helpBtn.setOnClickListener(helpButtonListener);
    };

@Override protected void onSaveInstanceState(Bundle outState)
    { super.onSaveInstanceState(outState);

    outState.putString("abc","test");
    super.onSaveInstantanceState(outState);
    if(savedInsetanState !=null) {
        Log.d("ProteinTracker", savedInstanceState.getString("abc")); }
    }

@Override public  void onClick(View view) {
    intent intent = new intent(MainActivity.this, helpActivity.class);

    Bundle b = new Bundle();

    EditText myEditText = (EditText) findViewById(R.id.editText1);
    b.putString("helpString", myEditText.getText().toString());
    intent.putExtras(b);

    startActivity(intent);

    TextView myTextView = new TextView(this);
    Bundle b = getIntent().getExtras();
    String helpText = b.getString = b.getString("helpString");
    myTextView.setText(helpText);
    setContentView(myTextView);
}};
}