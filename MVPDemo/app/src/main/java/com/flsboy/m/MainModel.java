package com.flsboy.m;

/**
 *   @author:  flsboy
 *   MVP架构设计中M层
 *   定义接口是为了降低耦合度
 *
 */
public interface MainModel {

    interface OnFinishedListener {
        void onFinished();
    }

    void registFinishListener(OnFinishedListener finishedListener);

}
