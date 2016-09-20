package com.example.stas.slimquest;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;

import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;

import com.onesignal.OneSignal;


import java.util.Calendar;

/**
 * Created by Stas on 25.08.2016.
 */
public class GameBegin extends AppCompatActivity implements View.OnClickListener {
    private SeekBar seekBar;
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor spEditor;
    private TextView textView;
    private ImageButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20;
    private Integer bu1 = 0;
    private Integer bu2 = 0;
    private Integer bu3 = 0;
    private Integer bu4 = 0;
    private Integer bu5 = 0;
    private Integer bu6 = 0;
    private Integer bu7 = 0;
    private Integer bu8 = 0;
    private Integer bu9 = 0;
    private Integer bu10 = 0;
    private Integer bu11 = 0;
    private Integer bu12 = 0;
    private Integer bu13 = 0;
    private Integer bu14 = 0;
    private Integer bu15 = 0;
    private Integer bu16 = 0;
    private Integer bu17 = 0;
    private Integer bu18 = 0;
    private Integer bu19 = 0;
    private Integer bu20 = 0;
    private int point1=0;
    private int point2=0;
    private int point3=0;
    private int point4=0;
    private int point5=0;
    private int point6=0;
    private int point7=0;
    private int point8=0;
    private int point9=0;
    private int point10=0;
    private int point11=0;
    private int point12=0;
    private int point13=0;
    private int point14=0;
    private int point15=0;
    private int point16=0;
    private int point17=0;
    private int point18=0;
    private int point19=0;
    private int point20=0;
    public static final String DATE1 = "date1";
    public static final String DATE2 = "date2";
    public static final String DATE3 = "date3";
    public static final String DATE4 = "date4";
    public static final String DATE5 = "date5";
    public static final String DATE6 = "date6";
    public static final String DATE7 = "date7";
    public static final String DATE8 = "date8";
    public static final String DATE9 = "date9";
    public static final String DATE10 = "date10";
    public static final String DATE11 = "date11";
    public static final String DATE12 = "date12";
    public static final String DATE13 = "date13";
    public static final String DATE14 = "date14";
    public static final String DATE15 = "date15";
    public static final String DATE16 = "date16";
    public static final String DATE17 = "date17";
    public static final String DATE18 = "date18";
    public static final String DATE19 = "date19";
    public static final String DATE20 = "date20";
    public static final String POINT1="point1";
    public static final String POINT2="point2";
    public static final String POINT3="point3";
    public static final String POINT4="point4";
    public static final String POINT5="point5";
    public static final String POINT6="point6";
    public static final String POINT7="point7";
    public static final String POINT8="point8";
    public static final String POINT9="point9";
    public static final String POINT10="point10";
    public static final String POINT11="point11";
    public static final String POINT12="point12";
    public static final String POINT13="point13";
    public static final String POINT14="point14";
    public static final String POINT15="point15";
    public static final String POINT16="point16";
    public static final String POINT17="point17";
    public static final String POINT18="point18";
    public static final String POINT19="point19";
    public static final String POINT20="point20";
    public static final String EXP = "exp";
    public static final String MyPREFERENCESS = "MyPrefss";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_activity);
        OneSignal.startInit(this).init();
        seekBar();
        b1 = (ImageButton) findViewById(R.id.b1);
        b2 = (ImageButton) findViewById(R.id.b2);
        b3 = (ImageButton) findViewById(R.id.b3);
        b4 = (ImageButton) findViewById(R.id.b4);
        b5 = (ImageButton) findViewById(R.id.b5);
        b6 = (ImageButton) findViewById(R.id.b6);
        b7 = (ImageButton) findViewById(R.id.b7);
        b8 = (ImageButton) findViewById(R.id.b8);
        b9 = (ImageButton) findViewById(R.id.b9);
        b10 = (ImageButton) findViewById(R.id.b10);
        b11 = (ImageButton) findViewById(R.id.b11);
        b12 = (ImageButton) findViewById(R.id.b12);
        b13 = (ImageButton) findViewById(R.id.b13);
        b14 = (ImageButton) findViewById(R.id.b14);
        b15 = (ImageButton) findViewById(R.id.b15);
        b16 = (ImageButton) findViewById(R.id.b16);
        b17 = (ImageButton) findViewById(R.id.b17);
        b18 = (ImageButton) findViewById(R.id.b18);
        b19 = (ImageButton) findViewById(R.id.b19);
        b20 = (ImageButton) findViewById(R.id.b20);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b10.setOnClickListener(this);
        b11.setOnClickListener(this);
        b12.setOnClickListener(this);
        b13.setOnClickListener(this);
        b14.setOnClickListener(this);
        b15.setOnClickListener(this);
        b16.setOnClickListener(this);
        b17.setOnClickListener(this);
        b18.setOnClickListener(this);
        b19.setOnClickListener(this);
        b20.setOnClickListener(this);
        sharedPreferences = getSharedPreferences(MyPREFERENCESS, Context.MODE_PRIVATE);
        bu1 = sharedPreferences.getInt(DATE1, -1);
        bu2 = sharedPreferences.getInt(DATE2, -1);
        bu3 = sharedPreferences.getInt(DATE3, -1);
        bu4 = sharedPreferences.getInt(DATE4, -1);
        point1 = sharedPreferences.getInt(POINT1, -1);
        point2 = sharedPreferences.getInt(POINT2, -1);
        point3 = sharedPreferences.getInt(POINT3, -1);
        point4 = sharedPreferences.getInt(POINT4, -1);
        point5 = sharedPreferences.getInt(POINT5, -1);
        point6 = sharedPreferences.getInt(POINT6, -1);
        point7 = sharedPreferences.getInt(POINT7, -1);
        point8 = sharedPreferences.getInt(POINT8, -1);
        point9 = sharedPreferences.getInt(POINT9, -1);
        point10 = sharedPreferences.getInt(POINT10, -1);
        point11 = sharedPreferences.getInt(POINT11, -1);
        point12 = sharedPreferences.getInt(POINT12, -1);
        point13 = sharedPreferences.getInt(POINT13, -1);
        point14 = sharedPreferences.getInt(POINT14, -1);
        point15 = sharedPreferences.getInt(POINT15, -1);
        point16 = sharedPreferences.getInt(POINT16, -1);
        point17 = sharedPreferences.getInt(POINT17, -1);
        point18 = sharedPreferences.getInt(POINT18, -1);
        point19 = sharedPreferences.getInt(POINT19, -1);
        point20 = sharedPreferences.getInt(POINT20, -1);
        chouseImage(b1,point1);
        chouseImage(b2,point2);
        chouseImage(b3,point3);
        chouseImage(b4,point4);
        chouseImage(b5,point5);
        chouseImage(b6,point6);
        chouseImage(b7,point7);
        chouseImage(b8,point8);
        chouseImage(b9,point9);
        chouseImage(b10,point10);
        chouseImage(b11,point11);
        chouseImage(b12,point12);
        chouseImage(b13,point13);
        chouseImage(b14,point14);
        chouseImage(b15,point15);
        chouseImage(b16,point16);
        chouseImage(b17,point17);
        chouseImage(b18,point18);
        chouseImage(b19,point19);
        chouseImage(b20,point20);


            }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    private void openNewActivity(int i) {
        if (i == 120) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Поздравляем")
                    .setMessage("Вы достигли новый уровень")
                    .setCancelable(false)
                    .setNegativeButton("Перейти на новый уровень",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    dialog.cancel();
                                    Intent intent = new Intent(GameBegin.this, GameStart.class);
                                    startActivity(intent);
                                    seekBar.setProgress(0);
                                    saveProgress();
                                }
                            });
            AlertDialog alert = builder.create();
            alert.show();

        }
    }


    public void seekBar() {
        seekBar = (SeekBar) findViewById(R.id.seekBar);
        textView = (TextView) findViewById(R.id.textView);
        sharedPreferences = getSharedPreferences(MyPREFERENCESS, Context.MODE_PRIVATE);
        seekBar.setProgress(sharedPreferences.getInt(EXP, 0));
        seekBar.setClickable(false);
        seekBar.setFocusable(false);
        seekBar.setEnabled(false);
        textView.setText("Covered : " + seekBar.getProgress() + "/" + seekBar.getMax());
        seekBar.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    int progresValue;

                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progres, boolean b) {
                        progresValue = progres;
                        textView.setText("Covered : " + progres + "/" + seekBar.getMax());
                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        textView.setText("Covered : " + progresValue + "/" + seekBar.getMax());
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                    }
                });

    }

    public void saveProgress() {
        spEditor = sharedPreferences.edit();
        spEditor.putInt(EXP, seekBar.getProgress());
        spEditor.commit();
        openNewActivity(seekBar.getProgress());
    }

    public Integer saveDate(Integer date, String key_date) {
        Calendar c = Calendar.getInstance();

        int year = c.get(c.YEAR);
        int month = c.get(c.MONTH) + 1;
        int day = c.get(c.DAY_OF_MONTH);
        String y = Integer.toString(year);
        String m = Integer.toString(month);
        String d = Integer.toString(day);
        String hm = y + m + d;
        date = new Integer(hm);
        sharedPreferences = getSharedPreferences(MyPREFERENCESS, Context.MODE_PRIVATE);
        spEditor = sharedPreferences.edit();
        spEditor.putInt(key_date, date);
        spEditor.commit();

        return date;

    }

    public boolean checkDate(int date, int bu) {


        boolean checkdate = false;

        if (date != bu) {
            checkdate = true;
        }

        return checkdate;
    }


    @Override
    public void onClick(View v) {
        int id = v.getId();
        Calendar c = Calendar.getInstance();

        int year = c.get(c.YEAR);
        int month = c.get(c.MONTH) + 1;
        int day = c.get(c.DAY_OF_MONTH);
        String y = Integer.toString(year);
        String m = Integer.toString(month);
        String d = Integer.toString(day);
        String hm = y + m + d;
        Integer date = new Integer(hm);
        switch (id) {
            case R.id.b1:
                if(checkTime(800,1000)) {
                    if (checkDate(date, bu1)) {
                        breakfast(b1);
                        point1=breakfast(b1);
                        saveDate(bu1, DATE1);
                        savePoint(POINT1,point1);
                        sharedPreferences = getSharedPreferences(MyPREFERENCESS, Context.MODE_PRIVATE);
                        bu1 = sharedPreferences.getInt(DATE1, -1);

                    }
                }
                break;
            case R.id.b2:
                if(checkTime(800,1000)) {
                    if (checkDate(date, bu2)) {
                        breakfast(b2);
                        point2= breakfast(b2);
                        saveDate(bu2, DATE2);
                        savePoint(POINT2,point2);
                        sharedPreferences = getSharedPreferences(MyPREFERENCESS, Context.MODE_PRIVATE);
                        bu2 = sharedPreferences.getInt(DATE2, -1);

                    }
                }
                break;
            case R.id.b3:
                if(checkTime(800,1000)) {
                    if (checkDate(date, bu3)) {
                        breakfast(b3);
                        point3= breakfast(b3);
                        saveDate(bu3, DATE3);
                        savePoint(POINT3,point3);
                        sharedPreferences = getSharedPreferences(MyPREFERENCESS, Context.MODE_PRIVATE);
                        bu3 = sharedPreferences.getInt(DATE3, -1);

                    }
                }
                break;
            case R.id.b4:
                if(checkTime(800,1000)) {
                    if (checkDate(date, bu4)) {
                        breakfast(b4);
                        point4= breakfast(b4);
                        saveDate(bu4, DATE4);
                        savePoint(POINT4,point4);
                        sharedPreferences = getSharedPreferences(MyPREFERENCESS, Context.MODE_PRIVATE);
                        bu4 = sharedPreferences.getInt(DATE4, -1);

                    }
                }
                break;
            case R.id.b5:
                if(checkTime(1001,1200)) {
                    if (checkDate(date, bu5)) {
                        brunch(b5);
                        point5=  brunch(b5);
                        savePoint(POINT5,point5);
                        saveDate(bu5, DATE5);
                        sharedPreferences = getSharedPreferences(MyPREFERENCESS, Context.MODE_PRIVATE);
                        bu5 = sharedPreferences.getInt(DATE5, -1);
                    }
                }
                break;
            case R.id.b6:
                if(checkTime(1001,1200)) {
                    if (checkDate(date, bu6)) {
                        brunch(b6);
                        point6=  brunch(b6);
                        savePoint(POINT6,point6);
                        saveDate(bu6, DATE6);
                        sharedPreferences = getSharedPreferences(MyPREFERENCESS, Context.MODE_PRIVATE);
                        bu6 = sharedPreferences.getInt(DATE6, -1);
                    }
                }
                break;
            case R.id.b7:
                if(checkTime(1001,1200)) {
                    if (checkDate(date, bu7)) {
                        brunch(b7);
                        point7=  brunch(b7);
                        savePoint(POINT7,point7);
                        saveDate(bu7, DATE7);
                        sharedPreferences = getSharedPreferences(MyPREFERENCESS, Context.MODE_PRIVATE);
                        bu7 = sharedPreferences.getInt(DATE7, -1);
                    }
                }
                break;
            case R.id.b8:
                if(checkTime(1001,1200)) {
                    if (checkDate(date, bu8)) {
                        brunch(b8);
                        point8=  brunch(b8);
                        savePoint(POINT8,point8);
                        saveDate(bu8, DATE8);
                        sharedPreferences = getSharedPreferences(MyPREFERENCESS, Context.MODE_PRIVATE);
                        bu8 = sharedPreferences.getInt(DATE8, -1);
                    }
                }
                break;
            case R.id.b9:
                if(checkTime(1201,1400)) {
                    if (checkDate(date, bu9)) {
                        lunch(b9);
                        point9=lunch(b9);
                        savePoint(POINT9,point9);
                        saveDate(bu9, DATE9);
                        sharedPreferences = getSharedPreferences(MyPREFERENCESS, Context.MODE_PRIVATE);
                        bu9 = sharedPreferences.getInt(DATE9, -1);
                    }
                }
                break;
            case R.id.b10:
                if(checkTime(1201,1400)) {
                    if (checkDate(date, bu10)) {
                        lunch(b10);
                        point10= lunch(b10);
                        savePoint(POINT10,point10);
                        saveDate(bu10, DATE10);
                        sharedPreferences = getSharedPreferences(MyPREFERENCESS, Context.MODE_PRIVATE);
                        bu10 = sharedPreferences.getInt(DATE10, -1);
                    }
                }
                break;
            case R.id.b11:
                if(checkTime(1201,1400)) {
                    if (checkDate(date, bu11)) {
                        lunch(b11);
                        point11= lunch(b11);
                        savePoint(POINT11,point11);
                        saveDate(bu11, DATE11);
                        sharedPreferences = getSharedPreferences(MyPREFERENCESS, Context.MODE_PRIVATE);
                        bu11 = sharedPreferences.getInt(DATE11, -1);
                    }
                }
                break;
            case R.id.b12:
                if(checkTime(1201,1400)) {
                    if (checkDate(date, bu12)) {
                        lunch(b12);
                        point12= lunch(b12);
                        savePoint(POINT12,point12);
                        saveDate(bu12, DATE12);
                        sharedPreferences = getSharedPreferences(MyPREFERENCESS, Context.MODE_PRIVATE);
                        bu12 = sharedPreferences.getInt(DATE12, -1);
                    }
                }
                break;
            case R.id.b13:
                if(checkTime(1401,1700)) {
                    if (checkDate(date, bu13)) {
                        afternoonSnack(b13);
                        point13=  afternoonSnack(b13);
                        savePoint(POINT13,point13);
                        saveDate(bu13, DATE13);
                        sharedPreferences = getSharedPreferences(MyPREFERENCESS, Context.MODE_PRIVATE);
                        bu13 = sharedPreferences.getInt(DATE13, -1);
                    }
                }
                break;
            case R.id.b14:
                if(checkTime(1401,1700)) {
                    if (checkDate(date, bu14)) {
                        afternoonSnack(b14);
                        point14=  afternoonSnack(b14);
                        savePoint(POINT14,point14);
                        saveDate(bu14, DATE14);
                        sharedPreferences = getSharedPreferences(MyPREFERENCESS, Context.MODE_PRIVATE);
                        bu14 = sharedPreferences.getInt(DATE14, -1);
                    }
                }
                break;
            case R.id.b15:
                if(checkTime(1401,1700)) {
                    if (checkDate(date, bu15)) {
                        afternoonSnack(b15);
                        point15=  afternoonSnack(b15);
                        savePoint(POINT15,point15);
                        saveDate(bu15, DATE15);
                        sharedPreferences = getSharedPreferences(MyPREFERENCESS, Context.MODE_PRIVATE);
                        bu15 = sharedPreferences.getInt(DATE15, -1);
                    }
                }
                break;
            case R.id.b16:
                if(checkTime(1401,1700)) {
                    if (checkDate(date, bu16)) {
                        afternoonSnack(b16);
                        point16=  afternoonSnack(b16);
                        savePoint(POINT16,point16);
                        saveDate(bu16, DATE16);
                        sharedPreferences = getSharedPreferences(MyPREFERENCESS, Context.MODE_PRIVATE);
                        bu16 = sharedPreferences.getInt(DATE16, -1);
                    }
                }
                break;
            case R.id.b17:
                if(checkTime(1701,2000)) {
                    if (checkDate(date, bu17)) {
                        dinner(b17);
                        point17= dinner(b17);
                        savePoint(POINT17,point17);
                        saveDate(bu17, DATE17);
                        sharedPreferences = getSharedPreferences(MyPREFERENCESS, Context.MODE_PRIVATE);
                        bu17 = sharedPreferences.getInt(DATE17, -1);
                    }
                }
                break;
            case R.id.b18:
                if(checkTime(1701,2000)) {
                    if (checkDate(date, bu18)) {
                        dinner(b18);
                        point18= dinner(b18);
                        savePoint(POINT18,point18);
                        saveDate(bu18, DATE18);
                        sharedPreferences = getSharedPreferences(MyPREFERENCESS, Context.MODE_PRIVATE);
                        bu18 = sharedPreferences.getInt(DATE18, -1);
                    }
                }
                break;
            case R.id.b19:
                if(checkTime(1701,2000)) {
                    if (checkDate(date, bu19)) {
                        dinner(b19);
                        point19= dinner(b19);
                        savePoint(POINT19,point19);
                        saveDate(bu19, DATE19);
                        sharedPreferences = getSharedPreferences(MyPREFERENCESS, Context.MODE_PRIVATE);
                        bu19 = sharedPreferences.getInt(DATE19, -1);
                    }
                }
                break;
            case R.id.b20:
                if(checkTime(1701,2000)) {
                    if (checkDate(date, bu20)) {
                        dinner(b20);
                        point20= dinner(b20);
                        savePoint(POINT20,point20);
                        saveDate(bu20, DATE20);
                        sharedPreferences = getSharedPreferences(MyPREFERENCESS, Context.MODE_PRIVATE);
                        bu20 = sharedPreferences.getInt(DATE20, -1);
                    }
                }
                break;
        }
    }
