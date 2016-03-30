# spring_with_maven_tutorial

安装spring和maven前首先要配置好JAVA环境。

linux可以选择两种JAVA环境**openJDK**和**OracleJDK**

但是，我还是使用OracleJDK来搭建整个测试流程。~~google加油，干掉OracleJDK。~~

## JAVA环境的安装

### 下载

```
www.oracle.com/technetwork/java/javase/downloads/index.html
```

选择适当版本的JAVA版本进行安装。

spring4已经支持JAVA 8，我选择最新版本的进行安装。

### 安装

以linux操作系统为例：

下载好的文件名为:

```
jdk-xxx-linux-x64.tar.gz
```

`xxx`为版本号。

解压，得到名为jdkxxx的文件夹。

我通常会把软件安装在/usr/local/share目录下，在该目录中与解压后的文件建立名为JAVA的链接。(可以直接在/usr/local/share中解压，建立链接只是个人习惯)。

### 设置环境变量

修改`~/.bashrc`文件，加入以下代码

```
export JAVA_HOME="/usr/local/share/java
export PATH="${JAVA_HOME}/bin:${PATH}
```

JAVA环境变量设置完成

`source ~/.bashrc`环境变量立即生效，重启计算机也可以。

打开`terminal`执行`java -version`看到输出JAVA的版本号就说明成功了。

例如：

```
java version "1.8.0_66"
Java(TM) SE Runtime Environment (build 1.8.0_66-b17)
Java HotSpot(TM) 64-Bit Server VM (build 25.66-b17, mixed mode)
```