package com.sgp.domain;

import lombok.Data;
import org.silbertb.proto.domainconverter.annotations.ProtoClass;
import org.silbertb.proto.domainconverter.annotations.ProtoField;

import java.util.List;

@Data
@ProtoClass(protoClass = AddressBook.class)
public class AddressBookDomain {
    @ProtoField
    List<PersonDomain> people;
}
