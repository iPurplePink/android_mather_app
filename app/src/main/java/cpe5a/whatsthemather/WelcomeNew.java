package cpe5a.whatsthemather;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class WelcomeNew extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_new);
        Button btn_continue = (Button)findViewById(R.id.btncontinue);

        btn_continue.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btncontinue) {
            Intent MenuA = new Intent(this, menu.class);
            startActivity(MenuA);
        }
    }
}
