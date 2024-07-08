package LeetCode.Learning.List;

import java.util.Arrays;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/6/25 21:07
 * 实现一个简易的列表
 */
public class MyList {
    private int[] arr; //列表数组
    private int capacity=10;//数组容量
    private int size;//列表长度
    private int extendRatio=2;//每次扩容的倍数

    private MyList(){
        this.arr=new int[capacity];
    }

    public int size(){
        return this.size;
    }

    public int capacity(){
        return this.capacity;
    }

    public int get(int index){
        if (index<0||index>=this.size)
            throw new IndexOutOfBoundsException("索引越界");
        return this.arr[index];
    }

    public void set(int index,int num){
        if (index<0||index>=this.size)
            throw new IndexOutOfBoundsException("索引越界");
        this.arr[index]=num;
    }

    public void add(int num){
        if (this.size==this.capacity)
            extendCapacity();
        this.arr[size]=num;
        size++;
    }

    public void insert(int index,int num){
        if (index<0||index>=this.size)
            throw new IndexOutOfBoundsException("索引越界");
        if (this.size==this.capacity)
            extendCapacity();
        for (int i = this.size; i >= index; i--) {
            this.arr[i+1]=this.arr[i];
        }
        arr[index]=num;
        size++;
    }

    public int remove(int index){
        if (index<0||index>=this.size)
            throw new IndexOutOfBoundsException("索引越界");
        int num=arr[index];
        for (int i = index; i < this.size-1; i++) {
            arr[i]=arr[i+1];
        }
        size--;
        return num;
    }

    public void extendCapacity(){
        this.arr= Arrays.copyOf(this.arr,this.capacity()*this.extendRatio);
        this.capacity=this.arr.length;
    }

    public int[] toArray(){
        int size=this.size();
        int[] arr=new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=this.get(i);
        }
        return arr;
    }

}
