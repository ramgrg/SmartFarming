/*
 * generated by Xtext 2.25.0
 */
package com.se4gd.smartfarming.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import smartFarmingXText.Farm

@ExtendWith(InjectionExtension)
@InjectWith(SmartFarmingInjectorProvider)
class SmartFarmingParsingTest {
	@Inject
	ParseHelper<Farm> parseHelper
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
}
