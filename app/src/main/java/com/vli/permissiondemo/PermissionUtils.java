package com.vli.permissiondemo;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;

import java.util.List;

public class PermissionUtils {

    private static String generateMessageForThesePermissions(String[] permissions) {

        String result = "Permission is required for\n";
        for (String permission :
                permissions) {
            result = result + " ،" + generateMessageForThisPermission(permission);
        }

        return result;
    }

    private static String generateMessageForThisPermission(String permission) {
        return permission.replace("_", " ");
    }

    public static String generatePermissionMessage(String[] permissions) {
        return generateMessageForThesePermissions(permissions);
    }



    public static String[] convertListToArray(List<String> list) {
        String[] converted = new String[list.size()];
        return list.toArray(converted);

    }
}
