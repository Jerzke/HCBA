package com.jerppa.fullstackbackend.data;

import java.time.LocalDateTime;

public class data {
    private String Departure;
    private String Return;
    private Integer DepartureStationId;
    private String DepartureStationName;
    private Integer ReturnStationId;
    private String ReturnStationName;
    private Double Distance;
    private Double Duration;

    public String getDeparture() {
        return Departure;
    }

    public void setDeparture(String departure) {
        Departure = departure;
    }

    public String getReturn() {
        return Return;
    }

    public void setReturn(String aReturn) {
        Return = aReturn;
    }

    public Integer getDepartureStationId() {
        return DepartureStationId;
    }

    public void setDepartureStationId(Integer departureStationId) {
        DepartureStationId = departureStationId;
    }

    public String getDepartureStationName() {
        return DepartureStationName;
    }

    public void setDepartureStationName(String departureStationName) {
        DepartureStationName = departureStationName;
    }

    public Integer getReturnStationId() {
        return ReturnStationId;
    }

    public void setReturnStationId(Integer returnStationId) {
        ReturnStationId = returnStationId;
    }

    public String getReturnStationName() {
        return ReturnStationName;
    }

    public void setReturnStationName(String returnStationName) {
        ReturnStationName = returnStationName;
    }

    public Double getDistance() {
        return Distance;
    }

    public void setDistance(Double distance) {
        Distance = distance;
    }

    public Double getDuration() {
        return Duration;
    }

    public void setDuration(Double duration) {
        Duration = duration;
    }

    public data(String departure, String aReturn, Integer departureStationId, String departureStationName, Integer returnStationId, String returnStationName, Double distance, Double duration) {
        Departure = departure;
        Return = aReturn;
        DepartureStationId = departureStationId;
        DepartureStationName = departureStationName;
        ReturnStationId = returnStationId;
        ReturnStationName = returnStationName;
        Distance = distance;
        Duration = duration;

//testtesttest
    }
}


