package com.flsboy.m;

import android.os.Handler;

/**
 *   @author:  flsboy
 *   MVP架构设计中M层
 *   负责存储、检索、操纵数据(有时也实现一个Model interface用来降低耦合)
 *   Presenter层实现接口父类，通过接口通知P层调用接口进行UI刷新
 *
 */
public class MainModelImpl implements MainModel{

    @Override
    public void registFinishListener(final OnFinishedListener listener) {
        new Handler().postDelayed(new Runnable() {
            @Override public void run() {
                listener.onFinished();
            }
        }, 2000);
    }
}
