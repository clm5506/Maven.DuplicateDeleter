package com.zipcodewilmington.looplabs;

import java.util.stream.Stream;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {


        Stream myStream = Stream.of(super.array).filter(string -> getCount(string) < maxNumberOfDuplications);

        String[] answer = (String[])myStream.toArray(String[]::new);
        return answer;
    }

    public int getCount(String s){
        int counter = 0;
        for(String str : super.array){
            if(str.equals(s)){
                counter++;
            }
        }
        return counter;
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        Stream myStream = Stream.of(super.array).filter( string -> getCount(string) != exactNumberOfDuplications);

        String[] answer = (String[]) myStream.toArray(String[]::new);
        return answer;
    }
}
