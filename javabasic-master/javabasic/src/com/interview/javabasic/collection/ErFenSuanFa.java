package com.interview.javabasic.collection;

import com.mysql.jdbc.StringUtils;
import sun.swing.StringUIClientPropertyKey;

import java.util.Arrays;

public class ErFenSuanFa {
    private static ErFenSuanFa erFenSuanFa=new ErFenSuanFa();
    //二分法
    public static int key(int[] arr,int key){
        int begin=0;
        int end=arr.length-1;
        int index=0;
        while (begin<end){
            index=(begin+end)/2;
            if (key==arr[index]){
                return index;
            }
            if (key>arr[index]){
                begin=index+1;
            }else {
                end=index-1;
            }
        }
        return -1;
    }
    //冒泡排序
    public static  String sort(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    int index=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=index;
                }
            }
        }
        for (int key:arr){
            System.out.println(key);
        }
        return "";
    }

    //单列模式
    public static ErFenSuanFa single(){
        //包含
        return erFenSuanFa;
    }

    public static ErFenSuanFa lazysingle(ErFenSuanFa erFenSuanFa){
        //蓝含
        if (null==erFenSuanFa){
            erFenSuanFa=new ErFenSuanFa();
        }
        return erFenSuanFa;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 6, 7, 9, 15, 20, 26, 33, 56, 63};
        System.out.println(key(arr,56));
    }
}
