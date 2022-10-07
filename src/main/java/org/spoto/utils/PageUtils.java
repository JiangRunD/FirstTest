package org.spoto.utils;

import org.apache.ibatis.session.RowBounds;

public class PageUtils {

    public static RowBounds getRb(Integer pageIndex,Integer pageSize){
        int offset=(pageIndex-1)*pageSize;

        return new RowBounds(offset,pageSize);
    }

    //计算最大页
    public static Integer getMaxPage(Integer pageSize,Integer dataCount){
        return (dataCount % pageSize==0)?(dataCount/pageSize):(dataCount/pageSize)+1;
    }
}
