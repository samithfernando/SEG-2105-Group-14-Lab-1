package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn0,btn1, btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9, btn_clear, btn_plus, btn_equal,btn_minus,btn_divide,btn_mul,btn_dot;
    TextView text_display;

    // This is to evaluate the math expression

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 =  findViewById(R.id.btn0);
        btn1 =  findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 =  findViewById(R.id.btn3);
        btn4 =  findViewById(R.id.btn4);
        btn5 =  findViewById(R.id.btn5);
        btn6 =  findViewById(R.id.btn6);
        btn7 =  findViewById(R.id.btn7);
        btn8 =  findViewById(R.id.btn8);
        btn9 =  findViewById(R.id.btn9);

        btn_plus =  findViewById(R.id.btn_plus);
        btn_minus =  findViewById(R.id.btn_minus);
        btn_divide =  findViewById(R.id.btn_divide);
        btn_mul = findViewById(R.id.btn_mul);
        btn_dot =  findViewById(R.id.btn_dot);


        btn_equal =  findViewById(R.id.btn_equal);
        btn_clear =  findViewById(R.id.btn_clear);
        text_display =  findViewById(R.id.textview_input_display);

        setClickListeners();
    }

    private void setClickListeners() {
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn0.setOnClickListener(this);

        btn_plus.setOnClickListener(this);
        btn_equal.setOnClickListener(this);
        btn_clear.setOnClickListener(this);
        btn_minus.setOnClickListener(this);
        btn_mul.setOnClickListener(this);
        btn_divide.setOnClickListener(this);
        btn_dot.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn1) {
            addNumber("1");
        }
        else if (v.getId() == R.id.btn2) {
            addNumber("2");
        }
        else if (v.getId() == R.id.btn3) {
            addNumber("3");
        }
        else if (v.getId() == R.id.btn4) {
            addNumber("4");
        }
        else if (v.getId() == R.id.btn5) {
            addNumber("5");
        }
        else if (v.getId() == R.id.btn6) {
            addNumber("6");
        }
        else if (v.getId() == R.id.btn7) {
            addNumber("7");
        }
        else if (v.getId() == R.id.btn8) {
            addNumber("8");
        }
        else if (v.getId() == R.id.btn9) {
            addNumber("9");
        }
        else if (v.getId() == R.id.btn0) {
            addNumber("0");
        }

        else if (v.getId() == R.id.btn_mul) {
            addNumber("*");
        }
        else if (v.getId() == R.id.btn_divide) {
            addNumber("/");
        }
        else if (v.getId() == R.id.btn_minus) {
            addNumber("-");
        }
        else if (v.getId() == R.id.btn_plus) {
            addNumber("+");
        }
        else if (v.getId() == R.id.btn_dot) {
            addNumber(".");
        }
        else if (v.getId() == R.id.btn_equal) {
            String result;
            try {
                result = evaluate(text_display.getText().toString());
                text_display.setText(result);

            } catch (Exception e) {
                text_display.setText(0);
            }
        }

        else if (v.getId() == R.id.btn_clear) {
            clear_display();
        }
        else if (v.getId() == R.id.btn0) {
            addNumber("0");
        }
    }
/*
1+1
2*3
4/5
10-3
 */

    private String evaluate(String expression){
        try{
            return MathEval.eval(expression);
        }
        catch(Exception e) {
           return "Error";
        }
    }


    private void addNumber(String number) {
        text_display.setText(text_display.getText() + number);
    }

    private void clear_display() {
        text_display.setText("");
    }
}
