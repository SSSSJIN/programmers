package kr.ac.kopo.programmers;

import java.util.Arrays;

class Median {
    public int solution(int[] array) {
        Arrays.sort(array);  
        int midIndex = array.length / 2; 
        return array[midIndex];
    }
}