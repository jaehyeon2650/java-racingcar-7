package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public final class View {
    private static final String NAME_INPUT_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";

    public static String getCarNames() {
        System.out.println(NAME_INPUT_MESSAGE);
        String carNames = Console.readLine();
        return carNames;
    }
}