package com.example.parserarduino;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            String arduino = "<voltage=220,power=3200,speed=0,silent_mode=0>";
             Log.d("MyLog",arduino );

             int index1 = arduino.indexOf('<');
             int index2 = arduino.indexOf('>');
           if ((index1 == 1)||(index2>0)) {
               Log.d("MyLog","data entered correctly");
               int l=arduino.length();
               if (l >24) {
                   String arduino1 = arduino.substring(arduino.indexOf("<") + 1);
                   Log.d("MyLog", "arduino lenght = " + l);
                   String arduino2 = arduino1.substring(0, arduino1.indexOf('='));
                   String arduino3 = arduino1.substring(arduino1.indexOf('=') + 1, arduino1.indexOf(','));
                   if (arduino2.equals("voltage")) {
                       int voltage = Integer.parseInt(arduino3);
                       Log.d("MyLog", "voltage = " + voltage);
                   }
                   if (arduino2.equals("power")) {
                       int power = Integer.parseInt(arduino3);
                       Log.d("MyLog", "power = " + power);
                   }
                   if (arduino2.equals("speed")) {
                       int speed = Integer.parseInt(arduino3);
                       Log.d("MyLog", "speed = " + speed);
                   }
                   if (arduino2.equals("silent_mode")) {
                       int silent_mode = Integer.parseInt(arduino3);
                       Log.d("MyLog", "silent_mode = " + silent_mode);
                   }
                   String arduino4 = arduino1.substring(arduino1.indexOf(",") + 1);
                   String arduino5 = arduino4.substring(0, arduino4.indexOf('='));
                   String arduino6 = arduino4.substring(arduino4.indexOf('=') + 1, arduino4.indexOf(','));
                   if (arduino5.equals("voltage")) {
                       int voltage = Integer.parseInt(arduino6);
                       Log.d("MyLog", "voltage = " + voltage);
                   }
                   if (arduino5.equals("power")) {
                       int power = Integer.parseInt(arduino6);
                       Log.d("MyLog", "power = " + power);
                   }
                   if (arduino5.equals("speed")) {
                       int speed = Integer.parseInt(arduino6);
                       Log.d("MyLog", "speed = " + speed);
                   }
                   if (arduino5.equals("silent_mode")) {
                       int silent_mode = Integer.parseInt(arduino6);
                       Log.d("MyLog", "silent_mode = " + silent_mode);
                   }
                   String arduino7 = arduino4.substring(arduino4.indexOf(",") + 1);
                   String arduino8 = arduino7.substring(0, arduino7.indexOf('='));
                   String arduino9 = arduino7.substring(arduino7.indexOf('=') + 1, arduino7.indexOf(','));
                   if (arduino8.equals("voltage")) {
                       int voltage = Integer.parseInt(arduino9);
                       Log.d("MyLog", "voltage = " + voltage);
                   }
                   if (arduino8.equals("power")) {
                       int power = Integer.parseInt(arduino9);
                       Log.d("MyLog", "power = " + power);
                   }
                   if (arduino8.equals("speed")) {
                       int speed = Integer.parseInt(arduino9);
                       Log.d("MyLog", "speed = " + speed);
                   }
                   if (arduino8.equals("silent_mode")) {
                       int silent_mode = Integer.parseInt(arduino9);
                       Log.d("MyLog", "silent_mode = " + silent_mode);
                   }
                   String arduino10 = arduino7.substring(arduino7.indexOf(",") + 1);
                   String arduino11 = arduino10.substring(0, arduino10.indexOf('='));
                   String arduino12 = arduino10.substring(arduino10.indexOf('=') + 1, arduino10.indexOf('>'));
                   if (arduino11.equals("voltage")) {
                       int voltage = Integer.parseInt(arduino12);
                       Log.d("MyLog", "voltage = " + voltage);
                   }
                   if (arduino11.equals("power")) {
                       int power = Integer.parseInt(arduino12);
                       Log.d("MyLog", "power = " + power);
                   }
                   if (arduino11.equals("speed")) {
                       int speed = Integer.parseInt(arduino12);
                       Log.d("MyLog", "speed = " + speed);
                   }
                   if (arduino11.equals("silent_mode")) {
                       int silent_mode = Integer.parseInt(arduino12);
                       Log.d("MyLog", "silent_mode = " + silent_mode);
                   }
               }
               else {
                   String arduino1 = arduino.substring(arduino.indexOf("<") + 1);
                   Log.d("MyLog", "arduino lenght = " + l);
                   String arduino2 = arduino1.substring(0, arduino1.indexOf('='));
                   String arduino3 = arduino1.substring(arduino1.indexOf('=') + 1, arduino1.indexOf(','));
                   if (arduino2.equals("voltage")) {
                       int voltage = Integer.parseInt(arduino3);
                       Log.d("MyLog", "voltage = " + voltage);
                   }
                   if (arduino2.equals("power")) {
                       int power = Integer.parseInt(arduino3);
                       Log.d("MyLog", "power = " + power);
                   }
                   if (arduino2.equals("speed")) {
                       int speed = Integer.parseInt(arduino3);
                       Log.d("MyLog", "speed = " + speed);
                   }
                   if (arduino2.equals("silent_mode")) {
                       int silent_mode = Integer.parseInt(arduino3);
                       Log.d("MyLog", "silent_mode = " + silent_mode);
                   }
                   String arduino4 = arduino1.substring(arduino1.indexOf(",") + 1);
                   String arduino5 = arduino4.substring(0, arduino4.indexOf('='));
                   String arduino6 = arduino4.substring(arduino4.indexOf('=') + 1, arduino4.indexOf('>'));
                   if (arduino5.equals("voltage")) {
                       int voltage = Integer.parseInt(arduino6);
                       Log.d("MyLog", "voltage = " + voltage);
                   }
                   if (arduino5.equals("power")) {
                       int power = Integer.parseInt(arduino6);
                       Log.d("MyLog", "power = " + power);
                   }
                   if (arduino5.equals("speed")) {
                       int speed = Integer.parseInt(arduino6);
                       Log.d("MyLog", "speed = " + speed);
                   }
                   if (arduino5.equals("silent_mode")) {
                       int silent_mode = Integer.parseInt(arduino6);
                       Log.d("MyLog", "silent_mode = " + silent_mode);
                   }
               }
           }
           else Log.d("MyLog","data entered incorrectly");




        }
    
    }
