package com.ylesb.design;
/**
 * @title: Liskov
 * @projectName CodeDesignTutorials
 * @description: TODO
 * @author White
 * @site : [www.ylesb.com]
 * @date 2022/7/3117:03
 */

/**
 * @className    : Liskov
 * @description  : [描述说明该类的功能]  
 * @author       : [XuGuangchao]
 * @site         : [www.ylesb.com]
 * @version      : [v1.0]
 * @createTime   : [2022/7/31 17:03]
 * @updateUser   : [XuGuangchao]
 * @updateTime   : [2022/7/31 17:03]
 * @updateRemark : [描述说明本次修改内容] 
 */

/**
 *
 */
//创建一个更加基础的基类
class Base {
    //把更加基础的方法和成员写到Base类
}

// A类
class AA extends Base {
    // 返回两个数的差
    public int func1(int num1, int num2) {
        return num1 - num2;
    }
}

// B类继承了A
// 增加了一个新功能：完成两个数相加,然后和9求和
class BB extends Base {
    //如果B需要使用A类的方法,使用组合关系
    private AA aa = new AA();

    //这里，重写了A类的方法, 可能是无意识
    public int func1(int a, int b) {
        return a + b;
    }

    public int func2(int a, int b) {
        return func1(a, b) + 9;
    }

    //我们仍然想使用A的方法
    public int func3(int a, int b) {
        return this.aa.func1(a, b);
    }
}

public class Liskov {
    public static void main(String[] args) {
        AA aa = new AA();
        System.out.println("11-3=" + aa.func1(11, 3));
        System.out.println("1-8=" + aa.func1(1, 8));
        System.out.println("-----------------------");

        BB bb = new BB();
        //因为B类不再继承A类，因此调用者不会再认为func1方法是求减法
        //调用完成的功能就会很明确
        System.out.println("11+3=" + bb.func1(11, 3));//这里本意是求出11+3
        System.out.println("1+8=" + bb.func1(1, 8));//这里本意是求出1+8
        System.out.println("11+3+9=" + bb.func2(11, 3));
        //使用组合仍然可以使用到A类相关方法
        System.out.println("11-3=" + bb.func3(11, 3));// 这里本意是求出11-3
    }

}