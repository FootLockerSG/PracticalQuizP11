package sg.edu.rp.c346.practicalquiz;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etAcc;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etAcc = findViewById(R.id.editTextAccNum);
        submit = findViewById(R.id.button);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder myBuilder = new AlertDialog.Builder(MainActivity.this);
                myBuilder.setTitle("Account's Submission");
                myBuilder.setMessage("Submit: " + etAcc.getText().toString());
                myBuilder.setCancelable(true);
                myBuilder.setPositiveButton("CONFIRM", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast toast = Toast.makeText(getApplicationContext(), etAcc.getText().toString() + " submitted", Toast.LENGTH_LONG);
                        toast.show();
                    }
                });
                myBuilder.setNegativeButton("CANCEL",null);

                AlertDialog myDialog = myBuilder.create();
                myDialog.show();
            }
        });



    }
}
