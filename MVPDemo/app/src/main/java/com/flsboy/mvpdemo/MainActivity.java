package com.flsboy.mvpdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.flsboy.bean.UserBean;
import com.flsboy.m.MainModelImpl;
import com.flsboy.p.MainPresenter;
import com.flsboy.p.MainPresenterImpl;
import com.flsboy.v.MainView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 *
 *   @author:  flsboy
 *   MVP架构设计中V层
 *   负责绘制UI元素、与用户进行交互
 *   调用Preseter对象处理逻辑
 *   实现MainView接口，Presenter层通过接口回调实现UI刷新
 **/
public class MainActivity extends AppCompatActivity implements MainView{

    @BindView(R.id.user)
    EditText userET;

    @BindView(R.id.email)
    EditText emailET;

    @BindView(R.id.password)
    EditText passwordET;

    @BindView(R.id.regist_in_button)
    Button registBT;

    @BindView(R.id.regist_progress)
    ProgressBar progressBar;

    MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainPresenter = new MainPresenterImpl(this, new MainModelImpl());
        ButterKnife.bind(this);
    }

    @OnClick(R.id.regist_in_button)
    public void registListener(View button) {
        mainPresenter.regist();
    }

    @Override
    public UserBean getUserBean() {
        String userName = userET.getText().toString();
        String userEmail = emailET.getText().toString();
        String userPassword = passwordET.getText().toString();
        UserBean userBean = new UserBean(userName, userEmail, userPassword);
        return userBean;
    }

    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
    }
}
