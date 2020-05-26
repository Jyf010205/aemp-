package decorator.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;

/**
 * @author: jianyufeng
 * @description: io用了装饰者模式
 * @date: 2020/5/21 21:25
 */
public class test {
    public static void main(String[] args) throws FileNotFoundException {
        FilterInputStream filterInputStream = new BufferedInputStream(new FileInputStream("text.txt"));
    }
}
