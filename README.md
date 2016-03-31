# spring_with_maven_tutorial

安装spring和maven前首先要配置好JAVA环境。

linux可以选择两种JAVA环境**openJDK**和**OracleJDK**

但是，我还是使用OracleJDK来搭建整个测试流程。~~google加油，干掉OracleJDK。~~

+ [JAVA环境的安装](#java)

    + [下载](#java-download)

    + [安装配置](#java-config)

+ [MAVEN环境的安装](#maven)

    + [下载](#maven-download)

    + [安装配置](#maven-config)


<h2 id="java">JAVA环境的安装</h2>

<h3 id="java-download">下载</h3>

```
www.oracle.com/technetwork/java/javase/downloads/index.html
```

[去下载页面](www.oracle.com/technetwork/java/javase/downloads/index.html)

选择适当版本的JAVA版本进行安装。

spring4已经支持JAVA 8，我选择最新版本的进行安装。

<h3 id="java-config">安装</h3>

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

<h2 id="maven">MAVEN环境配置</h2>

通过Ubuntu的apt-get可以安装maven，但是版本不高，如果只需要低版本的maven可以通过这种方式来安装。

通过下载，配置的方式，可以安装高版本的maven，我现在就是通过这一方式进行安装。

<h3 id="maven-download">下载</h3>

maven下载页面

```
http://maven.apache.org/download.cgi
```

[maven下载页面](http://maven.apache.org/download.cgi)

<h3 id="maven-config">安装配置</h3>

和JAVA安装配置类似，在/usr/local/share下建立链接maven指向解压后的目录。

添加环境变量

```
export MAVEN_HOME="/usr/local/share/maven"
export PATH="${JAVA_HOME}/bin:${MAVEN_HOME}/bin:${PATH}"
```

重启或是重新加载`~/.bashrc`让环境变量生效。

在`termial`下执行`mvn -version`

显示版本信息,即表示maven已经安装成功

```
Apache Maven 3.3.9 (bb52d8502b132ec0a5a3f4c09453c07478323dc5; 2015-11-11T00:41:47+08:00)
```

