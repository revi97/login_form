package ghost.com.login_form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.username);
        e2=findViewById(R.id.password);
        b1=findViewById(R.id.button);
    }


    public void check(View view)
    {

        String admin=e1.getText().toString();
        String password=e2.getText().toString();
        if(admin.equals("admin") && password.equals("password")){

                Toast toast = Toast.makeText(getApplicationContext(), "Login Successful", Toast.LENGTH_SHORT);

                toast.show();
            }
        else {
                Toast toast = Toast.makeText(getApplicationContext(), "Incorrect", Toast.LENGTH_SHORT);

                toast.show();
            }
        }
    }

