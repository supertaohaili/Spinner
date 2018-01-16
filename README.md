# 自定义spinner

自定义spinner，使用AppCompatTextView+PopupWindow 实现下拉选择的功能，代码简单，几个类

#感谢

https://github.com/arcadefire/nice-spinner，本项目是对其的优化与扩展

1、实现了下拉菜单与现实view样式的分离，可单独对显示结果的textview进行样式的处理

2、对下拉菜单增加了分割线等等

……


# 效果图

<img src="https://github.com/supertaohaili/spinner/blob/master/S80116-155928.jpg" width="300">

apk下载链接
<a href="https://github.com/supertaohaili/spinner/blob/master/app-debug.apk">https://github.com/supertaohaili/spinner/blob/master/app-debug.apk</a>

# 使用
```
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}

dependencies {
        compile 'com.github.supertaohaili:spinner:1.0.0'
}


示例代码:
    <org.angmarch.views.NiceSpinner
        android:id="@+id/spinner2"
        android:layout_width="200dp"
        android:layout_height="40dp"
        android:layout_gravity="center_horizontal"
        android:layout_marginTop="25dp"
        android:background="@drawable/shape"
        android:gravity="center"
        app:dropDownListPaddingBottom="35dp" />


         NiceSpinner niceSpinner2 = (NiceSpinner) findViewById(R.id.spinner2);
         List<String> dataset2 = new LinkedList<>(Arrays.asList("10","11","12","13","14","15","16","17","18","19"));
         niceSpinner2.attachDataSource(dataset2);

```




### Known Issues
If you have any questions/queries/Bugs/Hugs please mail @
taohailili@gmail.com
