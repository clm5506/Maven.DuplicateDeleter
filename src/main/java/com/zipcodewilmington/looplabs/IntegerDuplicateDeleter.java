package com.zipcodewilmington.looplabs;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {

    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }


    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {

        Stream myStream = Stream.of(super.array).filter( integer -> getCount(integer) < maxNumberOfDuplications);

        Integer[] answer = (Integer[]) myStream.toArray(Integer[]::new);
        return answer;

    }

    public int getCount(Integer integer){
        int counter = 0;
        for(Integer i : super.array){
            if(i == integer){
                counter++;
            }
        }
        return counter;
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        Stream myStream = Stream.of(super.array).filter( integer -> getCount(integer) != exactNumberOfDuplications);

        Integer[] answer = (Integer[]) myStream.toArray(Integer[]::new);
        return answer;
    }




}
