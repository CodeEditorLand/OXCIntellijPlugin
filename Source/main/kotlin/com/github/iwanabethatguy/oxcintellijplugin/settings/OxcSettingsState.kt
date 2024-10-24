package com.github.oxc.project.oxcintellijplugin.settings

import com.intellij.openapi.components.BaseState
import com.intellij.util.xml.Attribute

class OxcSettingsState : BaseState() {

    @get:Attribute("binaryPath")
    var binaryPath by string()

    @get:Attribute("enable")
    var enable by property(true)
}
