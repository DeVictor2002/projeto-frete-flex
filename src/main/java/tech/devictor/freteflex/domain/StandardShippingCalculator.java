package tech.devictor.freteflex.domain;

public class StandardShippingCalculator implements ShippingCalculator{

    @Override
    public Double calculate(Double distance, Double weight) {
        return 0.0;
    }
}
