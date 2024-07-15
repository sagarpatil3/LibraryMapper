package com.sgp.domain;

import lombok.Data;
import org.silbertb.proto.domainconverter.annotations.ProtoClass;
import org.silbertb.proto.domainconverter.annotations.ProtoField;

import java.util.List;

@Data
@ProtoClass(protoClass = Person.class)
public class PersonDomain {
    @ProtoField
    private String name;

    @ProtoField
    private String email;

    @ProtoField
    private int id;

    @ProtoField
    private List<Person.PhoneNumber> phones;

}
