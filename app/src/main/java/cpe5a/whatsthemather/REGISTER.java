package cpe5a.whatsthemather;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class REGISTER extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button btn_create = (Button)findViewById(R.id.btncreate);

        btn_create.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        if (view.getId()==R.id.btncreate){
            Intent WelcomeA = new Intent(this, WelcomeNew.class);
            startActivity(WelcomeA);
        }


    }
}
