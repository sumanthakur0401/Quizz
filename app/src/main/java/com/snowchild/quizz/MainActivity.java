package com.snowchild.quizz;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.github.hariprasanths.bounceview.BounceView;

import java.util.Timer;
import java.util.TimerTask;


public class MainActivity extends AppCompatActivity {

    Button next;
    TextView text,welcome;
    Dialog dialog;
    private ProgressBar pb1;
    int counter = 0;
    int counter1 = 0;
    private int CurrentProgress= 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dialog = new Dialog(this);
        text = findViewById(R.id.text);
        welcome = findViewById(R.id.welcometext);
        next = (Button)findViewById(R.id.button);

        pb1 = findViewById(R.id.pbar1);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CurrentProgress=10;
                pb1.setProgress(CurrentProgress);
                pb1.setMax(100);
                openOne();
                text.setText("Oops! You haven't completed the quiz, try again.");
                next.setText("Try again");

                Button a = (Button) dialog.findViewById(R.id.button1);
                a.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        welcome.setText(" ");
                        CurrentProgress = CurrentProgress+10;
                        pb1.setProgress(CurrentProgress);
                        pb1.setMax(100);
                        openTwo();

                        Button b = (Button) dialog.findViewById(R.id.button2);
                        b.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                CurrentProgress = CurrentProgress+10;
                                pb1.setProgress(CurrentProgress);
                                pb1.setMax(100);
                                openThree();

                                Button c = (Button) dialog.findViewById(R.id.button3);
                                c.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        CurrentProgress = CurrentProgress+10;
                                        pb1.setProgress(CurrentProgress);
                                        pb1.setMax(100);
                                        openFour();

                                        Button d = (Button) dialog.findViewById(R.id.button4);
                                        d.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                CurrentProgress = CurrentProgress+10;
                                                pb1.setProgress(CurrentProgress);
                                                pb1.setMax(100);
                                                openFive();

                                                Button e = (Button) dialog.findViewById(R.id.button5);
                                                e.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View view) {
                                                        CurrentProgress = CurrentProgress+10;
                                                        pb1.setProgress(CurrentProgress);
                                                        pb1.setMax(100);
                                                        openSix();

                                                        Button f = (Button) dialog.findViewById(R.id.button6);
                                                        f.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View view) {
                                                                CurrentProgress = CurrentProgress+10;
                                                                pb1.setProgress(CurrentProgress);
                                                                pb1.setMax(100);
                                                                openSeven();

                                                                Button g = (Button) dialog.findViewById(R.id.button7);
                                                                g.setOnClickListener(new View.OnClickListener() {
                                                                    @Override
                                                                    public void onClick(View view) {
                                                                        CurrentProgress = CurrentProgress+10;
                                                                        pb1.setProgress(CurrentProgress);
                                                                        pb1.setMax(100);
                                                                        openEight();

                                                                        Button h = (Button) dialog.findViewById(R.id.button8);
                                                                        h.setOnClickListener(new View.OnClickListener() {

                                                                            @Override
                                                                            public void onClick(View view) {
                                                                                CurrentProgress = CurrentProgress+10;
                                                                                pb1.setProgress(CurrentProgress);
                                                                                pb1.setMax(100);
                                                                                openNine();

                                                                                Button i = (Button) dialog.findViewById(R.id.button9);
                                                                                i.setOnClickListener(new View.OnClickListener() {
                                                                                    @Override
                                                                                    public void onClick(View view) {
                                                                                        CurrentProgress = CurrentProgress+10;
                                                                                        pb1.setProgress(CurrentProgress);
                                                                                        pb1.setMax(100);
                                                                                        openTen();

                                                                                        Button j = (Button) dialog.findViewById(R.id.button10);
                                                                                        j.setOnClickListener(new View.OnClickListener() {
                                                                                            @Override
                                                                                            public void onClick(View view) {
                                                                                                pb1.setVisibility(View.INVISIBLE);
                                                                                                next.setVisibility(View.INVISIBLE);

                                                                                                text.setText("Congrats! For completing the quiz");

                                                                                                dialog.dismiss();
                                                                                            }
                                                                                        });
                                                                                    }
                                                                                });
                                                                            }
                                                                        });
                                                                    }
                                                                });
                                                            }
                                                        });
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                    }
                });
            }
        });

}


            private void openOne() {

                dialog.setContentView(R.layout.one);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                BounceView.addAnimTo(dialog);
                dialog.show();

            }

            private void openTwo() {

                dialog.setContentView(R.layout.two);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                BounceView.addAnimTo(dialog);
                dialog.show();
            }

            private void openThree() {

                dialog.setContentView(R.layout.three);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }

            private void openFour() {

                dialog.setContentView(R.layout.four);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }

            private void openFive() {

                dialog.setContentView(R.layout.five);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }

            private void openSix() {

                dialog.setContentView(R.layout.six);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }

            private void openSeven() {

                dialog.setContentView(R.layout.seven);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }

            private void openEight() {

                dialog.setContentView(R.layout.eight);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }

            private void openNine() {

                dialog.setContentView(R.layout.nine);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }

            private void openTen() {

                dialog.setContentView(R.layout.ten);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }

        }
