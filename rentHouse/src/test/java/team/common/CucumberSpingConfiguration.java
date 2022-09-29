package team.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import team.RentHouseApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { RentHouseApplication.class })
public class CucumberSpingConfiguration {}
