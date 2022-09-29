package team.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import team.RentApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { RentApplication.class })
public class CucumberSpingConfiguration {}
