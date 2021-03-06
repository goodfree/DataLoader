package com.jeremyliao.dataloader.base.common;

/**
 * Created by liaohailiang on 2019-07-19.
 */
public class LoaderInfo {

    public String method;

    public String targetClass;

    public String loaderClass;

    public String loaderInterface;

    public String returnType;

    public String[] paramTypes;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("method: ").append(method).append(";");
        sb.append("targetClass: ").append(targetClass).append(";");
        sb.append("loaderClass: ").append(loaderClass).append(";");
        sb.append("loaderInterface: ").append(loaderInterface).append(";");
        sb.append("returnType: ").append(returnType).append(";");
        sb.append("paramTypes: ").append(paramTypes).append(";");
        return sb.toString();
    }
}
