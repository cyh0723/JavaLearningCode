package JavaSE.Learning29;

import java.util.Scanner;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/5/7 20:36
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student student=new Student();
        while (true) {
            try {
                System.out.println("请输入学生的姓名");
                String name=sc.nextLine();
                System.out.println("请输入学生的年龄");
                String ageString = sc.nextLine();
                int age = Integer.parseInt(ageString);
                student.setName(name);
                student.setAge(age);
                break;
            }catch(NumberFormatException e){
                System.out.println("年龄的格式有误");

            }catch (NameFormatException | AgeOutOfBoundsException e){
                e.printStackTrace();
            }
        }

    }

    public static int getMax(int[] arr) throws NullPointerException,ArrayIndexOutOfBoundsException{
        if (arr==null)
            throw new NullPointerException();
        if (arr.length==0)
            throw new ArrayIndexOutOfBoundsException();
        int max=arr[0];
        for (int i : arr) {
            if (max<i)
                max=i;
        }
        return max;
    }
}
