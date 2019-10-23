package com.spartagloabal.carinterfaceexample;

import com.spartagloabal.carinterfaceexample.forecourt.ForecourtManager;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ForecourtManager forecourtManager = new ForecourtManager();

        forecourtManager.addCarToForecourt("Tesla","S3", 10000,2017);
        forecourtManager.addCarToForecourt("Mercedes","A Class", 45000, 2018);

        forecourtManager.printCarOnForecourt();
    }
}
