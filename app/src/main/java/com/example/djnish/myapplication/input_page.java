package com.example.djnish.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class input_page extends AppCompatActivity {

    @InjectView(R.id.editText) EditText et1;
    @InjectView(R.id.editText2) EditText et2;
    @InjectView(R.id.TVresult) TextView tvr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_page);
        ButterKnife.inject(this);
    }
    @OnClick(R.id.button) void addanddisplay()
    {
        String s1,s2,s3;
        s1 = et1.getText().toString();
        s2 = et2.getText().toString();
        s3= s1+s2;
        if (s1.matches("[a-zA-Z]+") && s2.matches("[a-zA-Z]+"))
        {
            Toast toast = Toast.makeText(getApplicationContext(), "You entered string values!",
                    Toast.LENGTH_SHORT);
            toast.show();
            tvr.setText(s3);
        }
        else
        {
            int n1,n2,n3;
            n1=Integer.parseInt(s1);
            n2=Integer.parseInt(s2);
            n3=n1+n2;
            Toast toast1 = Toast.makeText(getApplicationContext(), "You entered integer values!",
                    Toast.LENGTH_SHORT);
            toast1.show();
            tvr.setText(Integer.toString(n3));
        }

}
}
