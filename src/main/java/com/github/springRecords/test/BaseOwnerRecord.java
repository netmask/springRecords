package com.github.springRecords.test;

import com.github.springRecords.Autoincrement;
import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;

/**
 * BaseOwnerRecord – 
 * 
 */
public class BaseOwnerRecord extends BaseRecord {
    @Autoincrement
    @Column(name="owner_id", sqlType=java.sql.Types.INTEGER)
    public int ownerId;
    
    @Column(name="name", sqlType=java.sql.Types.VARCHAR)
    public String name;
}
