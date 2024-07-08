package JavaSE.Learning04;

import java.util.Random;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/3/3 17:49
 */
public class Main {
    public static void main(String[] args) {
        /*
        * 随机产生一个5位数的验证码*/
        //将大写字母和小写字母都放在一个数组中
        char[] chs=new char[52];
        chs[0]='a';
        for (int i = 1; i < chs.length; i++) {
            if (i<=25){
                chs[i]=(char)(97+i);
            }else {
                chs[i]=(char)(65+i-26);
            }

        }
        String result="";
        for (int i = 0; i < 4; i++) {
            Random r=new Random();
            int randomIndex=r.nextInt(chs.length);
            result+=chs[randomIndex];
        }

        Random r=new Random();
        int randomNum=r.nextInt(10);
        result=result+randomNum;
        System.out.println(result);


    }



    //上面的数组创建后 长度不允许更改
}
