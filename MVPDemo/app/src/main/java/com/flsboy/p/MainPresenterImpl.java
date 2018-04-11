package com.flsboy.p;

import com.flsboy.m.MainModel;
import com.flsboy.v.MainView;

/**
 *   @author:  flsboy
 *   MVP架构设计中P层
 *   作为View与Model交互的中间纽带，处理与用户交互的负责逻辑。
 *
 */
public class MainPresenterImpl implements MainPresenter, MainModel.OnFinishedListener {

    private MainView mainView;
    private MainModel mainModel;

    public MainPresenterImpl(MainView mainView, MainModel mainModel) {
        this.mainView = mainView;
        this.mainModel = mainModel;
    }


    @Override
    public void regist() {
        if(mainView != null) {
            mainView.getUserBean();
        }

        mainModel.registFinishListener(this);
    }

    @Override
    public void onDestroy() {
        mainView = null;
    }

    @Override
    public void onFinished() {
        mainView.showProgress();
    }
}
