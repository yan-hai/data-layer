package com.nobodyhub.datalayer.core;

import com.nobodyhub.datalayer.core.cases.ComplexClass;
import com.nobodyhub.datalayer.core.cases.PrimitiveClass;
import com.nobodyhub.datalayer.core.cases.PrimitiveContainerClass;
import com.nobodyhub.datalayer.core.cases.SimpleEnum;
import com.nobodyhub.datalayer.core.cases.within.ComplexEnum;
import com.nobodyhub.datalayer.core.cases.within.DeepContainer;
import com.nobodyhub.datalayer.core.cases.within.InheritedClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Ryan
 */
public class AvroSchemaLoaderDeepContainerTest extends AvroSchemaLoaderTestBase {
    @Test
    public void testLoad() {
        avroSchemaLoader.load(
                DeepContainer.class,
                ComplexClass.class,
                InheritedClass.class,
                SimpleEnum.class,
                PrimitiveClass.class,
                PrimitiveContainerClass.class,
                ComplexEnum.class);
        assertEquals("{\"type\":\"record\",\"name\":\"DeepContainer\",\"namespace\":\"com.nobodyhub.datalayer.core.cases.within\",\"fields\":[{\"name\":\"aSimpleEnumMapList\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":{\"type\":\"enum\",\"name\":\"SimpleEnum\",\"namespace\":\"com.nobodyhub.datalayer.core.cases\",\"symbols\":[\"S1\",\"S2\",\"S3\"]}},\"java-class\":\"java.util.List\"}],\"default\":null},{\"name\":\"aBigDecimalSetListMap\",\"type\":[\"null\",{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":19,\"scale\":2},\"java-class\":\"java.util.Set\"},\"java-class\":\"java.util.List\"}}],\"default\":null},{\"name\":\"aComplexClassListSetMapMapMap\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"map\",\"values\":{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"ComplexClass\",\"namespace\":\"com.nobodyhub.datalayer.core.cases\",\"fields\":[{\"name\":\"primitiveClass\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"PrimitiveClass\",\"fields\":[{\"name\":\"aString\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"aByteBuffer\",\"type\":[\"null\",\"bytes\"],\"default\":null},{\"name\":\"aInt\",\"type\":\"int\"},{\"name\":\"aInteger\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"along\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"aLong\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"afloat\",\"type\":[\"null\",\"float\"],\"default\":null},{\"name\":\"aFloat\",\"type\":[\"null\",\"float\"],\"default\":null},{\"name\":\"adouble\",\"type\":\"double\"},{\"name\":\"aDouble\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"aboolean\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"aBoolean\",\"type\":\"boolean\"},{\"name\":\"aBigDecimal\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":10,\"scale\":2}],\"default\":null},{\"name\":\"aDate\",\"type\":{\"type\":\"record\",\"name\":\"Date\",\"namespace\":\"java.sql\",\"fields\":[]}},{\"name\":\"aTimeStamp\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Timestamp\",\"namespace\":\"java.sql\",\"fields\":[]}],\"default\":null},{\"name\":\"aUuid\",\"type\":{\"type\":\"string\",\"logicalType\":\"uuid\"}}]}],\"default\":null},{\"name\":\"primitiveContainerClass\",\"type\":{\"type\":\"record\",\"name\":\"PrimitiveContainerClass\",\"fields\":[{\"name\":\"aStringList\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"string\",\"java-class\":\"java.util.List\"}],\"default\":null},{\"name\":\"aByteBufferList\",\"type\":{\"type\":\"array\",\"items\":\"bytes\",\"java-class\":\"java.util.List\"}},{\"name\":\"aBooleanList\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"boolean\",\"java-class\":\"java.util.ArrayList\"}],\"default\":null},{\"name\":\"aFloatList\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"float\",\"java-class\":\"java.util.LinkedList\"}],\"default\":null},{\"name\":\"aIntegerMap\",\"type\":[\"null\",{\"type\":\"map\",\"values\":\"int\"}],\"default\":null},{\"name\":\"aLongMap\",\"type\":[\"null\",{\"type\":\"map\",\"values\":\"long\"}],\"default\":null},{\"name\":\"aDoubleMap\",\"type\":[\"null\",{\"type\":\"map\",\"values\":\"double\"}],\"default\":null},{\"name\":\"aBigDecimalMap\",\"type\":[\"null\",{\"type\":\"map\",\"values\":{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":19,\"scale\":2}}],\"default\":null},{\"name\":\"aUuidSet\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"logicalType\":\"uuid\"},\"java-class\":\"java.util.Set\"}],\"default\":null},{\"name\":\"aDateSet\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"java.sql.Date\",\"java-class\":\"java.util.HashSet\"}],\"default\":null},{\"name\":\"aTimestampSet\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"java.sql.Timestamp\",\"java-class\":\"java.util.TreeSet\"}],\"default\":null}]}},{\"name\":\"simpleEnum\",\"type\":[\"null\",\"SimpleEnum\"],\"default\":null},{\"name\":\"complexEnum\",\"type\":{\"type\":\"enum\",\"name\":\"ComplexEnum\",\"namespace\":\"com.nobodyhub.datalayer.core.cases.within\",\"symbols\":[\"C1\",\"C2\",\"C3\"]}}]},\"java-class\":\"java.util.List\"},\"java-class\":\"java.util.Set\"}}}}},{\"name\":\"aInheritedClassMapListMapMapSet\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":{\"type\":\"record\",\"name\":\"InheritedClass\",\"fields\":[{\"name\":\"anotherString\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"simpleEnum\",\"type\":[\"null\",\"com.nobodyhub.datalayer.core.cases.SimpleEnum\"],\"default\":null},{\"name\":\"primitiveClassList\",\"type\":{\"type\":\"array\",\"items\":\"com.nobodyhub.datalayer.core.cases.PrimitiveClass\",\"java-class\":\"java.util.List\"}},{\"name\":\"aString\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"aByteBuffer\",\"type\":[\"null\",\"bytes\"],\"default\":null},{\"name\":\"aInt\",\"type\":\"int\"},{\"name\":\"aInteger\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"along\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"aLong\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"afloat\",\"type\":[\"null\",\"float\"],\"default\":null},{\"name\":\"aFloat\",\"type\":[\"null\",\"float\"],\"default\":null},{\"name\":\"adouble\",\"type\":\"double\"},{\"name\":\"aDouble\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"aboolean\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"aBoolean\",\"type\":\"boolean\"},{\"name\":\"aBigDecimal\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":10,\"scale\":2}],\"default\":null},{\"name\":\"aDate\",\"type\":\"java.sql.Date\"},{\"name\":\"aTimeStamp\",\"type\":[\"null\",\"java.sql.Timestamp\"],\"default\":null},{\"name\":\"aUuid\",\"type\":{\"type\":\"string\",\"logicalType\":\"uuid\"}}]}},\"java-class\":\"java.util.List\"}}},\"java-class\":\"java.util.Set\"}],\"default\":null}]}",
                AvroData.get().getSchema(DeepContainer.class).toString());
    }
}