package com.example.jyothikrishnamurthy.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button button, button1, button2, button3, button4, button5, button6, buttonpoint, buttonAC, buttonclear,buttonmod,
        button7, button8, button9, button0, buttonplus, buttonminus, buttonmul, buttondiv, buttonequals;
    TextView displayResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);
        button6 = (Button)findViewById(R.id.button6);
        button7 = (Button)findViewById(R.id.button7);
        button8 = (Button)findViewById(R.id.button8);
        button9 = (Button)findViewById(R.id.button9);
        button0 = (Button)findViewById(R.id.button0);
        buttonpoint = (Button)findViewById(R.id.buttonpoint);
        buttonplus = (Button)findViewById(R.id.buttonadd);
        buttonminus = (Button)findViewById(R.id.buttonsub);
        buttonmul = (Button)findViewById(R.id.buttonmul);
        buttondiv = (Button)findViewById(R.id.buttondiv);
        buttonmod = (Button)findViewById(R.id.buttonmod);
        buttonclear = (Button)findViewById(R.id.buttonClear);
        buttonAC = (Button)findViewById(R.id.buttonAllClear);
        buttonequals = (Button)findViewById(R.id.buttonequals);
        displayResult = (TextView)findViewById(R.id.textView);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                displayResult.append(button1.getText());
            }
        });
        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                displayResult.append(button2.getText());
            }
        });
        button3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                displayResult.append(button3.getText());
            }
        });
        button4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                displayResult.append(button4.getText());
            }
        });
        button5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                displayResult.append(button5.getText());
            }
        });
        button6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                displayResult.append(button6.getText());
            }
        });
        button7.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                displayResult.append(button7.getText());
            }
        });
        button8.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                displayResult.append(button8.getText());
            }
        });
        button9.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                displayResult.append(button9.getText());
            }
        });
        button0.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                displayResult.append(button0.getText());
            }
        });
        buttonminus.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                displayResult.append(buttonminus.getText());
            }
        });
        buttonmul.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                displayResult.append(buttonmul.getText());
            }
        });
        buttondiv.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                displayResult.append(buttondiv.getText());
            }
        });
        buttonmod.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                displayResult.append(buttonmod.getText());
            }
        });
        buttonplus.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                displayResult.append(buttonplus.getText());
            }
        });
        buttonpoint.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                displayResult.append(buttonpoint.getText());
            }
        });

        buttonequals.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                String input = displayResult.getText().toString();
                String operator = "";
                String result = "";
                float a;
                float b;

                if (input.contains("/"))
                    operator = "/";
                else if (input.contains("%"))
                    operator = "%";
                else if (input.contains("*"))
                    operator = "*";
                else if (input.contains("+"))
                    operator = "+";
                else if (input.contains("-"))
                    operator = "-";

                if (operator!="") {
                    if(operator!="-")
                    {
                         a = Float.parseFloat(input.substring(0, input.indexOf(operator)));
                         b = Float.parseFloat(input.substring(input.indexOf(operator) + 1, input.length()));
                    }
                    else
                    {
                         a = Float.parseFloat(input.substring(0, input.lastIndexOf("-")));
                         b = Float.parseFloat(input.substring(input.lastIndexOf("-"), input.length()));
                         operator = "+";
                    }
                    switch (operator) {
                        case "+":
                            result = Float.toString(a + b);
                            break;
                        case "-":
                            result = Float.toString(a - b);
                            break;
                        case "*":
                            result = Float.toString(a * b);
                            break;
                        case "/":
                            result = Float.toString(a / b);
                            break;
                        case "%":
                            result = Float.toString(a % b);
                            break;
                        default:
                            result = input;
                    }
                    if (result.contains(".0")) {
                        String resultArr[] = new String[2];
                        resultArr = result.split("\\.");
                        if(resultArr[1].length()>1)
                            displayResult.setText(result);
                        else
                            displayResult.setText(resultArr[0]);
                    } else
                        displayResult.setText(result);
                }
                else
                    displayResult.setText(input);
            }
        });

        buttonAC.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                displayResult.setText("");
            }

        });

        buttonclear.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(displayResult.length()!=0)
                    displayResult.setText(displayResult.getText().subSequence(0, displayResult.length()-1));
                else
                    displayResult.setText("");
            }
        });
    }
}
