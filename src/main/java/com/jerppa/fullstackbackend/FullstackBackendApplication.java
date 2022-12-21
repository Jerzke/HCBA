package com.jerppa.fullstackbackend;
import com.jerppa.fullstackbackend.data.CSVReader;
import com.jerppa.fullstackbackend.data.data;
import com.jerppa.fullstackbackend.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.time.LocalDateTime;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.io.File;



@SpringBootApplication
@RestController
public class FullstackBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(FullstackBackendApplication.class, args);
	}
	@GetMapping("/dataSet1")
	public List<data> dataSet1(){
		return CSVReader.readDataFromFile("C:\\Users\\Jerzke\\Desktop\\Coding\\SolitaProject\\Backend\\fullstack-backend\\src\\main\\java\\com\\jerppa\\fullstackbackend\\data\\2021-05.csv");
	}
	@GetMapping("/dataSet2")
	public List<data> dataSet2(){
		return CSVReader.readDataFromFile("C:\\Users\\Jerzke\\Desktop\\Coding\\SolitaProject\\Backend\\fullstack-backend\\src\\main\\java\\com\\jerppa\\fullstackbackend\\data\\2021-06.csv");
	}
	@GetMapping("/dataSet3")
	public List<data> dataSet3(){
		return CSVReader.readDataFromFile("C:\\Users\\Jerzke\\Desktop\\Coding\\SolitaProject\\Backend\\fullstack-backend\\src\\main\\java\\com\\jerppa\\fullstackbackend\\data\\2021-07.csv");
	}

}
