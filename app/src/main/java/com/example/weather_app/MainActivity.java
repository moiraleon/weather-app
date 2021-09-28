package com.example.weather_app;

import androidx.appcompat.app.AppCompatActivity;

import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    final String API_KEY ="89e5ced9260f0649a78adcc4aab39776";
    final String WEATHER_URL ="https://home.openweathermap.org/data/2.5/weather";

    final long MIN_TIME=5000;
    final float MIN_DISTANCE = 1000;
    final int REQUEST_CODE=101;

    String Location_Provider = LocationManager.GPS_PROVIDER;

    TextView NameofCity, weatherState, Temperature;
    ImageView mweatherIcon;

    RelativeLayout mCityFinder;

    LocationManager mLocationManager;
    LocationListener mLocationListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        weatherState=findViewById(R.id.weatherCondition);
        Temperature=findViewById(R.id.temperature);
        mweatherIcon=findViewById(R.id.weatherIcon);
        mCityFinder=findViewById(R.id.cityFinder);
        NameofCity=findViewById(R.id.cityName);

    }
}