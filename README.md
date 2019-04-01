javaFX和Jintellitype
---

## javaFX用css, js, fxml等做界面设计

1. 用maven工程创建时需要注意

除了.java文件之外的文件不会自动生到.class文件对应的目录，需要在pom.xml的<build>里添加如下内容

```xml
<resources>
    <resource>
        <filtering>false</filtering>
        <directory>src/main/java</directory>
        <includes>
            <include>**/*.fxml</include>
            <include>**/*.css</include>
            <include>**/*.jpg</include>
            <include>**/*.js</include>
            <include>**/*.dll</include>
        </includes>
    </resource>
</resources>
```

2. 其它教程参考官方教程或javaFX中文社区

## Jintellitype做全局热键

1.做全局热键的时候需要创建包com.melloware.jintellitype并存入两个文件

    JIntellitype.dll
    JIntellitype64.dll
