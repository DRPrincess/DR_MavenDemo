# 项目说明

[《Android-Library Module 上传 JCenter 仓库》](http://blog.csdn.net/qq_32452623/article/details/79282605) 的测试用例

 其中上传 Bintary 远程库使用了 [bintray-release](https://github.com/novoda/bintray-release) 插件。

[《Android-Nexus 搭建自己的 Maven 仓库 & Gradle 上传依赖包》](http://blog.csdn.net/qq_32452623/article/details/79385595) 的测试用例

 其中上传 Nexus 私库使用的 gradle 集成的 maven 插件。使用文档详见 [The Maven Plugin](https://docs.gradle.org/current/userguide/maven_plugin.html)。

# Module 说明

共有三个 Module:
- jcenterlibrary
用来上传的 JCenter 的库项目
- nexuslibrary
用来上传的 Nexus 私库的库项目
- app
是用来测试上传到 JCenter 中央仓库的 jcenterlibrary 和 nexuslibrary ；
M