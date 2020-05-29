package com.hfga.lib_navanotation

annotation class FragmentDestination(
    val pageUrl: String,
    val needLogin:Boolean = false,
    val asStarter:Boolean = false
)