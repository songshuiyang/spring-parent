package com.learn.struts.action;

import com.opensymphony.xwork2.ActionSupport;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * JSON action
 *
 * @author songshuiyang
 * @date 2018/7/23 23:02
 */
@Component
public class JsonAction extends ActionSupport {

    int[] ints = {10, 20};

    String name = "songsy";

    Integer age = 18;

    List<String> list = new ArrayList<String>();

    public int[] getInts() {
        return ints;
    }

    public void setInts(int[] ints) {
        this.ints = ints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    public String execute() throws Exception {
        list.add("wefq");
        list.add("sdfa");
        return SUCCESS;
    }
}
