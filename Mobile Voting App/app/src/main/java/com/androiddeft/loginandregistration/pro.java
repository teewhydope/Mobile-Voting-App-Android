package com.androiddeft.loginandregistration;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

import com.futaevoting.evotingapp.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class pro extends AppCompatActivity {

    TextView finalresult;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pro);
        finalresult = (TextView) findViewById(R.id.resulttext);
        finalresult.setEnabled(false);
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference= firebaseDatabase.getReference();
    }
    public void SelectPres(View view)
    {
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId())
        {
            case R.id.rb1:
                if(checked) {
                    finalresult.setText("Beebee");
                    finalresult.setEnabled(true);
                }
                else
                {
                    finalresult.setEnabled(false);
                }
                break;
            case R.id.rb2:
                if(checked) {
                    finalresult.setText("Halimat");
                    finalresult.setEnabled(true);
                }
                else
                {
                    finalresult.setEnabled(false);
                }
                break;

        }
    }
    public void sendvote(View view){
        String n = finalresult.getText().toString();
        if (n == "Beebee") {

            databaseReference.child("Beebee").push().setValue(n);
        }
        else{
            databaseReference.child("Halimat").push().setValue(n);
        }
        Intent startnew = new Intent(this, dosport.class);
        startActivity(startnew);
    }
}
