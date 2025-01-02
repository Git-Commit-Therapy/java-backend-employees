package com.git_commit_therapy.employeeService.dao;

import com.git_commit_therapy.employeeService.entity.Appointment;
import com.git_commit_therapy.employeeService.repository.AppointmentRepository;
import lombok.val;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.Date;
import java.util.Optional;

import static com.git_commit_therapy.employeeService.service.EmployeeServiceTest.appointmentList;
import static com.git_commit_therapy.employeeService.util.MockitoUtil.startMock;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.*;

public class AppointmentDaoTest {

    private AppointmentDao appointmentDao;
    @Mock
    private AppointmentRepository appointmentRepository;

    @BeforeEach
    public void setup() {
        startMock(this);

        Mockito.when(appointmentRepository.findById(anyInt()))
                .thenReturn(Optional.of(appointmentList.get(0)));
        Mockito.when(appointmentRepository.findAllByPatientAndDateRange(anyString(), any(), any()))
                .thenReturn(appointmentList);
        Mockito.when(appointmentRepository.save(any()))
                .thenReturn(appointmentList.get(0));

        appointmentDao = new AppointmentDao(appointmentRepository);
    }

    @Test
    @Order(1)
    void test_findAppointmentById(){
        val expected = Optional.of(appointmentList.get(0));
        val result = appointmentDao.findAppointmentById(0);
        assertEquals(expected, result);
    }

    @Test
    @Order(2)
    void test_findAll(){
        val expected = appointmentList;
        val result = appointmentDao.findAll("patientId", new Date(), new Date());
        assertEquals(expected, result);
    }

    @Test
    @Order(3)
    void test_upsert(){
        val expected = appointmentList.get(0);
        val result = appointmentDao.upsert(new Appointment());
        assertEquals(expected, result);
    }
}
