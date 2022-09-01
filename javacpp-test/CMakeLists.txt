cmake_minimum_required(VERSION 3.23)
project(test)

set(CMAKE_CXX_STANDARD 11)

include_directories(include/)
# java JAVA_HOME\\include
include_directories(D:\\java\\jdk-17.0.3.1\\include)

link_directories(lib/)


## 把test打包dll
add_library(test SHARED cpp/test.cpp)

#添加test库
link_libraries(test)

#测试test.dll
add_executable(testADD cpp/testAdd.cpp)
target_link_directories(testADD PUBLIC test)

#编译jniTest.dll
add_library(jniTest SHARED cpp/jnijavacpp.cpp cpp/jniTest.cpp)

