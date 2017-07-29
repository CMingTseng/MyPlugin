package com.lany.hh


import org.gradle.api.Plugin
import org.gradle.api.Project

class FirstPlugin implements Plugin<Project> {

    void apply(Project project) {
        def showHelloTask = project.tasks.create("showHello") << {
            println('这是我的第一个插件')
        }
        showHelloTask.group = "funny"//插件显示的组名称
        showHelloTask.description = "Hello baby"
    }
}