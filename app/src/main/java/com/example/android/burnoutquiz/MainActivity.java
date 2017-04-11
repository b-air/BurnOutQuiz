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
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.id.message;
import static com.example.android.burnoutquiz.R.id.Q10L1;
import static com.example.android.burnoutquiz.R.id.Q10L2;
import static com.example.android.burnoutquiz.R.id.Q10L3;
import static com.example.android.burnoutquiz.R.id.Q10L4;
import static com.example.android.burnoutquiz.R.id.Q11L1;
import static com.example.android.burnoutquiz.R.id.Q11L2;
import static com.example.android.burnoutquiz.R.id.Q11L3;
import static com.example.android.burnoutquiz.R.id.Q11L4;
import static com.example.android.burnoutquiz.R.id.Q12L1;
import static com.example.android.burnoutquiz.R.id.Q12L2;
import static com.example.android.burnoutquiz.R.id.Q12L3;
import static com.example.android.burnoutquiz.R.id.Q12L4;
import static com.example.android.burnoutquiz.R.id.Q13L1;
import static com.example.android.burnoutquiz.R.id.Q13L2;
import static com.example.android.burnoutquiz.R.id.Q13L3;
import static com.example.android.burnoutquiz.R.id.Q13L4;
import static com.example.android.burnoutquiz.R.id.Q14L1;
import static com.example.android.burnoutquiz.R.id.Q14L2;
import static com.example.android.burnoutquiz.R.id.Q14L3;
import static com.example.android.burnoutquiz.R.id.Q14L4;
import static com.example.android.burnoutquiz.R.id.Q1L1;
import static com.example.android.burnoutquiz.R.id.Q1L2;
import static com.example.android.burnoutquiz.R.id.Q1L3;
import static com.example.android.burnoutquiz.R.id.Q1L4;
import static com.example.android.burnoutquiz.R.id.Q2L1;
import static com.example.android.burnoutquiz.R.id.Q2L2;
import static com.example.android.burnoutquiz.R.id.Q2L3;
import static com.example.android.burnoutquiz.R.id.Q2L4;
import static com.example.android.burnoutquiz.R.id.Q3L1;
import static com.example.android.burnoutquiz.R.id.Q3L2;
import static com.example.android.burnoutquiz.R.id.Q3L3;
import static com.example.android.burnoutquiz.R.id.Q3L4;
import static com.example.android.burnoutquiz.R.id.Q4L1;
import static com.example.android.burnoutquiz.R.id.Q4L2;
import static com.example.android.burnoutquiz.R.id.Q4L3;
import static com.example.android.burnoutquiz.R.id.Q4L4;
import static com.example.android.burnoutquiz.R.id.Q5L1;
import static com.example.android.burnoutquiz.R.id.Q5L2;
import static com.example.android.burnoutquiz.R.id.Q5L3;
import static com.example.android.burnoutquiz.R.id.Q5L4;
import static com.example.android.burnoutquiz.R.id.Q6L1;
import static com.example.android.burnoutquiz.R.id.Q6L2;
import static com.example.android.burnoutquiz.R.id.Q6L3;
import static com.example.android.burnoutquiz.R.id.Q6L4;
import static com.example.android.burnoutquiz.R.id.Q7L1;
import static com.example.android.burnoutquiz.R.id.Q7L2;
import static com.example.android.burnoutquiz.R.id.Q7L3;
import static com.example.android.burnoutquiz.R.id.Q7L4;
import static com.example.android.burnoutquiz.R.id.Q8L1;
import static com.example.android.burnoutquiz.R.id.Q8L2;
import static com.example.android.burnoutquiz.R.id.Q8L3;
import static com.example.android.burnoutquiz.R.id.Q8L4;
import static com.example.android.burnoutquiz.R.id.Q9L1;
import static com.example.android.burnoutquiz.R.id.Q9L2;
import static com.example.android.burnoutquiz.R.id.Q9L3;
import static com.example.android.burnoutquiz.R.id.Q9L4;
import static com.example.android.burnoutquiz.R.id.checkAnonymous;
import static com.example.android.burnoutquiz.R.id.myRadioGroup1;
import static com.example.android.burnoutquiz.R.id.myRadioGroup10;
import static com.example.android.burnoutquiz.R.id.myRadioGroup11;
import static com.example.android.burnoutquiz.R.id.myRadioGroup12;
import static com.example.android.burnoutquiz.R.id.myRadioGroup13;
import static com.example.android.burnoutquiz.R.id.myRadioGroup14;
import static com.example.android.burnoutquiz.R.id.myRadioGroup2;
import static com.example.android.burnoutquiz.R.id.myRadioGroup3;
import static com.example.android.burnoutquiz.R.id.myRadioGroup4;
import static com.example.android.burnoutquiz.R.id.myRadioGroup5;
import static com.example.android.burnoutquiz.R.id.myRadioGroup6;
import static com.example.android.burnoutquiz.R.id.myRadioGroup7;
import static com.example.android.burnoutquiz.R.id.myRadioGroup8;
import static com.example.android.burnoutquiz.R.id.myRadioGroup9;
import static com.example.android.burnoutquiz.R.id.nameField;

