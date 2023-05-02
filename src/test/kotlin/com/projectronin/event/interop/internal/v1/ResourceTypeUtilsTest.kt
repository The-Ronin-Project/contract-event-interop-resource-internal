package com.projectronin.event.interop.internal.v1

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ResourceTypeUtilsTest {
    @Test
    fun `eventName for single name resource`() {
        assertEquals("patient", ResourceType.Patient.eventName())
    }

    @Test
    fun `eventName for two name resource`() {
        assertEquals("medication-request", ResourceType.MedicationRequest.eventName())
    }

    @Test
    fun `eventName for more than two name resource`() {
        assertEquals("biologically-derived-product", ResourceType.BiologicallyDerivedProduct.eventName())
    }
}
