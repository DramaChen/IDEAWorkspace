package com.cjl.java;

/**
 * @author ChenJunLin
 * @Date 2018/8/21-12:13
 */
public class TemplateTest {


    

public void test(){
  
}
    //模版一： psvm
    public static void main(String[] args) {
        //模板二：
        System.out.println("hello");
        //变形:soutv
        System.out.println("TemplateTest.main");
        System.out.println("args = " + args);


        //模板三： fori
        String[] arr=new  String[]{"Tom","jun","cjl"};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
        //模板四: iter
        for (String s : arr) {

        }


    }



}
