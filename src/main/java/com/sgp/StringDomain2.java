package com.sgp;

import lombok.Data;
import org.silbertb.proto.domainconverter.annotations.ProtoClass;
import org.silbertb.proto.domainconverter.annotations.ProtoField;

@Data
@ProtoClass(protoClass = StringProto2OuterClass.StringProto2.class)
public class StringDomain2 {
    @ProtoField(protoName = "myString1")
    private String yourString;
}
