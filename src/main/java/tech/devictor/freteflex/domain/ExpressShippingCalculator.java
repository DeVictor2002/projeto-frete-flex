package tech.devictor.freteflex.domain;

import org.springframework.stereotype.Component;

@Component(value = "expressShippingCalculator")
public class ExpressShippingCalculator implements ShippingCalculator{

    @Override
    public Double calculate(Double distance, Double weight) {
        return 0.0;
    }
}
