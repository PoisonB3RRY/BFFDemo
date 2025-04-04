package org.nickj.BFFDemo.Bean.Filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class Part implements Supplier<Part> {

    public String toString(){
        return this.getClass().getSimpleName();
    }

    static List<Supplier<? extends Part>> prototypes = new ArrayList(
            Arrays.asList(new FuelFilter(),
                    new AirFilter(),
                    new OilFilter(),
                    new CarbinAirFilter(),
                    new FanBelt(),
                    new PowerSteeringBelt(),
                    new GeneratorBelt())
    );

    private static Random random = new Random(47);

    @Override
    public Part get() {
        int n = random.nextInt(prototypes.size());
        return prototypes.get(n).get();
    }
}
