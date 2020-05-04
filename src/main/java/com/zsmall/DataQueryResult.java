package com.zsmall;

import java.lang.reflect.Field;
import java.util.List;

/**
 * @author :zhangshuo7@corp.netease.com
 * @date :22:36 2020/4/23
 */
public class DataQueryResult {
    List<Field> fields;
    List<List<Object>> datas;
    String querySql;

    public DataQueryResult() {
    }

    public DataQueryResult(List<List<Object>> datas) {
        this.datas = datas;
    }

//    public static DataQueryResult getEmptyInstance(List<Field> fields) {
//        DataQueryResult result = new DataQueryResult();
//        List<List<Object>> datas = Collections.emptyList();
//        result.setDatas(datas);
//        result.setFields(fields);
//        return result;
//    }

    public List<Field> getFields() {
        return this.fields;
    }

    public void setFields(List<Field> fields) {
        this.fields = fields;
    }

    public List<List<Object>> getDatas() {
        return this.datas;
    }

    public void setDatas(List<List<Object>> datas) {
        this.datas = datas;
    }

    public String getQuerySql() {
        return this.querySql;
    }

    public void setQuerySql(String querySql) {
        this.querySql = querySql;
    }

    public String toString() {
        return "DataQueryResult [fields=" + this.fields + ", datas=" + this.datas + "]";
    }
}
