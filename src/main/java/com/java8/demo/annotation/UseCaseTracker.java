package com.java8.demo.annotation;

import com.java8.demo.utils.PasswordUtils;

import java.lang.reflect.Method;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @Author: tyk
 * @Date: 2019/9/30 16:04
 * @Description:
 */
public class UseCaseTracker {
    public static void trackUseCase(List<Integer> useCases, Class<?> cl) {
        for (Method m : cl.getDeclaredMethods()) {
            UserCase uc = m.getAnnotation(UserCase.class);
            if (null != uc) {
                System.out.println("发现用例id:"+uc.id()+",description:"+uc.description());
                useCases.remove(Integer.valueOf(uc.id()));
            }
        }
        useCases.forEach(i -> System.out.println("剩下的用例为" + i));
    }

    public static void main(String[] args){
        List<Integer> useCases = IntStream.range(47, 51).boxed().collect(Collectors.toList());
        trackUseCase(useCases,PasswordUtils.class);
    }

}
