package org.neuedu.hisjava.model;

public class RespBean {
    private Integer status;
    private String msg;
    private Object obj;

    public static RespBean ok(Integer status, String msg, Object obj){
        return new RespBean(status,msg,obj);
    }
    public static RespBean ok(Integer status, String msg){
        return new RespBean(status,msg,null);
    }
    public static RespBean error(Integer status, String msg, Object obj){
        return new RespBean(status,msg,obj);
    }
    public static RespBean error(Integer status, String msg){
        return new RespBean(status,msg,null);
    }
    private RespBean(Integer status, String msg, Object obj) {
        this.status = status;
        this.msg = msg;
        this.obj = obj;
    }

    public RespBean() {
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}
