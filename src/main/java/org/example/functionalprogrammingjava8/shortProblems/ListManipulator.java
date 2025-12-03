package org.example.functionalprogrammingjava8.shortProblems;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
public interface ListManipulator <T>{

    void manipulate(List<T> values, T t);
    default List<T>  create (){
        return  new ArrayList<>();
    }
}
