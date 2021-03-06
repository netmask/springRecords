package com.github.springRecords.test;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;
import java.util.Date;

/**
 * BasePetRecord – 
 * 
 */
public class BasePetRecord extends BaseRecord {
    
    @Column(name="name", sqlType=java.sql.Types.VARCHAR)
    public String name;
    
    @Column(name="owner", sqlType=java.sql.Types.VARCHAR)
    public String owner;
    
    @Column(name="species", sqlType=java.sql.Types.VARCHAR)
    public String species;
    
    @Column(name="sex", sqlType=java.sql.Types.VARCHAR)
    public String sex;
    
    @Column(name="birth_date", sqlType=java.sql.Types.DATE)
    public Date birthDate;
    
    @Column(name="death", sqlType=java.sql.Types.DATE)
    public Date death;
}
