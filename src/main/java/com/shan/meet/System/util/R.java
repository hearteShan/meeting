package com.shan.meet.System.util;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class R {
    private Integer code = 0;
    private String msg = "";
    private Map map = new HashMap<>();


    public static R ok(){
        R r = new R();
        r.setMsg("成功");
        return r;
    }

    public static R ok(String s){
        R r = new R();
        r.setMsg(s);
        return r;
    }

    public static R error(){
        R r = new R();
        r.setCode(500);
        r.setMsg("失败");
        return r;
    }

    public static R error(String s){
        R r = new R();
        r.setCode(500);
        r.setMsg(s);
        return r;
    }

    public R put(String s,Object o){
        map.put(s,o);
        return this;
    }


}
