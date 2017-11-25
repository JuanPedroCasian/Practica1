package com.casianporter.demo_app;

import android.support.v7.app.AppCompatActivity; // Makes the app compatible with other versions of android
import android.os.Bundle; // operating system bundle = what lets you operate in android
import android.util.Log;
import android.view.View; // Imports all for the views which are all the graphical stuff

    /* Public means that the class could be accessed form anywhere in the app

        Class is for the type and nex comes the name

        Extends means that it will take the code from AppCompatActivity and add the MainActivity code

        The class has the same name as the activity it controls.


     */

public class MainActivity extends AppCompatActivity {

    public void  ClickFunction (View button) { /* This creates a function named click function and
                                                    creates a variable of type view which are all the graphical things in the xml
                                                    so this function will be called by the button
                                                    */

        Log.i ("Info", "Button was press");  /* this is how you send a message to the monitor
                                                            Log.i will display the message in the logs. the i stands for info
                                                            The tag is what comes before the message to know that it is
                                                            The msg is what you want to say

                                                            Log.i (tag, message);

                                                            */

    }

    @Override   // This override only tells the program that we know the function already exists but we want to add something to it
    protected void onCreate(Bundle savedInstanceState) {        // Protected means that this code is only accessible withing our own package
        super.onCreate(savedInstanceState);     // This line takes the previous state of the app and restores it
        setContentView(R.layout.activity_main); //This creates the view from the .xml file (R. s the shortcut for resources)
    }

}
