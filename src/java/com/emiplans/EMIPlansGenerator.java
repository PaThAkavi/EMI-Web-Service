package com.emiplans;
import java.lang.Math;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(serviceName = "EMIPlansGenerator")
public class EMIPlansGenerator {
    @WebMethod(operationName = "generatePlans")
    public float generatePlans(@WebParam(name = "months") float months) {
        float price = priceGenerator();
        price /= months;
        return price;
    }

    @WebMethod(operationName = "priceGenerator")
    public float priceGenerator() {
//        float price = (float)Math.random()*10000;
        float price = 15599;
        return price;
    }
}
