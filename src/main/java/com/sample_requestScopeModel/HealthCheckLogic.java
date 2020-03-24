package com.sample_requestScopeModel;

public class HealthCheckLogic {
    public void execute(Health aHealth) {
        double weight = aHealth.getWeight();
        double height = aHealth.getHeight();
        double bmi = weight / (height / 100.0 * height / 100.0);
        aHealth.setBmi(bmi);

        String bodyType;
        if (bmi < 18.5) {
          bodyType = "Thin";
        } else if (bmi < 25) {
            bodyType = "Normal";
        } else {
            bodyType = "Obesity";
        }
        aHealth.setBodyType(bodyType);
    }
}
