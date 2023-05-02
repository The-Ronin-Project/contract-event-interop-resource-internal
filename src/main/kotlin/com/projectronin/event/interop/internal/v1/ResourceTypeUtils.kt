package com.projectronin.event.interop.internal.v1

import com.google.common.base.CaseFormat

/**
 * Returns the lower kebab-case form of this ResourceType. For example, `patient` or `medication-request`.
 */
fun ResourceType.eventName() = CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_HYPHEN, name)
