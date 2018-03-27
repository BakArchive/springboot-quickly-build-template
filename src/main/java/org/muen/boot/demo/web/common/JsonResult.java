package org.muen.boot.demo.web.common;

/**
 * @program: demo
 * @description: 统一Json格式
 * @author: Parasomnia
 * @create: 2018-03-27 17:30
 **/
public class JsonResult {
    private Integer code;//状态码
    private String msg;//json带回的消息
    private Integer count;//分页时所用到的总条数
    private Object data;//json返回的数据
    private String url;//要跳转的url，在统一异常时使用

    public JsonResult(){

    }

    public JsonResult(Integer code){
        this.code = code;
    }

    public JsonResult(Integer code,String msg){
        this.code = code;
        this.msg = msg;
    }

    public JsonResult(Integer code,String msg,Integer count,Object data){
        this.code = code;
        this.msg = msg;
        this.count = count;
        this.data = data;
    }

    public JsonResult(Integer code,String msg,String url){
        this.code = code;
        this.msg = msg;
        this.url = url;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Integer getCode() {

        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
