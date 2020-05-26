### debug记录
 - gradle版本不能过高目前配置为：classpath 'com.android.tools.build:gradle:3.1.3'
   否则出现jacocoTestReport无输出-app/build/intermediates/classes无内容
 - java版本需要配置成1.8
 - testCoverageEnabled true

### 生成report步骤
- 点击右侧gradle->Task->install->installDebug
- 点击主界面button生成覆盖率ec文件
- adb pull /storage/emulated/0/coverage.ec ./coverage.ec 将ec文件pull到指定目录下executionData = files("$buildDir/outputs/coverage.ec")
- 点击右侧gradle->Task->reporting->jacocoTestReport生成报表，生成目录在app/build/reports/jacoco/jacocoTestReport

