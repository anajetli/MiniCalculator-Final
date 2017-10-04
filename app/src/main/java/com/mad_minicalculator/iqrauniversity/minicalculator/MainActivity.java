package com.mad_minicalculator.iqrauniversity.minicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import android.widget.Toast;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;


public class MainActivity extends AppCompatActivity {


    /***** Declaring Variable *****/
    Button btnClear;
    TextView tvProcessor, tvResult;

    Button btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnZero;
    String processor;
    Boolean isSmallBracketOpen;
    Button btnMultiply, btnMinus, btnPlus, btnDivide, btnDecimal, btnBack, btnSmallBracket, btnEqual, btnPercentage;
    HorizontalScrollView hsvUserInput;

    int developedCounter;
    static String developedBy = "Atif Naseem";
    static  String deveopedNote = "developed in IU, Tue Oct 10, 2017";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        isSmallBracketOpen = false;
        developedCounter = 0;

        /***** Assigning Variable *****/
        btnClear = (Button) findViewById(R.id.btn_delete);
        tvProcessor = (TextView) findViewById(R.id.tv_process);
        tvResult = (TextView) findViewById(R.id.tv_result);
        hsvUserInput = (HorizontalScrollView) findViewById(R.id.hsvInput);
        afterClick();

        tvProcessor.setText("");
        tvResult.setText("");


        btnOne = (Button) findViewById(R.id.btn_one);
        btnTwo = (Button) findViewById(R.id.btn_two);
        btnThree = (Button) findViewById(R.id.btn_three);
        btnFour = (Button) findViewById(R.id.btn_four);
        btnFive = (Button) findViewById(R.id.btn_five);
        btnSix = (Button) findViewById(R.id.btn_six);
        btnSeven = (Button) findViewById(R.id.btn_seven);
        btnEight = (Button) findViewById(R.id.btn_eight);
        btnNine = (Button) findViewById(R.id.btn_nine);
        btnZero = (Button) findViewById(R.id.btn_zero);


        btnMultiply = (Button) findViewById(R.id.btn_multiply);
        btnMinus = (Button) findViewById(R.id.btn_minus);
        btnPlus = (Button) findViewById(R.id.btn_plus);
        btnDivide = (Button) findViewById(R.id.btn_divide);

        btnDecimal = (Button)findViewById(R.id.btn_dot);
        btnBack = (Button)findViewById(R.id.btn_back);

        btnSmallBracket = (Button)findViewById(R.id.btn_small_bracket);
        btnEqual = (Button) findViewById(R.id.btn_equal);
        btnPercentage = (Button) findViewById(R.id.btn_percentage);

        btnClear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                developedCounter++;
                if(developedCounter >= 5){
                    developedCounter=0;
                    tvProcessor.setText(developedBy);
                    tvResult.setText(deveopedNote);
                    tvResult.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
                    tvProcessor.setTextSize(TypedValue.COMPLEX_UNIT_SP, 30);
                }else{
                    tvProcessor.setText("");
                    tvResult.setText("");
                }
            }
        });


        /******************************************************
         * Number Buttons on-Click
         ******************************************************/
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "1");
            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "2");
            }
        });
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "3");
            }
        });
        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "4");
            }
        });
        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "5");
            }
        });
        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "6");
            }
        });
        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "7");
            }
        });
        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "8");
            }
        });
        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "9");
            }
        });
        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "0");
            }
        });







        /******************************************************
         * Functional Buttons on-Click
         ******************************************************/
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "X");
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "-");
            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "+");
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "/");
            }
        });
        btnDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + ".");
            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
                processor = tvProcessor.getText().toString();
                if(processor.length() > 0){
                    processor = processor.substring(0, processor.length()-1);
                    tvProcessor.setText(processor);
                }else{
                    tvResult.setText("");
                }
            }
        });
        btnSmallBracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
                if(isSmallBracketOpen){
                    processor = tvProcessor.getText().toString();
                    tvProcessor.setText(processor + ")");
                    isSmallBracketOpen = false;
                }else{
                    processor = tvProcessor.getText().toString();
                    tvProcessor.setText(processor + "(");
                    isSmallBracketOpen = true;
                }
            }
        });

        btnPercentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "%");
            }
        });




        /******************************************************
         * Equal Buttons on-Click
         ******************************************************/
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
                processor = tvProcessor.getText().toString();

                if(processor.length() > 0) {

                    processor = processor.replaceAll("X", "*");
                    processor = processor.replaceAll("%", "/100");

                    Context rhino = Context.enter();
                    rhino.setOptimizationLevel(-1);
                    String result;

                    try {
                        Scriptable scope = rhino.initStandardObjects();
                        result = rhino.evaluateString(scope, processor, "JavaScript", 1, null).toString();
                    } catch (Exception e) {
                        result = "Error";
                    }


                    if(result.substring(result.length() - 2).equals(".0")){
                        result = result.substring(0, result.length()-2);
                    }

                    tvProcessor.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
                    tvResult.setText(result);
                    tvResult.setTextSize(TypedValue.COMPLEX_UNIT_SP, 30);
                }
            }
        });
    }


    public void clearScreen(){
        processor = tvProcessor.getText().toString();
        if(processor.contains(developedBy)){
            tvProcessor.setText("");
            tvResult.setText("");
        }
        developedCounter = 0;

        tvResult.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
        tvProcessor.setTextSize(TypedValue.COMPLEX_UNIT_SP, 30);
    }




    public void afterClick(){
        ViewTreeObserver vto = hsvUserInput.getViewTreeObserver();
        vto.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                hsvUserInput.scrollTo(tvProcessor.getWidth(), 0);
            }
        });
    }
}