// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: Person.proto
// Protobuf Java Version: 4.27.1

package com.sgp.domain;

public interface AddressBookOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.sgp.domain.AddressBook)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .com.sgp.domain.Person people = 1;</code>
   */
  java.util.List<com.sgp.domain.Person> 
      getPeopleList();
  /**
   * <code>repeated .com.sgp.domain.Person people = 1;</code>
   */
  com.sgp.domain.Person getPeople(int index);
  /**
   * <code>repeated .com.sgp.domain.Person people = 1;</code>
   */
  int getPeopleCount();
  /**
   * <code>repeated .com.sgp.domain.Person people = 1;</code>
   */
  java.util.List<? extends com.sgp.domain.PersonOrBuilder> 
      getPeopleOrBuilderList();
  /**
   * <code>repeated .com.sgp.domain.Person people = 1;</code>
   */
  com.sgp.domain.PersonOrBuilder getPeopleOrBuilder(
      int index);
}
