package com.example.android.profile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView prof_name, viewBonus, resBonus, viewCash, resCash, line, name, cash, bonus;
    EditText editText1, editText2, editText3;
    Button ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        editText3 = findViewById(R.id.editText3);

        prof_name = findViewById(R.id.prof_name);
        resCash = findViewById(R.id.viewCash);
        resBonus = findViewById(R.id.viewBonus);

        ok = findViewById(R.id.ok);

        ok.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {


         prof_name.setText(editText1.getText());

         resCash.setText(editText2.getText());

         resBonus.setText(editText3.getText());

    }
}
