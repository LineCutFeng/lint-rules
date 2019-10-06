![GitHub](https://img.shields.io/github/license/thirdegg/lint-rules.svg)
[![JitPack](https://jitpack.io/v/LineCutFeng/lint-rules.svg)](https://jitpack.io/#LineCutFeng/lint-rules)
[![LICENSE](https://img.shields.io/badge/license-Anti%20996-blue.svg)](https://github.com/996icu/996.ICU/blob/master/LICENSE)
[![Badge](https://img.shields.io/badge/link-996.icu-red.svg)](https://996.icu/#/zh_CN)
# Android lint rules

Add to your project ```build.gradle```:

```gradle
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

and to module ```build.gradle```:

```gradle
dependencies {
    ...
    lintChecks('com.github.LineCutFeng:lint-rules:0.0.7-alpha')
}
```

## Checked Exceptions for kotlin
How it works:

![](checked-exceptions.png)
