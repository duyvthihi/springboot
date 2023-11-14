package Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "employees")
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private BigDecimal age;

    public Employee() {
    }

    public Employee(String name, BigDecimal age) {
        this.name = name;
        this.age = age;
    }
}
