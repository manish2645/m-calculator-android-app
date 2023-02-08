package com.bytecode.mcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CalculationBoard extends AppCompatActivity {

    String pi = "3.14159265";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculation_board);

                Button buttonAc = (Button)findViewById(R.id.button_ac);
                Button buttonClear = (Button)findViewById(R.id.button_clear);
                Button buttonOpen = (Button)findViewById(R.id.button_open);
                Button buttonClose = (Button)findViewById(R.id.button_close);
                Button buttonSin = (Button)findViewById(R.id.button_sin);
                Button buttonCos = (Button)findViewById(R.id.button_cos);
                Button buttonTan = (Button)findViewById(R.id.button_tan);
                Button buttonLog = (Button)findViewById(R.id.button_log);
                Button buttonLn = (Button)findViewById(R.id.button_ln);
                Button buttonFac = (Button)findViewById(R.id.button_fac);
                Button buttonSquare = (Button)findViewById(R.id.button_square);
                Button buttonRoot = (Button)findViewById(R.id.button_root);
                Button buttonReci = (Button)findViewById(R.id.button_reci);
                Button buttonDivide = (Button)findViewById(R.id.button_divide);
                Button buttonMul = (Button)findViewById(R.id.button_mul);
                Button buttonSub = (Button)findViewById(R.id.button_minus);
                Button buttonAdd = (Button)findViewById(R.id.button_add);
                Button buttonEqual = (Button)findViewById(R.id.button_equal);
                Button buttonPi = (Button)findViewById(R.id.button_pi);
                Button buttonDot = (Button)findViewById(R.id.button_dot);
                Button button0 = (Button)findViewById(R.id.button_0);
                Button button1 = (Button)findViewById(R.id.button_1);
                Button button2 = (Button)findViewById(R.id.button_2);
                Button button3 = (Button)findViewById(R.id.button_3);
                Button button4 = (Button)findViewById(R.id.button_4);
                Button button5 = (Button)findViewById(R.id.button_5);
                Button button6 = (Button)findViewById(R.id.button_6);
                Button button7 = (Button)findViewById(R.id.button_7);
                Button button8 = (Button)findViewById(R.id.button_8);
                Button button9 = (Button)findViewById(R.id.button_9);

                TextView tvSec = (TextView) findViewById(R.id.tvSolution);
                TextView tvMain = (TextView) findViewById(R.id.tvResult);

                button1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tvMain.setText(tvMain.getText()+"1");
                    }
                });
                button2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tvMain.setText(tvMain.getText()+"2");
                    }
                });

                button3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tvMain.setText(tvMain.getText()+"3");
                    }
                });
                button4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tvMain.setText(tvMain.getText()+"4");
                    }
                });

                button5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tvMain.setText(tvMain.getText()+"5");
                    }
                });
                button6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tvMain.setText(tvMain.getText()+"6");
                    }
                });

                button7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tvMain.setText(tvMain.getText()+"7");
                    }
                });

                button8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tvMain.setText(tvMain.getText()+"8");
                    }
                });
                button9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tvMain.setText(tvMain.getText()+"9");
                    }
                });
                button0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tvMain.setText(tvMain.getText()+"0");
                    }
                });
                buttonDot.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tvMain.setText(tvMain.getText()+".");
                    }
                });
                buttonAc.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tvMain.setText("");
                        tvSec.setText("");
                    }
                });

                buttonClear.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String val = tvMain.getText().toString();
                        val = val.substring(0, val.length() - 1);
                        tvMain.setText(val);
                    }
                });

                buttonAdd.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tvMain.setText(tvMain.getText()+"+");
                    }
                });

                buttonSub.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tvMain.setText(tvMain.getText()+"-");
                    }
                });

                buttonMul.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tvMain.setText(tvMain.getText()+"*");
                    }
                });

                buttonDivide.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tvMain.setText(tvMain.getText()+"/");
                    }
                });

                buttonRoot.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String val = tvMain.getText().toString();
                        double r = Math.sqrt(Double.parseDouble(val));
                        tvSec.setText(String.valueOf(r));
                    }
                });
                buttonOpen.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tvMain.setText(tvMain.getText()+"(");
                    }
                });

                buttonClose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tvMain.setText(tvMain.getText()+")");
                    }
                });

                buttonPi.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tvSec.setText(buttonPi.getText());
                        tvMain.setText(tvMain.getText()+pi);
                    }
                });
                buttonSin.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tvMain.setText(tvMain.getText()+"sin");
                    }
                });
                buttonCos.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tvMain.setText(tvMain.getText()+"cos");
                    }
                });
                buttonTan.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tvMain.setText(tvMain.getText()+"tan");
                    }
                });
                buttonReci.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tvMain.setText(tvMain.getText()+"^"+"(-1)");
                    }
                });
                buttonFac.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int val = Integer.parseInt(tvMain.getText().toString());
                        int fact = factorial(val);
                        tvSec.setText(String.valueOf(fact));
                        tvMain.setText(val+"!");
                    }
                });
                buttonSquare.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        double d = Double.parseDouble(tvMain.getText().toString());
                        double square = d * d;
                        tvSec.setText(String.valueOf(square));
                        tvMain.setText(d+"^2");
                    }
                });
                buttonEqual.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String val = tvMain.getText().toString();
                        String replaceStr = val.replace('÷','/');
                        double result = eval(replaceStr);
                        tvSec.setText(String.valueOf(result));
                        tvMain.setText(val);
                    }
                });
                buttonLn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tvMain.setText(tvMain.getText()+"ln");
                    }
                });
                buttonLog.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tvMain.setText(tvMain.getText()+"log");
                    }
                });




    }
    //factorial function
    int factorial(int n){
        return (n==1 || n==0) ? 1 : n*factorial(n-1);
    }

    //eval function
    public static double eval(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }

            // Grammar:
            // expression = term | expression `+` term | expression `-` term
            // term = factor | term `*` factor | term `/` factor
            // factor = `+` factor | `-` factor | `(` expression `)`
            //        | number | functionName factor | factor `^` factor

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else if (func.equals("log")) x = Math.log10(x);
                    else if (func.equals("ln")) x = Math.log(x);
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            }
        }.parse();
    }
}