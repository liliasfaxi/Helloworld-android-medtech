package medtech.tn.a1_greeting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText nameText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameText = (EditText) findViewById(R.id.name);

    }

    public void greeting(View v){
        Toast.makeText(this, "Hello "+nameText.getText(), Toast.LENGTH_SHORT).show();
        Intent i = new Intent(MainActivity.this, GreetingActivity.class);
        i.putExtra("name",nameText.getText().toString());
        startActivity(i);
    }
}
