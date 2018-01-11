package com.jinke.location.bean;

/**
 * Created by liukun on 16/3/5.
 */
public class HttpResult {


    /**
     * errcode : 1
     * errmsg : 成功
     */

    private String errcode;
    private String errmsg;
    private User data;

    public void setData(User data) {
        this.data = data;
    }

    public User getData() {
        return data;
    }

    public String getErrcode() {
        return errcode;
    }

    public void setErrcode(String errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }
}
