import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name="TBL_EMPLOYEES")
public class EmployeeEntity {
 
    @Id
    @GeneratedValue
    private Long id;
     
    @Column(name="first_name")
    private String firstName;
     
    @Column(name="last_name")
    private String lastName;
     
    @Column(name="Employment Id")
    private String Emp ID;	
    
    @Column(name="deisgnation")
    private String Dedignation;
	
     @Column(name="Department")
    private String Department;
    
     @Column(name="Start Date")
    private String Start Date;
	
	 @Column(name="End Date")
    private String End date;
	
	@Column(name="Blood Group")
    private String Blood Group;
	
	@Column(name="Address")
    private String Address;
	
	@Column(name="Status")
    private String Status;
	
    @Column(name="email", nullable=false, length=200)
    private String email;
    
    @Column(name="Gender")
    private String Gender;	
	
     @Column(name="Date Of Birth")
    private String DOB;	
    //Setters and getters
 
    @Override
    public String toString() {
        return "EmployeeEntity [id=" + id + ", firstName=" + firstName + 
                ", lastName=" + lastName + ", email=" + email   + " Emplyment Id=" + Emplyment Id + ", Designation=" + Designation + ",  Department=" + Department + ", Start date=" + start date + ",end date=" + end date + ", blood date=" + blood group + ",address=" + address + ", status=" + status + ", gender=" + gender + ", date of birth=" + DOB + "]";
    }
}
