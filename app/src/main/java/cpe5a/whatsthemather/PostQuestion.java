package cpe5a.whatsthemather;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PostQuestion extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_question);

        Button btn_share = (Button)findViewById(R.id.btnshare);

        btn_share.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btnshare) {
            Intent PostQA = new Intent(this, PostedQuestions.class);
            startActivity(PostQA);
        }
    }
}
