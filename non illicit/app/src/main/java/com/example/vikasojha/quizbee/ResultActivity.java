package com.example.vikasojha.quizbee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.QuickContactBadge;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ResultActivity extends AppCompatActivity {
    TextView tv, tv2, tv3;
    Button btnRestart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        //tv = (TextView)findViewById(R.id.tvres);
        //tv2 = (TextView)findViewById(R.id.tvres2);
        tv3 = (TextView)findViewById(R.id.tvres3);
        btnRestart = (Button) findViewById(R.id.btnRestart);

        //StringBuffer sb = new StringBuffer();
        //sb.append("Correct answers: " + QuestionsActivity.correct + "\n");
        //StringBuffer sb2 = new StringBuffer();
        //sb2.append("Wrong Answers: " + QuestionsActivity.wrong + "\n");
        StringBuffer sb3 = new StringBuffer();
        if(0<=QuestionsActivity.correct && QuestionsActivity.correct<=5.0){
            sb3.append("Final score: "+ QuestionsActivity.correct +"/15\n"+
                    "You are in serious danger\n"+
                    "Your drug use has likely already caused problems in your life.\n" +
                    " You should seek professional help before your substance abuse and becomes even tougher to overcome.\n" +
                     "Cadabam’s Anunitha  rehabs are located in Bangalore and Hyderabad. \n" +"\n"+
                    "- India's largest chain of de-addiction rehabs \n" +
                    "- Pioneers of specialised de-addiction in India\n" +
                    "- India's largest team of mental health professionals \n" +
                    "- 30 years of experience and expertise in de-addiction and mental healthcare \n" +
                    "Visit Us: Gulakamale Village, Near Kaggalipura 17th Mile," +
                    " Kanakapura Road, Taralu, Post, Bengaluru, Karnataka 560082\n" +
                    "Call Us: 96111 94949\n");

        }
        else if(5.0<=QuestionsActivity.correct && QuestionsActivity.correct<=10.0){
            sb3.append("Final score: "+ QuestionsActivity.correct +"/15\n"+
                    "Stay vigilant\n"+
                    "Thank you for taking this important step.\n"+
                    "Your drug use if not monitored well may lead to serious altercations or life changing issues\n"+
                    "Doctors we recommend\n"+
                    "Dr. Iyer Kamlam Gopal (PhD) Psychologist in Bangalore.\n" +
                    "Contact: 9108289885\n"+
                    "Narcotics Anonymous near you\n"+
                    "Ncb Banglore Office, Civil police in Bengaluru, Karnataka\n" +
                    "Address: 7/1-2, Bagalur Main Road, Priyanka Villas, Ramanna Garden, Kattigenahalli, Bengaluru");
        }
        else{
            sb3.append("Final score: "+ QuestionsActivity.correct +"/15\n"+
                    "Stay Safe\n" +
                    "Your results suggest that you have a low likelihood of drug addiction.\n" +
                    "If you are still concerned\n"+
                    "We would suggest practicing mindfulness,impulse control\n"+
                    "and engage in activities which bring joy to your life");
        }

        //tv.setText(sb);
        //tv2.setText(sb2);
        tv3.setText(sb3);

        QuestionsActivity.correct=0;
        //QuestionsActivity.wrong=0;

        btnRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(in);
            }
        });
    }

}
