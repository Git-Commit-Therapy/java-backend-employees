package com.git_commit_therapy.employeeService.service;

import com.git_commit_therapy.employeeService.dao.*;
import com.git_commit_therapy.employeeService.entity.*;
import com.git_commit_therapy.proto.UserOuterClass;
import com.google.protobuf.Empty;
import io.grpc.internal.testing.StreamRecorder;
import io.jsonwebtoken.Claims;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static com.git_commit_therapy.employeeService.util.MockitoUtil.startMock;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.mock;

public class EmployeeServiceTest {

    private EmployeeService employeeService;
    @Mock
    private AppointmentDao appointmentDao;
    @Mock
    private DoctorDao doctorDao;
    @Mock
    private MedicalEventDao medicalEventDao;
    @Mock
    private MedicalExamDao medicalExamDao;
    @Mock
    private MedicalInfoDao medicalInfoDao;
    @Mock
    private StaffDao staffDao;

    // Mocked values
    public static List<Appointment> appointmentList = createAppointmentList();
    public static List<Staff> staffList = createStaffList();
    public static List<Doctor> doctorList = createDoctorList();
    public static List<Patient> patientList = createPatientList();
    public static List<User> userList = createUserList();
    public static List<Ward> wardList = createWardList();

    @BeforeEach
    public void setup() {
        startMock(this);

        // mock for security context
        SecurityContext securityContext = mock(SecurityContext.class);
        Authentication authentication = mock(Authentication.class);
        Claims claims = mock(Claims.class);

        SecurityContextHolder.setContext(securityContext);

        Mockito.when(securityContext.getAuthentication())
                .thenReturn(authentication);
        Mockito.when(authentication.getCredentials())
                .thenReturn(claims);
        Mockito.when(claims.getSubject())
                .thenReturn("test-sid");

        // mock for appointmentDao
        Mockito.when(appointmentDao.findAll(anyString(), any(), any()))
                .thenReturn(appointmentList);
        Mockito.when(appointmentDao.findAppointmentById(anyInt()))
                .thenReturn(Optional.of(appointmentList.get(0)));
        Mockito.when(appointmentDao.upsert(any()))
                .thenReturn(appointmentList.get(0));

        // mock for doctorDao
        Mockito.when(doctorDao.findAll())
                .thenReturn(doctorList);
        Mockito.when(doctorDao.getDoctorById(anyString()))
                .thenReturn(Optional.of(doctorList.get(0)));

        // TODO: proseguire con gli altri mock dei DAO

        employeeService = new EmployeeService(appointmentDao, doctorDao, medicalEventDao, medicalExamDao, medicalInfoDao, staffDao);
    }

    @Test
    void test_getDoctor() throws Exception {
        // prepare the request and the response
        Empty request = Empty.newBuilder().build();
        StreamRecorder<UserOuterClass.Doctor> responseObserver = StreamRecorder.create();
        // invoke the gRPC
        employeeService.getDoctor(request, responseObserver);
        // wait for completion within 5 seconds
        if (!responseObserver.awaitCompletion(5, TimeUnit.SECONDS)) {
            Assertions.fail("The call did not terminate in time");
        }
        // asserts
        assertNull(responseObserver.getError());

        List<UserOuterClass.Doctor> results = responseObserver.getValues();
        assertEquals(1, results.size());

        UserOuterClass.Doctor response = results.get(0);
        assertEquals("id0", response.getUser().getId());
    }

    // TODO: proseguire scrivendo gli altri test (prendendo esempio di test_getDoctor)

    // createAppointmentList
    private static List<Appointment> createAppointmentList(){
        return IntStream.range(0, 10)
                .mapToObj(EmployeeServiceTest::toEntityAppointment)
                .collect(Collectors.toList());
    }

    private static Appointment toEntityAppointment(int i){
        Appointment appointment = new Appointment();
        appointment.setId(i);
        appointment.setDateTime(Date.from(Instant.now()));
        appointment.setStaff(toEntityStaff(i));
        appointment.setDoctor(toEntityDoctor(i));
        appointment.setPatient(toEntityPatient(i));

        return appointment;
    }

    // createStaffList
    private static List<Staff> createStaffList(){
        return IntStream.range(0, 10)
                .mapToObj(EmployeeServiceTest::toEntityStaff)
                .collect(Collectors.toList());
    }

    private static Staff toEntityStaff(int i){
        Staff staff = new Staff();
        staff.setStaffID("staffID" + i);
        staff.setUser(toEntityUser(i));

        return staff;
    }

    // createDoctorList
    private static List<Doctor> createDoctorList(){
        return IntStream.range(0, 10)
                .mapToObj(EmployeeServiceTest::toEntityDoctor)
                .collect(Collectors.toList());
    }

    private static Doctor toEntityDoctor(int i){
        Doctor doctor = new Doctor();
        doctor.setDoctorId("doctorID" + i);
        doctor.setUser(toEntityUser(i));
        doctor.setMedSpecialization("medSpecialization" + i);
        doctor.setOfficePhoneNumber("officePhoneNumber" + i);
        doctor.setWard(toEntityWard(i));

        return doctor;
    }

    // createPatientList
    private static List<Patient> createPatientList(){
        return IntStream.range(0, 10)
                .mapToObj(EmployeeServiceTest::toEntityPatient)
                .collect(Collectors.toList());
    }

    private static Patient toEntityPatient(int i){
        Patient patient = new Patient();
        patient.setPatientId("patientID" + i);
        patient.setUser(toEntityUser(i));
        patient.setMedicalInfos(new ArrayList<>());

        return patient;
    }

    // createUserList
    private static List<User> createUserList(){
        return IntStream.range(0, 10)
                .mapToObj(EmployeeServiceTest::toEntityUser)
                .collect(Collectors.toList());
    }

    private static User toEntityUser(int i){
        User user = new User();
        user.setId("id" + i);
        user.setName("name" + i);
        user.setSurname("surname" + i);
        user.setDateOfBirth(Date.from(Instant.now()));
        user.setSid("sid" + i);
        user.setPhoneNumber("phone" + i);
        user.setEmail("email" + i);

        return user;
    }

    // createWardList
    private static List<Ward> createWardList(){
        return IntStream.range(0, 10)
                .mapToObj(EmployeeServiceTest::toEntityWard)
                .collect(Collectors.toList());
    }

    private static Ward toEntityWard(int i){
        Ward ward = new Ward();
        ward.setWardId(i);
        ward.setName("name" + i);

        return ward;
    }
}
