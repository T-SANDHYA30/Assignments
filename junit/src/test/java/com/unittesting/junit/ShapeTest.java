package com.unittesting.junit;



import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ShapeTest {

		
		@ParameterizedTest
		@ValueSource(classes= {Shape.class,Circle.class,Triangle.class})
		public void typeTest(Class<?> cls) throws Exception{
			Shape shape=(Shape) cls.getDeclaredConstructor().newInstance();
			assertTrue(shape.getClass()==cls);
		}
		
		@ParameterizedTest
		@MethodSource("shapeProvider")
		public void ShapeTest(Shape shape) {
			Shape res=shape.type();
			assertTrue(res instanceOf Shape||res instanceof Circle|| res instanceof Triangle)
		}
	}

