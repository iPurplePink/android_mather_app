package cpe5a.whatsthemather;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menu extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button btn_question = (Button)findViewById(R.id.btnquestion);
        Button btn_post = (Button)findViewById(R.id.btnpost);
        Button btn_online = (Button)findViewById(R.id.btnonline);
        Button btn_tutor = (Button)findViewById(R.id.btntutor);
        Button btn_logout = (Button)findViewById(R.id.btnlogout);

        btn_question.setOnClickListener(this);
        btn_post.setOnClickListener(this);
        btn_online.setOnClickListener(this);
        btn_tutor.setOnClickListener(this);
        btn_logout.setOnClickListener(this);

    }

    @Override
    public void onClick(View view){
        if (view.getId()==R.id.btnquestion){
            Intent PostQA = new Intent(this, PostQuestion.class);
            startActivity(PostQA);
        }

        if (view.getId()==R.id.btnpost) {
            Intent PostA = new Intent(this, PostedQuestions.class);
            startActivity(PostA);
        }
        if (view.getId()==R.id.btnonline){
            Intent OnlineA = new Intent(this, Online.class);
            startActivity(OnlineA);
        }

        if (view.getId()==R.id.btntutor) {
            Intent TutorA = new Intent(this, TUTOR.class);
            startActivity(TutorA);
        }

        if (view.getId()==R.id.btnlogout) {
            Intent LogoutA = new Intent(this, Log_in.class);
            startActivity(LogoutA);
        }
    }
}
