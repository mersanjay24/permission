# permission


How to use this sample project
1. download project
2. add the PermissionBaseActivity.java, PermissionUtils.java and Utils.java file into your project folder
3. when your screen use to ask permission each activity should extent PermissionBaseActivity class 
4. first add the code in OnCreate for all permission 
Example Code : 
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
		
5. Whene application perform the dangerous task like send SMS, Dial Call add below Example Code
      
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

----------------------------------------------------
In the Market so many project and sample code available and also used tham 
My all code is based on this tutorial, it is also one of the good tutorial for permission
Thanks 'Mahdi Tajik' for creating this nice tutorial
 https://github.com/mahdit83 

Link : https://github.com/mahdit83/advancedPermissionHandler

this tutorial only one disadvantages he use Urdu language only