public class MainActivity extends AppCompatActivity {

    /**
     * var
     */

    int burnOut = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void onResume(){
        super.onResume();
        initView();

    }

    /**
     * anonymous checkbox behavior
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
            findViewById(R.id.nameCase).setBackgroundColor(Color.parseColor("#CFD8DC"));
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


    /**
     * Init state
     */

    public void initView(){


        //Hide Retry Layout
        LinearLayout aLayout=(LinearLayout) this.findViewById(R.id.answerLayout);
        aLayout.setVisibility(LinearLayout.GONE);



        // define var needed
        final CheckBox checkBox = (CheckBox)findViewById(R.id.checkAnonymous);
        EditText nameField = (EditText)findViewById(R.id.nameField);
        TextView txtView = (TextView)findViewById(R.id.nameField);

        if(checkBox.isChecked()){

            //change text hide text
            nameField.setText("Anonymous");
            txtView.setVisibility(View.GONE);

            //change box color
            findViewById(R.id.nameCase).setBackgroundColor(Color.parseColor("#CFD8DC"));
            ((CheckBox) findViewById(R.id.checkAnonymous)).setTextColor(Color.parseColor("#e62831"));


        } else {

            // Ui is back
            nameField.setText("");
            txtView.setVisibility(View.VISIBLE);
            findViewById(R.id.nameCase).setBackgroundColor(Color.parseColor("#e62831"));
            ((CheckBox) findViewById(R.id.checkAnonymous)).setTextColor(Color.parseColor("#F5F5F5"));

        }




    }


    /**
     *  Send button SUBMIT behavior
     */

    public void submitTest(View view){

        // Get result
        burnOutCalculation();


        //Hide Question Ui
        LinearLayout qLayout=(LinearLayout)this.findViewById(R.id.questionLayout);
        qLayout.setVisibility(LinearLayout.GONE);

        //Show Retry Layout
        LinearLayout aLayout=(LinearLayout) this.findViewById(R.id.answerLayout);
        aLayout.setVisibility(LinearLayout.VISIBLE);



        // Give result to user

        giveResult();



/*        // COMMENT BEFORE PRODUCTION !!!!!!
        //Toast the burnOut Score
        Context context = getApplicationContext();
        CharSequence text = "You scored " + burnOut + " points!";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();*/

    }


    /**
     *  Send button RETRY behavior
     */

