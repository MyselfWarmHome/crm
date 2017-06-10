package com.itheima.web.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by dell on 2017/6/11.
 */
public class CustomerAction extends ActionSupport{

   /* private Customer customer = new Customer();
    public Object getModel() {
        return customer;
    }*/

    public String save(){

        System.out.println("web层执行了");
        return NONE;
    }

    public String add(){

        System.out.println("web层执行了");
        return NONE;
    }
}
