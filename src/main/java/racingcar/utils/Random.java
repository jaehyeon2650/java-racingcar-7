package racingcar.utils;

import static racingcar.constant.NumberType.MAX_RANDOM_NUMBER;
import static racingcar.constant.NumberType.MIN_RANDOM_NUMBER;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public final class Random {
    public static List<Integer> createRandomNumbers(int count) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            numbers.add(Randoms.pickNumberInRange(MIN_RANDOM_NUMBER.getNumber(), MAX_RANDOM_NUMBER.getNumber()));
        }
        return numbers;
    }
}
