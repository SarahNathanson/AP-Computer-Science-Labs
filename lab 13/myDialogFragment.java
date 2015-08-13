package com.example.sarahnathanson.age;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by sarahnathanson on 5/29/15.
 */
public class myDialogFragment extends DialogFragment{

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder theDialog = new AlertDialog.Builder(getActivity());
        theDialog.setTitle("Your Age");
        Integer myInt = getArguments().getInt("myInt",0);
        theDialog.setMessage("You are "+myInt+" years old.  Twice your age is "+(myInt*2)+".");
        theDialog.setPositiveButton("okay", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //return to main screen
            }
        });
        return theDialog.create();
    }
}