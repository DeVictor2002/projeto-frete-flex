package tech.devictor.freteflex.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import tech.devictor.freteflex.domain.ShippingCalculator;

@Service
public class ShippingService {

    private final ShippingCalculator standardShippingCalculator;
    private final ShippingCalculator expressShippingCalculator;

    public ShippingService(@Qualifier("standardShippingCalculator") ShippingCalculator standardShippingCalculator,
                           @Qualifier("expressShippingCalculator") ShippingCalculator expressShippingCalculator) {
        this.standardShippingCalculator = standardShippingCalculator;
        this.expressShippingCalculator = expressShippingCalculator;
    }

    public Double calculate(String shippingType,
                            Double distance,
                            Double weight) {
        if (shippingType.equalsIgnoreCase("standard")) {
            return standardShippingCalculator.calculate(distance, weight);
        } else if (shippingType.equalsIgnoreCase("express")) {
            return expressShippingCalculator.calculate(distance, weight);
        }
        return 0.0;
    }
}
