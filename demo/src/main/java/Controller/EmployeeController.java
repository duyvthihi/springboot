import Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/create")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }

    @GetMapping("/all")
    public List<Employee> findAllEmployees() {
        return employeeService.findAllEmployees();
    }
}
