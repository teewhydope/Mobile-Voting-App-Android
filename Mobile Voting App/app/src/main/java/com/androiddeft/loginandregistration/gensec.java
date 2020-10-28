package com.androiddeft.loginandregistration;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

import com.futaevoting.evotingapp.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
//TODO nothing
public class gensec extends gov {

    TextView finalresult;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gensec);
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
                    finalresult.setText("Koyejo");
                    finalresult.setEnabled(true);
                }
                else
                {
                    finalresult.setEnabled(false);
                }
                break;
            case R.id.rb2:
                if(checked) {
                    finalresult.setText("Tolani");
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
        if (n == "Koyejo") {

            databaseReference.child("Koyejo").push().setValue(n);
        }
        else{
            databaseReference.child("Tolani").push().setValue(n);
        }
        Intent startnew = new Intent(this, asgensec.class);
        startActivity(startnew);
    }
}
