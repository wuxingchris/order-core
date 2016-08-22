package com.order.core.vo;


import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * Created by xing on 2016/8/22.
 */
public class BaseVo {
    public String toString(){
        try{
            return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
        }catch(Throwable e){
            return getClass().getName();
        }
    }
}
