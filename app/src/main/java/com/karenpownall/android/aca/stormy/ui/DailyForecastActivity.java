package com.karenpownall.android.aca.stormy.ui;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;

import com.karenpownall.android.aca.stormy.R;
import com.karenpownall.android.aca.stormy.adapters.DayAdapter;
import com.karenpownall.android.aca.stormy.model.Day;

import java.util.Arrays;

public class DailyForecastActivity extends ListActivity {

    private Day[] mDays;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_forecast);

        Intent intent = getIntent();
        Parcelable[] parcelables = intent.getParcelableArrayExtra(MainActivity.DAILY_FORECAST);
        mDays = Arrays.copyOf(parcelables, parcelables.length, Day[].class); //an array of items from a parcelable extra intent

        DayAdapter adapter = new DayAdapter(this,mDays);
    }


}
