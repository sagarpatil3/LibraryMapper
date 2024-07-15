package com.sgp;
import com.sgp.domain.AddressBook;
import com.sgp.domain.AddressBookDomain;
import com.sgp.domain.Person;
import com.sgp.domain.PersonDomain;
import org.silbertb.proto.domainconverter.generated.ProtoDomainConverter;

import java.util.ArrayList;
import java.util.List;

public class Combinator {

    public static void main(String[] args) {
         StringDomain stringDomain = new StringDomain();
         stringDomain.setYourString("sagar1");
         StringProtoOuterClass.StringProto myProto = ProtoDomainConverter.toProto(stringDomain);
         System.out.println(myProto.getMyString());

        List<PersonDomain> people = new ArrayList<>();
        PersonDomain person = new PersonDomain();
        person.setEmail("a@b.com");
        List<Person.PhoneNumber> phones = new ArrayList<>();
        phones.add(Person.PhoneNumber.newBuilder().setNumber("1231231230").setType(Person.PhoneType.PHONE_TYPE_MOBILE).build());
        person.setPhones(phones);
        people.add(person);
        AddressBookDomain addressBookDomain = new AddressBookDomain();
        addressBookDomain.setPeople(people);
        AddressBook addressBook = ProtoDomainConverter.toProto(addressBookDomain);
        System.out.println(addressBook.getPeople(0).getEmail());
        addressBook = addressBook.toBuilder().addPeople( Person.newBuilder().setEmail("b@d.com").build()).build();
        AddressBookDomain addressBookDomain1 = ProtoDomainConverter.toDomain(addressBook);
        System.out.println(addressBookDomain1.getPeople().get(0).getPhones().get(0));
    }
}
