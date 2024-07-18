package com.example.api;


import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.example.api.controller.EmployeeController;
import com.example.api.service.EmployeeService;
// @WebMvcTest(controllers = EmployeeController.class) déclenche le mécanisme permettant de tester les controllers. On indique également le ou les controllers concernés.
@WebMvcTest(controllers = EmployeeController.class)
public class EmployeeControllerTest {
    
    @Autowired
    private MockMvc mockMvc;
    // L’attribut mockMvc est un autre élément important. Il permet d’appeler la méthode “perform” qui déclenche la requête.

    @MockBean
    private EmployeeService employeeService;

    @Test
    public void testGetEmployees() throws Exception{
        mockMvc.perform(get("/employees"))
        .andExpect(status().isOk());
    }
}
