package com.example.greendaotest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.greendaotest.gen.UserDao;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private UserDao mUserDao;
    private User mUser;

    List<User> mUsers = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mUserDao = MyApplication.getInstances().getDaoSession().getUserDao();//获取UserDao对象

        //增
        mUser = new User(1, "xiaoming");
        mUserDao.insert(mUser);//添加一个

        //删
        mUserDao.deleteByKey(1);

        //改
        mUser = new User(1, "honghong");
        mUserDao.update(mUser);

        //查
        mUsers = mUserDao.loadAll();
        String userName = "";
        for (int i = 0; i < mUsers.size(); i++) {
            userName += mUsers.get(i).getName() + ",";
        }
        Log.i("TAG", userName);
    }
}
