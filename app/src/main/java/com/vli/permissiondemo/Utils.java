package com.vli.permissiondemo;

import android.Manifest;

public class Utils {

    public static String[] REQUIRED_PERMISSIONS = new String[]{
        Manifest.permission.INTERNET,
        Manifest.permission.CALL_PHONE
    };
}
