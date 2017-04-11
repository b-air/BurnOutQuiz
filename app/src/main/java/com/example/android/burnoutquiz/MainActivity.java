package com.example.android.burnoutquiz;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import static com.example.android.burnoutquiz.R.id.checkAnonymous;
import static com.example.android.burnoutquiz.R.id.nameField;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Create anonymous behavior
     */

    public void makeAnon(View view){

        // define var needed
        final CheckBox checkBox = (CheckBox)findViewById(R.id.checkAnonymous);
        EditText nameField = (EditText)findViewById(R.id.nameField);
        TextView txtView = (TextView)findViewById(R.id.nameField);


        if(checkBox.isChecked()){

            //change text hide text
            nameField.setText("Anonymous");
            txtView.setVisibility(View.GONE);

            //change box color
            findViewById(R.id.nameCase).setBackgroundColor(Color.parseColor("#F5F5F5"));
            ((CheckBox) findViewById(R.id.checkAnonymous)).setTextColor(Color.parseColor("#e62831"));

            // hide keyboard
            InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);

        } else {

            // Ui is back
            nameField.setText("");
            txtView.setVisibility(View.VISIBLE);
            findViewById(R.id.nameCase).setBackgroundColor(Color.parseColor("#e62831"));
            ((CheckBox) findViewById(R.id.checkAnonymous)).setTextColor(Color.parseColor("#F5F5F5"));

        }





    }


}
