package com.vli.permissiondemo;


import android.Manifest;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends PermissionBaseActivity implements View.OnClickListener {

    Button btnCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCall = findViewById(R.id.btnCall);
        btnCall.setOnClickListener(this);

        askForPermission( Utils.REQUIRED_PERMISSIONS,false, new PermissionCallBack() {

            @Override
            public void onPermissionsGranted() {
                Toast.makeText(MainActivity.this, "onPermissionsGranted", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onPermissionsDenied(String[] permissions) {
                Toast.makeText(MainActivity.this, "onPermissionsDenied ", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public void onClick(View view) {
        if(view == btnCall){
            askForPermission( Manifest.permission.CALL_PHONE,false, new PermissionCallBack() {
                @Override
                public void onPermissionsGranted() {
                    Toast.makeText(MainActivity.this, "onPermissionsGranted You Can Call Any Time", Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onPermissionsDenied(String[] permissions) {
                    Toast.makeText(MainActivity.this, "onPermissionsDenied ", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