    public void submitRetry(View view){

        //Show Question Ui
        LinearLayout qLayout=(LinearLayout)this.findViewById(R.id.questionLayout);
        qLayout.setVisibility(LinearLayout.VISIBLE);

        //hide Retry Ui
        LinearLayout aLayout=(LinearLayout) this.findViewById(R.id.answerLayout);
        aLayout.setVisibility(LinearLayout.GONE);

        // CLEAR ALL CHECKBOXES

        RadioGroup rGrp = (RadioGroup) findViewById(myRadioGroup1);
        rGrp.clearCheck();
         rGrp = (RadioGroup) findViewById(myRadioGroup2);
        rGrp.clearCheck();
        rGrp = (RadioGroup) findViewById(myRadioGroup3);
        rGrp.clearCheck();
        rGrp = (RadioGroup) findViewById(myRadioGroup4);
        rGrp.clearCheck();
        rGrp = (RadioGroup) findViewById(myRadioGroup5);
        rGrp.clearCheck();
        rGrp = (RadioGroup) findViewById(myRadioGroup6);
        rGrp.clearCheck();
        rGrp = (RadioGroup) findViewById(myRadioGroup7);
        rGrp.clearCheck();
        rGrp = (RadioGroup) findViewById(myRadioGroup8);
        rGrp.clearCheck();
        rGrp = (RadioGroup) findViewById(myRadioGroup9);
        rGrp.clearCheck();
        rGrp = (RadioGroup) findViewById(myRadioGroup10);
        rGrp.clearCheck();
        rGrp = (RadioGroup) findViewById(myRadioGroup11);
        rGrp.clearCheck();
        rGrp = (RadioGroup) findViewById(myRadioGroup12);
        rGrp.clearCheck();
        rGrp = (RadioGroup) findViewById(myRadioGroup13);
        rGrp.clearCheck();
        rGrp = (RadioGroup) findViewById(myRadioGroup14);
        rGrp.clearCheck();



    }


    /**
     *  Give result to user
     */
    public void giveResult(){


        // Write user name

        EditText txtnameField = (EditText)findViewById(R.id.nameField);
        String name  =  txtnameField.getText().toString();

        TextView textName = (TextView) findViewById(R.id.nameResult);
        textName.setText(name);


        // Write burnOut Diagnostic

        String burnOutResult = "";


        if(burnOut <=14 ){

            burnOutResult = "0 - 14 Your Life Is in Balance.\n" +
                    "\n" +
                    "Congratulations. You know how to manage your life physically, emotionally and spiritually. You know when to press on—and when to drop it all and take a nap. You're able to understand that work comes from your efforts—not your effort to be the very best at every minute. You can care for others while also taking good care of yourself.";

        } else if (burnOut <= 17){

            burnOutResult = "15 - 16 Burnout Alert\n" +
                    "\n" +
                    "Time to make a few changes. You may still be making a living, but you're starting to lose your life. Your energy is low, you're emotionally overwhelmed, your relationships are beginning to suffer, and you may even be losing confidence in your abilities. You may have heard this before, but that's because it's true: Your best work comes when you back off and take time to recharge.\n" +
                    "\n" +
                    "Suggestions: Put aside at least 60 minutes a day for exercise, nature, yoga, hobbies, fun, meditation or whatever rejuvenates you. Think of this time as a nonnegotiable contract with yourself—no canceling, no postponing. Each weekend, take at least one full day off. And when it comes to boundaries, remember: It is essential to say no to other people so you can say yes to yourself. If you don't know how to decline at the moment someone asks, try \"I'll get back to you later.\"";

        } else {

            burnOutResult = "17 - 42 You're Fried.\n" +
                    "\n" +
                    "Time for a makeover! You are at the point where burnout can morph into its more serious cousin, depression. The emotional exhaustion, lack of energy, physical symptoms and loss of confidence you're experiencing don't have to last. You have choices, but learning to revamp your lifestyle may require some help—a therapist, a coach or, if you've been using alcohol or pills as a crutch, a recovery program. You might want to start by talking to a spouse or close friend and let them know what is going on. You may find they're already aware of the problem and can offer some solutions, either by taking stuff off your plate or by pointing out where your efforts aren't worth what you're getting in return.";

        }

        TextView textResult = (TextView) findViewById(R.id.diags);
        textResult.setText(burnOutResult);


    }


    /**
     *  Calculate burnOut from radio buttons
     */

