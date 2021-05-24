import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.howtodoinjava.demo.entity.EmployeeEntity;
import com.howtodoinjava.demo.exception.RecordNotFoundException;
import com.howtodoinjava.demo.repository.EmployeeRepository;
 
@Service
public class EmployeeService {
     
    @Autowired
    EmployeeRepository repository;
     
    public List<EmployeeEntity> getAllEmployees()
    {
        List<EmployeeEntity> employeeList = repository.findAll();
         
        if(employeeList.size() > 0) {
            return employeeList;
        } else {
            return new ArrayList<EmployeeEntity>();
        }
    }
     
    public EmployeeEntity getEmployeeById(Long id) throws RecordNotFoundException 
    {
        Optional<EmployeeEntity> employee = repository.findById(id);
         
        if(employee.isPresent()) {
            return employee.get();
        } else {
            throw new RecordNotFoundException("No employee record exist for given id");
        }
    }
     
    public EmployeeEntity createOrUpdateEmployee(EmployeeEntity entity) throws RecordNotFoundException 
    {
        Optional<EmployeeEntity> employee = repository.findById(entity.getId());
         
        if(employee.isPresent()) 
        {
            EmployeeEntity newEntity = employee.get();
            newEntity.setEmail(entity.getEmail());
            newEntity.setFirstName(entity.getFirstName());
            newEntity.setLastName(entity.getLastName());
          newEntity.setEmployent Id(entity.Employment Id());
          newEntity.setDesignation(entity.getDesignation());
          newEntity.setDepartment(entity.getDepartment());
          newEntity.setStart Date(entity.getStart Date());
          newEntity.setEnd Date(entity.getEnd Date());
          newEntity.setblood Group(entity.getBlood Group());
          newEntity.setAddress(entity.getAddress());
          newEntity.setGender(entity.getGender());
           newEntity.setDate Of Birth(entity.getDOB());
            newEntity = repository.save(newEntity);
             
            return newEntity;
        } else {
            entity = repository.save(entity);
             
            return entity;
        }
    } 
     
    public void deleteEmployeeById(Long id) throws RecordNotFoundException 
    {
        Optional<EmployeeEntity> employee = repository.findById(id);
         
        if(employee.isPresent()) 
        {
            repository.deleteById(id);
        } else {
            throw new RecordNotFoundException("No employee record exist for given id");
        }
    } 
}
