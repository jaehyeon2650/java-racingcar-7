package racingcar.service;

import java.util.List;
import racingcar.model.Car;
import racingcar.model.Cars;
import racingcar.utils.Random;

public class RaceServiceImpl implements RaceService {
    private Cars cars;

    @Override
    public void makeCars(List<String> names) {
        cars = Cars.of(names);
    }

    @Override
    public List<Car> startRace() {
        List<Integer> randomNumbers = Random.createRandomNumbers(cars.getCars().size());
        cars.startRace(randomNumbers);
        return cars.getCars();
    }

    @Override
    public List<Car> getWinner() {
        return cars.getWinners();
    }

}
