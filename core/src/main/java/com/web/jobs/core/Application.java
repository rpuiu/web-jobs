package com.web.jobs.core;

import com.web.jobs.persistence.dto.EmployeeDTO;
import com.web.jobs.persistence.dto.JobDTO;
import com.web.jobs.persistence.dto.PersonDTO;
import com.web.jobs.persistence.dto.RatingDTO;
import com.web.jobs.persistence.session.HibernateTransaction;
import org.hibernate.Session;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    public void testApp() {
        Session session = HibernateTransaction.getHibernateTransaction().getSessionFactory().openSession();

        session.beginTransaction();

        PersonDTO person = new PersonDTO( "name", "surname" , "username", "address", "phone","account");
        JobDTO jobDTO =  new JobDTO("jobTitle", "Description", "Category", 12345.3);
        RatingDTO ratingDTO = new RatingDTO(1235.3, "message");

        EmployeeDTO employee = new EmployeeDTO(person , jobDTO, Collections.singletonList(ratingDTO));

        session.save(employee);
        session.getTransaction().commit();

        session.close();
    }

}
