package com.jackhou.jacocodemo.test;

/**
 * Author: JackHou
 * Date: 2020/5/26.
 * jacoco
 */
public interface FinishListener {
    void onActivityFinished();

    void dumpIntermediateCoverage(String filePath);
}
