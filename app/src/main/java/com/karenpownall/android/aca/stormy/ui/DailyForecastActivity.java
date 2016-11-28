package com.karenpownall.android.aca.stormy.ui;

import android.app.ListActivity;
import android.os.Bundle;

import com.karenpownall.android.aca.stormy.R;
import com.karenpownall.android.aca.stormy.adapters.DayAdapter;
import com.karenpownall.android.aca.stormy.model.Day;

public class DailyForecastActivity extends ListActivity {

    private Day[] mDays;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_forecast);

        DayAdapter adapter = new DayAdapter(this,mDays);
    }


}
