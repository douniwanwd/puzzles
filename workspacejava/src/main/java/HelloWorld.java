
import org.apache.commons.lang3.StringUtils;

import java.util.LinkedList;
import java.util.Queue;

public class HelloWorld {
    static int i;

    private void test (Integer index) {
        if (index == null) {

        }
        if (null == index) {

        }
        if ("".equals(index)){

        }
    }

    private void countString (String input) {
        String regex = "red";
        int count = StringUtils.countMatches(input, regex);
        if (count >= 2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println("test");
    }
    public static void main(String[] args) throws Exception {
        String input = "redered";
//        String input = "123456789";
        String regex = "red";
        int count = 0;
        int index = 0;
//        int count = StringUtils.countMatches(input, regex);
        for (int i = 0; i < input.length();) {
            index = input.indexOf(regex);
            if (index >= 0) {
                count++;
            }
            if (i + regex.length() < input.length()) {
                i = i + regex.length();
            }
            input = input.substring(i);
        }
        if (count >= 2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

//        System.out.println(5*5 + 6/2 + " Coding "+4+" is fun "+2+2);
        

//        String str = "中国123";
//        String str1 = "123";
//        System.out.println(str.getBytes("utf-8").length);
//        System.out.println(str.getBytes("gb2312").length);
//
//        System.out.println(str1.getBytes("utf-8").length);
//        System.out.println(str1.getBytes("gb2312").length);
//        long f1 = 100l;
//        long f2 = 100l;
//
//        Long f3 = 1500l;
//        Long f4 = 1500l;
//
//        Long f5 = 127l;
//        Long f6 = 127l;

//        System.out.println(f1 == f2); // true
//        System.out.println(f3 == f4); // false
//        System.out.println(f3.equals(f4)); // true

//        System.out.println(f5 == f6); // false
//        System.out.println(f5.equals(f6)); // true

//        int i = 1;
//        System.out.println(i);
//        for (int i = 0; i < 2; i++) {
//            System.out.println(i);
//        }
//        for (int i = 0; i < 6; i++) {
//            System.out.println(i);
//        }
//
//        Queue list = new LinkedList();
//        list.offer(1);
//        list.offer(2);
//        list.offer(3);
//        list.offer(4);
//
//        int n = list.size();
//
//        for (int i = 0; i < n; i++) {
//            list.poll();
//            System.out.println(i);
//        }
//        int lastX = 10;
//        int newX = 15;
//        int original = newX;
//        Long lastCall = System.currentTimeMillis();
//        Long interval = System.currentTimeMillis() - lastCall;
//        float speed = (float)(newX - lastX) / 2000;
//        while (interval < 2000L) {
//            System.out.print(System.nanoTime() + "\t" + lastX + "\t" + newX + "\t" + interval );
//            lastX = newX;
//            try {
//                Thread.sleep(50L);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            interval = System.currentTimeMillis() - lastCall;
//            newX = original + (int) (interval * speed);
//            System.out.println("newx is " + newX + " speed is " + speed);
//        }
    }
}
