//package com.example.finalsprintjavaapp;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class MyCommandLineRunner implements CommandLineRunner {
////
////    @Autowired
////    private CloudVenderService cloudVendorService;
////
////    @Override
////    public void run(String... args) {
////        // Logic to answer questions using command line options
////        if (args.length > 0) {
////            switch (args[0]) {
////                case "airportsInCities":
////                    cloudVendorService.printAirportsInCities();
////                    break;
////                case "aircraftPassengers":
////                    cloudVendorService.printAircraftPassengers();
////                    break;
////                case "airportsForAircraft":
////                    cloudVendorService.printAirportsForAircraft();
////                    break;
////                case "passengerAirports":
////                    cloudVendorService.printPassengerAirports();
////                    break;
////                default:
////                    System.out.println("Invalid command. Use one of: airportsInCities, aircraftPassengers, airportsForAircraft, passengerAirports");
////            }
////        } else {
////            System.out.println("Please provide a command. Use one of: airportsInCities, aircraftPassengers, airportsForAircraft, passengerAirports");
////        }
////    }
//}
