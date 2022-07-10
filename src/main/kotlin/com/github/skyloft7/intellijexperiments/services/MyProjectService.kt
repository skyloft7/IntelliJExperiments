package com.github.skyloft7.intellijexperiments.services

import com.intellij.openapi.project.Project
import com.github.skyloft7.intellijexperiments.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
