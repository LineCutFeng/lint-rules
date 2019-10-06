![GitHub](https://img.shields.io/github/license/thirdegg/lint-rules.svg)
[![JitPack](https://jitpack.io/v/LineCutFeng/lint-rules.svg)](https://jitpack.io/#LineCutFeng/lint-rules)
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
