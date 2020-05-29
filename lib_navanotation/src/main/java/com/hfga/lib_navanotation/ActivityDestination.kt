package com.hfga.lib_navanotation

import java.lang.annotation.ElementType
import java.lang.annotation.Target


@Target(ElementType.TYPE)
annotation class ActivityDestination(
     val pageUrl: String,
     val needLogin: Boolean = false,
     val asStarter: Boolean = false
)
