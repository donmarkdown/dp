package com.demo.dp.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * ^_^!
 *
 * @author pcheng reviewcode@163.com
 * @date 20:39 2019/12/4
 */
public class FunctionDemo {

    public static void main(String[] args) {
        new FunctionDemo().testFunction();
    }

    private void testFunction() {
        List<String> letterList = Arrays.asList("lambda", "test", "javascript");

        List<String> upperList = convert(letterList, String::toUpperCase);
        List<Integer> lengthList = convert(letterList, String::length);


        System.out.println(upperList);
        System.out.println(lengthList);

    }

    private <T, R> List<R> convert(List<T> list, Function<T, R> function){
        List<R> result = new ArrayList<>();

        for (T t : list) {
            result.add(function.apply(t));
        }
        return result;
    }
}
