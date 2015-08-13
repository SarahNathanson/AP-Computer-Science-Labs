//YOU SHOULD CLICK THE LLAMA
package com.example.sarahnathanson.age;

import android.app.DialogFragment;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button myButton = (Button) findViewById(R.id.okay_button);
        final EditText myEditText = (EditText) findViewById(R.id.edit_text_enter_your_age);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myText = myEditText.getText().toString();
                if(myText.equals("")){
                    Toast.makeText(MainActivity.this,"Enter an integer in the box!",Toast.LENGTH_SHORT).show();
                }else{
                    DialogFragment myFragment = new myDialogFragment();
                    Bundle args = new Bundle();
                    args.putInt("myInt",Integer.parseInt(myText));
                    myFragment.setArguments(args);
                    myFragment.show(getFragmentManager(),"The dialog");
                }
            }
        });
        ImageButton llamaPicture = (ImageButton) findViewById(R.id.llama_button);
        llamaPicture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"I am better than you.",Toast.LENGTH_SHORT).show();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        else if (id == R.id.action_exit) {
            finish();
            return true;
        }
        else if (id == R.id.action_clear) {
            EditText enterAge = (EditText) findViewById(R.id.edit_text_enter_your_age);
            enterAge.setText("");
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
