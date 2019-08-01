package com.cbr.algorithm.codility.lesson5;

public class GenomicRangeQuery {

    public static int[] solution(String S, int[] P, int[] Q) {
        int[] result = new int[P.length];

        for (int i = 0; i < P.length; i++) {
            int minValue = Integer.MAX_VALUE;
            for (int j = P[i]; j <= Q[i]; j++) {
                int sValue = 0;
                switch (S.charAt(j)) {
                    case 'A':
                        sValue = 1;
                        break;
                    case 'C':
                        sValue = 2;
                        break;
                    case 'G':
                        sValue = 3;
                        break;
                    case 'T':
                        sValue = 4;
                        break;
                }
                if (minValue > sValue) {
                    minValue = sValue;
                }
            }
            result[i] = minValue;
        }

        return result;
    }
}