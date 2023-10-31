package com.classwork.ur7dz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Integer first, second, sum;
    private String operation;
    private Boolean isOperationClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text_view);
    }

    public void onNumberClick(View view) {
       String text = ((MaterialButton) view).getText().toString();
       if (text.equals("AC")){
           textView.setText("0");
           first = 0;
           second = 0;
       }else if (textView.getText().toString().equals("0") || isOperationClick){
           textView.setText(text);
       }else {
           textView.append(text);
       }
       isOperationClick = false;
    }

    public void onOpereitonClick(View view) {
        String text = ((MaterialButton) view).getText().toString();

        switch (text){
            case "+":
                first = Integer.valueOf(textView.getText().toString());
                operation = "+";
                isOperationClick = true;
                break;
            case "-":
                first = Integer.valueOf(textView.getText().toString());
                operation = "-";
                isOperationClick = true;
                break;
            case "/":
                first = Integer.valueOf(textView.getText().toString());
                operation = "/";
                isOperationClick = true;
                break;
            case "X":
                first = Integer.valueOf(textView.getText().toString());
                operation = "X";
                isOperationClick = true;
                break;
            case "=":
                second = Integer.valueOf(textView.getText().toString());
                if (operation.equals("+")){
                    sum = first + second;
                    textView.setText(sum.toString());
                } else if (operation.equals("-")){
                    sum = first - second;
                    textView.setText(sum.toString());
                }else if (operation.equals("/")){
                    sum = first / second;
                    textView.setText(sum.toString());
                }else if (operation.equals("X")){
                    sum = first * second;
                    textView.setText(sum.toString());
                }


                break;
        }
        isOperationClick = true;
    }

}