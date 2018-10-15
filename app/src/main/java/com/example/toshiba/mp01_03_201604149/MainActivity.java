package com.example.toshiba.mp01_03_201604149;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

import static com.example.toshiba.mp01_03_201604149.R.*;

public class MainActivity extends AppCompatActivity {

    String usedVal = "";
    int state = 0;
    int startByNum = 0;
    int lastVal = 0;
    int doubleState = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
    }

    public void cal1(View view) {
        TextView tvValue = (TextView)findViewById(R.id.val);
        String preVal = "";
        if (state == 0) {
            preVal = tvValue.getText().toString();
        }
        preVal += "1";
        tvValue.setText(preVal);
        state = 0;
        startByNum = 1;
        lastVal = 0;
        doubleState = 0;
    }

    public void cal2(View view) {
        TextView tvValue = (TextView)findViewById(R.id.val);
        String preVal = "";
        if (state == 0){
            preVal = tvValue.getText().toString();
        }
        preVal += "2";
        tvValue.setText(preVal);
        state = 0;
        startByNum = 1;
        lastVal = 0;
        doubleState = 0;
    }

    public void cal3(View view) {
        TextView tvValue = (TextView)findViewById(R.id.val);
        String preVal = "";
        if (state == 0){
            preVal = tvValue.getText().toString();
        }
        preVal += "3";
        tvValue.setText(preVal);
        state = 0;
        startByNum = 1;
        lastVal = 0;
        doubleState = 0;
    }

    public void cal4(View view) {
        TextView tvValue = (TextView)findViewById(R.id.val);
        String preVal = "";
        if (state == 0){
            preVal = tvValue.getText().toString();
        }
        preVal += "4";
        tvValue.setText(preVal);
        state = 0;
        startByNum = 1;
        lastVal = 0;
        doubleState = 0;
    }

    public void cal5(View view) {
        TextView tvValue = (TextView)findViewById(R.id.val);
        String preVal = "";
        if (state == 0){
            preVal = tvValue.getText().toString();
        }
        preVal += "5";
        tvValue.setText(preVal);
        state = 0;
        startByNum = 1;
        lastVal = 0;
        doubleState = 0;
    }

    public void cal6(View view) {
        TextView tvValue = (TextView)findViewById(R.id.val);
        String preVal = "";
        if (state == 0){
            preVal = tvValue.getText().toString();
        }
        preVal += "6";
        tvValue.setText(preVal);
        state = 0;
        startByNum = 1;
        lastVal = 0;
        doubleState = 0;
    }

    public void cal7(View view) {
        TextView tvValue = (TextView)findViewById(R.id.val);
        String preVal = "";
        if (state == 0){
            preVal = tvValue.getText().toString();
        }
        preVal += "7";
        tvValue.setText(preVal);
        state = 0;
        startByNum = 1;
        lastVal = 0;
        doubleState = 0;
    }

    public void cal8(View view) {
        TextView tvValue = (TextView)findViewById(R.id.val);
        String preVal = "";
        if (state == 0){
            preVal = tvValue.getText().toString();
        }
        preVal += "8";
        tvValue.setText(preVal);
        state = 0;
        startByNum = 1;
        lastVal = 0;
        doubleState = 0;
    }

    public void cal9(View view) {
        TextView tvValue = (TextView)findViewById(R.id.val);
        String preVal = "";
        if (state == 0){
            preVal = tvValue.getText().toString();
        }
        preVal += "9";
        tvValue.setText(preVal);
        state = 0;
        startByNum = 1;
        lastVal = 0;
        doubleState = 0;
    }

    public void cal0(View view) {
        TextView tvValue = (TextView)findViewById(R.id.val);
        String preVal = "";
        if (state == 0){
            preVal = tvValue.getText().toString();
        }
        preVal += "0";
        tvValue.setText(preVal);
        state = 0;
        startByNum = 1;
        lastVal = 0;
        doubleState = 0;
    }

    // clear C
    public void calC(View view) {
        TextView tvValue = (TextView)findViewById(R.id.val);
        String preVal = "";
        tvValue.setText(preVal);
        state = 0;
        startByNum = 0;
        usedVal = "";
        lastVal = 0;
        doubleState = 0;
    }

    // double .
    public void calU(View view) {
        if (doubleState == 0){
            TextView tvValue = (TextView)findViewById(R.id.val);
            String preVal = "";
            if (state == 0){
                preVal = tvValue.getText().toString();
            }
            preVal += ".";
            tvValue.setText(preVal);
            state = 0;
            doubleState = 1;
        }
    }

    // divide /
    public void calD(View view) {
        if (startByNum == 1 || state == 1){
            if(lastVal == 0){
                TextView tvValue = (TextView)findViewById(R.id.val);
                String preVal = tvValue.getText().toString();
                preVal += " / ";
                tvValue.setText(preVal);
                state = 0;
                lastVal = 1;
            }
        }
    }

    // multiply *
    public void calM(View view) {
        if (startByNum == 1 || state == 1){
            if (lastVal == 0) {
                TextView tvValue = (TextView)findViewById(R.id.val);
                String preVal = tvValue.getText().toString();
                preVal += " * ";
                tvValue.setText(preVal);
                state = 0;
                lastVal = 1;
            }
        }
    }

    // subtract -
    public void calS(View view) {
        if (startByNum == 1 || state == 1){
            if(lastVal == 0) {
                TextView tvValue = (TextView)findViewById(R.id.val);
                String preVal = tvValue.getText().toString();
                preVal += " - ";
                tvValue.setText(preVal);
                state = 0;
                lastVal = 1;
            }
        }
    }

    // plus +
    public void calP(View view) {
        if (startByNum == 1 || state == 1){
            if(lastVal == 0) {
                TextView tvValue = (TextView)findViewById(R.id.val);
                String preVal = tvValue.getText().toString();
                preVal += " + ";
                tvValue.setText(preVal);
                state = 0;
                lastVal = 1;
            }
        }
    }

    // equal =
    public void calE(View view) {
        if (startByNum != 0 && lastVal == 0){
            TextView tvValue = (TextView) findViewById(R.id.val);
            String preVal = tvValue.getText().toString();
            if (preVal.contains("0 /") || preVal.contains("/ 0") || preVal.contains(".0 /") || preVal.contains("/ .0")){

            }
            else {
                if (preVal.charAt(1) == '+' || preVal.charAt(1) == '-' || preVal.charAt(1) == '*' || preVal.charAt(1) == '/') {
                    preVal = usedVal + preVal;
                }
                Expression e = new ExpressionBuilder(preVal).build();
                double calVal = e.evaluate();
                String aftVal = "";
                if (preVal.contains(".")) {
                    aftVal = String.valueOf(calVal);
                } else {
                    int calIntVal = Integer.parseInt(String.valueOf(Math.round(calVal)));
                    aftVal = String.valueOf(calIntVal);
                }
                tvValue.setText(aftVal);
                usedVal = aftVal;
                state = 1;
                startByNum = 0;
                lastVal = 0;
                doubleState = 0;
            }
        }
    }
}
