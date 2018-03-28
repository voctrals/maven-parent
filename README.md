# maven-parent
parent maven project with child maven project

# 内置属性
两个常用内置属性 ${basedir} 表示项目跟目录，即包含pom.xml文件的目录；${version} 表示项目版本

# POM属性
用户可以使用该类属性引用POM文件中对应元素的值。如${project.artifactId}就对应了<project> <artifactId>元素的值，常用的POM属性包括：

${project.build.sourceDirectory}:项目的主源码目录，默认为src/main/java/

${project.build.testSourceDirectory}:项目的测试源码目录，默认为src/test/java/

${project.build.directory} ： 项目构建输出目录，默认为target/

${project.outputDirectory} : 项目主代码编译输出目录，默认为target/classes/

${project.testOutputDirectory}：项目测试主代码输出目录，默认为target/testclasses/

${project.groupId}：项目的groupId

${project.artifactId}：项目的artifactId

${project.version}：项目的version,与${version} 等价

${project.build.finalName}：项目打包输出文件的名称，默认为${project.artifactId}-${project.version}
