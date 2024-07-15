package com.sgp;

import lombok.Data;
import org.silbertb.proto.domainconverter.annotations.ProtoClass;
import org.silbertb.proto.domainconverter.annotations.ProtoField;
@Data
@ProtoClass(protoClass = StringProtoOuterClass.StringProto.class)
public class StringDomain {
    @ProtoField(protoName = "myString")
    private String yourString;
}
