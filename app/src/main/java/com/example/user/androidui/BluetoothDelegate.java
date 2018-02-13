package com.example.user.androidui;

import android.app.Application;

public class BluetoothDelegate extends Application {

    public BluetoothConnectionService appBluetoothConnectionService;

    @Override
    public void onCreate() {
        super.onCreate();
        appBluetoothConnectionService = new BluetoothConnectionService(this);
    }
}
