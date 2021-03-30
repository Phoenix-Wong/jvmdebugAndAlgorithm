package com.example.jvmdebugdemo;

/**
 * @author MikeWang
 * @date 2021/3/30 4:01 下午
 */
public class HashTable {
    //散列表存储数据数组
    int[] elements;
    //散列表插入数据数量
    public int count = 0;
    //散列表最大容量
    public int size = 12;
    //散列表初始值
    public final int NULLEKY = Integer.MIN_VALUE;

    //初始化hash表
    public HashTable(){
        int[] elements = new int[size];
        for (int i = 0; i < size; i++) {
            this.elements[i] = NULLEKY;
        }
    }

    //求散列函数  除法散列法
    //插入元素
    public void insertHash(int key){
        if (count==size) {
            return;
        }
        //求散列地址
        int index = key%size;
        while (this.elements[index] !=NULLEKY){
            //线性探测法解决冲突
            index = (key+1)%size;
        }
        //插入值
        this.elements[index] =key;
        //总数加一
        count++;
    }

    public String  searchHash(int key){
        int index = key%size;
        while (this.elements[index] != key){
            //开放地址法的线性探测
            index = (key+1)%size;
            //不存在情况  一种是散列地址处在初始值，循环一圈回到原来位置
            if(this.elements[index] ==NULLEKY||index==key%size){
                return "不存在";
            }
        }
        return "存在,索引为"+index;
    }

}
