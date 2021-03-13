package cpe5a.whatsthemather;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Log_in extends AppCompatActivity implements View.OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        Button btn_login = (Button)findViewById(R.id.btnlogin);
        Button btn_register = (Button)findViewById(R.id.btnregister);

        btn_login.setOnClickListener(this);
        btn_register.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        if (view.getId()==R.id.btnlogin){
                Intent MenuA = new Intent(this, menu.class);
                startActivity(MenuA);
        }

        if (view.getId()==R.id.btnregister) {
            Intent RegisterA = new Intent(this, REGISTER.class);
            startActivity(RegisterA);
        }
    }
}