public void chouseImage(ImageButton button,int number){

    if(number==4){
        button.setImageResource(R.drawable.full);
    }
    if(number==2){
        button.setImageResource(R.drawable.half);
    }
    if(number==1){
        button.setImageResource(R.drawable.fourth);
    }
    if(number==0){
        button.setImageResource(R.drawable.emty);
    }
}
    public void savePoint(String key_point,int point){
        sharedPreferences = getSharedPreferences(MyPREFERENCESS, Context.MODE_PRIVATE);
        spEditor = sharedPreferences.edit();
        spEditor.putInt(key_point, point);
        spEditor.commit();
    }
    public int breakfast(ImageButton button) {
        if (checkTime(800,830)) {
            button.setImageResource(R.drawable.full);
            seekBar.setProgress(seekBar.getProgress() + 4);
            saveProgress();
               return 4;
        } else if (checkTime(831, 930)) {
            button.setImageResource(R.drawable.half);
            seekBar.setProgress(seekBar.getProgress() + 2);
            saveProgress();
            return 2;
        } else if (checkTime(931, 1000)) {
            button.setImageResource(R.drawable.fourth);
            seekBar.setProgress(seekBar.getProgress() + 1);
            saveProgress();
            return 1;
        } else {
            button.setImageResource(R.drawable.emty);
            seekBar.setProgress(seekBar.getProgress() + 0);
            saveProgress();
           return 0;
        }
    }

    public int brunch(ImageButton button) {
        if (checkTime(1001, 1030)) {
            button.setImageResource(R.drawable.full);
            seekBar.setProgress(seekBar.getProgress() + 4);
            saveProgress();
            return 4;
        } else if (checkTime(1031, 1130)) {
            button.setImageResource(R.drawable.half);
            seekBar.setProgress(seekBar.getProgress() + 2);
            saveProgress();
            return 2;
        } else if (checkTime(1131, 1200)) {
            button.setImageResource(R.drawable.fourth);
            seekBar.setProgress(seekBar.getProgress() + 1);
            saveProgress();
            return 1;
        } else {
            button.setImageResource(R.drawable.emty);
            seekBar.setProgress(seekBar.getProgress() + 0);
            saveProgress();
            return 0;
        }
    }

    public int lunch(ImageButton button) {
        if (checkTime(1201, 1230)) {
            button.setImageResource(R.drawable.full);
            seekBar.setProgress(seekBar.getProgress() + 4);
            saveProgress();
            return 4;
        } else if (checkTime(1231, 1330)) {
            button.setImageResource(R.drawable.half);
            seekBar.setProgress(seekBar.getProgress() + 2);
            saveProgress();
            return 2;
        } else if (checkTime(1331, 1400)) {
            button.setImageResource(R.drawable.fourth);
            seekBar.setProgress(seekBar.getProgress() + 1);
            saveProgress();
            return 1;
        } else {
            button.setImageResource(R.drawable.emty);
            seekBar.setProgress(seekBar.getProgress() + 0);
            saveProgress();
            return 0;
        }
    }

    public int afternoonSnack(ImageButton button) {
        if (checkTime(1401, 1430)) {
            button.setImageResource(R.drawable.full);
            seekBar.setProgress(seekBar.getProgress() + 4);
            saveProgress();
            return 4;
        } else if (checkTime(1431, 1530)) {
            button.setImageResource(R.drawable.half);
            seekBar.setProgress(seekBar.getProgress() + 2);
            saveProgress();
            return 2;
        } else if (checkTime(1531, 1700)) {
            button.setImageResource(R.drawable.fourth);
            seekBar.setProgress(seekBar.getProgress() + 1);
            saveProgress();
            return 1;
        } else {
            button.setImageResource(R.drawable.emty);
            seekBar.setProgress(seekBar.getProgress() + 0);
            saveProgress();
            return 0;
        }
    }

    public int dinner(ImageButton button) {
        if (checkTime(1701, 1730)) {
            button.setImageResource(R.drawable.full);
            seekBar.setProgress(seekBar.getProgress() + 4);
            saveProgress();
            return 4;
        } else if (checkTime(1731, 1830)) {
            button.setImageResource(R.drawable.half);
            seekBar.setProgress(seekBar.getProgress() + 2);
            saveProgress();
            return 2;

        } else if (checkTime(1831, 2000)) {
            button.setImageResource(R.drawable.fourth);
            seekBar.setProgress(seekBar.getProgress() + 1);
            saveProgress();
            return 1;
        } else {
            button.setImageResource(R.drawable.emty);
            seekBar.setProgress(seekBar.getProgress() + 0);
            saveProgress();
            return 0;
        }
    }

    public boolean checkTime(int from, int until) {


        boolean checktime = false;
        String hm="";
        Calendar c = Calendar.getInstance();

        int hour = c.get(c.HOUR_OF_DAY);
        int minut = c.get(c.MINUTE);
        String h = Integer.toString(hour);
        String m = Integer.toString(minut);
        Integer min=new Integer(m);
        if(min<10){
             hm=h+"0"+m;
        }
        else {
             hm = h + m;

        }
        Integer sum = new Integer(hm);

        if ((from <= sum) && (sum <= until)) {
            checktime = true;
        }

        return checktime;
    }
}
