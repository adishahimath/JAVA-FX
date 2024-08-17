package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.PrimitiveIterator;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Customer {
    private String Id;
    private String Name;
    private String Address;
    private Double Salary;
}
