package de.hk;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import de.hk.bigdecimal.MyBigDecimalTest;
import de.hk.collections.MyCollectionSortTest;
import de.hk.enums.MehrdimensionalesEnumTest;
import de.hk.generics.MyGenericTest;
import de.hk.xml.GenericXmlHandlerTest;
import de.hk.xsd.PojoToXsdTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({ GenericXmlHandlerTest.class,
		MyGenericTest.class, MehrdimensionalesEnumTest.class,
		PojoToXsdTest.class, MyBigDecimalTest.class, MyCollectionSortTest.class })
public class AllTests {

}