    public int burnOutCalculation(){

        burnOut = 0;

        // Question 1
        // Radio Group
        RadioButton checkQ1 = (RadioButton) findViewById(Q1L1);
        if (checkQ1.isChecked()) {
            burnOut += 0;
        }
        checkQ1 = (RadioButton) findViewById(Q1L2);
        if (checkQ1.isChecked()) {
            burnOut += 3;
        }
        checkQ1 = (RadioButton) findViewById(Q1L3);
        if (checkQ1.isChecked()) {
            burnOut += 2;
        }
        checkQ1 = (RadioButton) findViewById(Q1L4);
        if (checkQ1.isChecked()) {
            burnOut += 1;
        }

        // Question 2
        // Radio Group
        RadioButton checkQ2 = (RadioButton) findViewById(Q2L1);
        if (checkQ2.isChecked()) {
            burnOut += 1;
        }
        checkQ2 = (RadioButton) findViewById(Q2L2);
        if (checkQ2.isChecked()) {
            burnOut += 2;
        }
        checkQ2 = (RadioButton) findViewById(Q2L3);
        if (checkQ2.isChecked()) {
            burnOut += 0;
        }
        checkQ2 = (RadioButton) findViewById(Q2L4);
        if (checkQ2.isChecked()) {
            burnOut += 3;
        }

        // Question 3
        // Radio Group
        RadioButton checkQ3 = (RadioButton) findViewById(Q3L1);
        if (checkQ3.isChecked()) {
            burnOut += 2;
        }
        checkQ3 = (RadioButton) findViewById(Q3L2);
        if (checkQ3.isChecked()) {
            burnOut += 3;
        }
        checkQ3 = (RadioButton) findViewById(Q3L3);
        if (checkQ3.isChecked()) {
            burnOut += 1;
        }
        checkQ3 = (RadioButton) findViewById(Q3L4);
        if (checkQ3.isChecked()) {
            burnOut += 0;
        }

        // Question 4
        // Radio Group
        RadioButton checkQ4 = (RadioButton) findViewById(Q4L1);
        if (checkQ4.isChecked()) {
            burnOut += 1;
        }
        checkQ4 = (RadioButton) findViewById(Q4L2);
        if (checkQ4.isChecked()) {
            burnOut += 0;
        }
        checkQ4 = (RadioButton) findViewById(Q4L3);
        if (checkQ4.isChecked()) {
            burnOut += 3;
        }
        checkQ4 = (RadioButton) findViewById(Q4L4);
        if (checkQ4.isChecked()) {
            burnOut += 2;
        }

        // Question 5
        // Radio Group
        RadioButton checkQ5 = (RadioButton) findViewById(Q5L1);
        if (checkQ5.isChecked()) {
            burnOut += 1;
        }
        checkQ5 = (RadioButton) findViewById(Q5L2);
        if (checkQ5.isChecked()) {
            burnOut += 2;
        }
        checkQ5 = (RadioButton) findViewById(Q5L3);
        if (checkQ5.isChecked()) {
            burnOut += 0;
        }
        checkQ5 = (RadioButton) findViewById(Q5L4);
        if (checkQ5.isChecked()) {
            burnOut += 3;
        }

        // Question 6
        // Radio Group
        RadioButton checkQ6 = (RadioButton) findViewById(Q6L1);
        if (checkQ6.isChecked()) {
            burnOut += 3;
        }
        checkQ6 = (RadioButton) findViewById(Q6L2);
        if (checkQ6.isChecked()) {
            burnOut += 2;
        }
        checkQ6 = (RadioButton) findViewById(Q6L3);
        if (checkQ6.isChecked()) {
            burnOut += 0;
        }
        checkQ6 = (RadioButton) findViewById(Q6L4);
        if (checkQ6.isChecked()) {
            burnOut += 1;
        }

        // Question 7
        // Radio Group
        RadioButton checkQ7 = (RadioButton) findViewById(Q7L1);
        if (checkQ7.isChecked()) {
            burnOut += 1;
        }
        checkQ7 = (RadioButton) findViewById(Q7L2);
        if (checkQ7.isChecked()) {
            burnOut += 2;
        }
        checkQ7 = (RadioButton) findViewById(Q7L3);
        if (checkQ7.isChecked()) {
            burnOut += 0;
        }
        checkQ7 = (RadioButton) findViewById(Q7L4);
        if (checkQ7.isChecked()) {
            burnOut += 3;
        }

        // Question 8
        // Radio Group
        RadioButton checkQ8 = (RadioButton) findViewById(Q8L1);
        if (checkQ8.isChecked()) {
            burnOut += 3;
        }
        checkQ8 = (RadioButton) findViewById(Q8L2);
        if (checkQ8.isChecked()) {
            burnOut += 1;
        }
        checkQ8 = (RadioButton) findViewById(Q8L3);
        if (checkQ8.isChecked()) {
            burnOut += 2;
        }
        checkQ8 = (RadioButton) findViewById(Q8L4);
        if (checkQ8.isChecked()) {
            burnOut += 0;
        }

        // Question 9
        // Radio Group
        RadioButton checkQ9 = (RadioButton) findViewById(Q9L1);
        if (checkQ9.isChecked()) {
            burnOut += 2;
        }
        checkQ9 = (RadioButton) findViewById(Q9L2);
        if (checkQ9.isChecked()) {
            burnOut += 3;
        }
        checkQ9 = (RadioButton) findViewById(Q9L3);
        if (checkQ9.isChecked()) {
            burnOut += 0;
        }
        checkQ9 = (RadioButton) findViewById(Q9L4);
        if (checkQ9.isChecked()) {
            burnOut += 1;
        }

        // Question 10
        // Radio Group
        RadioButton checkQ10 = (RadioButton) findViewById(Q10L1);
        if (checkQ10.isChecked()) {
            burnOut += 1;
        }
        checkQ10 = (RadioButton) findViewById(Q10L2);
        if (checkQ10.isChecked()) {
            burnOut += 0;
        }
        checkQ10 = (RadioButton) findViewById(Q10L3);
        if (checkQ10.isChecked()) {
            burnOut += 3;
        }
        checkQ10 = (RadioButton) findViewById(Q10L4);
        if (checkQ10.isChecked()) {
            burnOut += 2;
        }

        // Question 11
        // Radio Group
        RadioButton checkQ11 = (RadioButton) findViewById(Q11L1);
        if (checkQ11.isChecked()) {
            burnOut += 2;
        }
        checkQ11 = (RadioButton) findViewById(Q11L2);
        if (checkQ11.isChecked()) {
            burnOut += 0;
        }
        checkQ11 = (RadioButton) findViewById(Q11L3);
        if (checkQ11.isChecked()) {
            burnOut += 3;
        }
        checkQ11 = (RadioButton) findViewById(Q11L4);
        if (checkQ11.isChecked()) {
            burnOut += 1;
        }

        // Question 12
        // Radio Group
        RadioButton checkQ12 = (RadioButton) findViewById(Q12L1);
        if (checkQ12.isChecked()) {
            burnOut += 3;
        }
        checkQ12 = (RadioButton) findViewById(Q12L2);
        if (checkQ12.isChecked()) {
            burnOut += 0;
        }
        checkQ12 = (RadioButton) findViewById(Q12L3);
        if (checkQ12.isChecked()) {
            burnOut += 1;
        }
        checkQ12 = (RadioButton) findViewById(Q12L4);
        if (checkQ12.isChecked()) {
            burnOut += 2;
        }

        // Question 13
        // Radio Group
        RadioButton checkQ13 = (RadioButton) findViewById(Q13L1);
        if (checkQ13.isChecked()) {
            burnOut += 3;
        }
        checkQ13 = (RadioButton) findViewById(Q13L2);
        if (checkQ13.isChecked()) {
            burnOut += 1;
        }
        checkQ13 = (RadioButton) findViewById(Q13L3);
        if (checkQ13.isChecked()) {
            burnOut += 0;
        }
        checkQ13 = (RadioButton) findViewById(Q13L4);
        if (checkQ13.isChecked()) {
            burnOut += 2;
        }

        // Question 14
        // Radio Group
        RadioButton checkQ14 = (RadioButton) findViewById(Q14L1);
        if (checkQ14.isChecked()) {
            burnOut += 1;
        }
        checkQ14 = (RadioButton) findViewById(Q14L2);
        if (checkQ14.isChecked()) {
            burnOut += 2;
        }
        checkQ14 = (RadioButton) findViewById(Q14L3);
        if (checkQ14.isChecked()) {
            burnOut += 0;
        }
        checkQ14 = (RadioButton) findViewById(Q14L4);
        if (checkQ14.isChecked()) {
            burnOut += 3;
        }


        return burnOut;


    }


}
