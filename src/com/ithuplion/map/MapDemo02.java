package com.ithuplion.map;

/**
 * 可变参数
 *      在JDK1.5之后，如果我们定义一个方法需要接受多个参数，并且多个参数类型一致，我们可以对其简化成如下格式：
 *      修饰符 返回值类型 方法名(参数类型... 形参名){  }
 *      其实这个书写完全等价与
 *      修饰符 返回值类型 方法名(参数类型[] 形参名){  }
 *      只是后面这种定义，在调用时必须传递数组，而前者可以直接传递数据即可。
 */
public class MapDemo02 {
    public static void main(String args[]){
        int[] arr = {21,89,32};
        int sum = add(arr);
        System.out.println(sum);
        sum = add(21,89,32);//可变参数调用形式
        System.out.println(sum);

    }

    //JDK1.5之后写法
    public static int add(int...arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    //原始写法
	/*
	public static int add(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	*/
}
