package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public String getCarName() {
        return Console.readLine();
    }

    public Integer getFrequency() {
        return Integer.parseInt(Console.readLine());
    }
}