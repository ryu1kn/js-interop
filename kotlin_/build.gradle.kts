plugins {
    kotlin("js") version "1.3.72"
}

kotlin {
    target {
        useCommonJs()
        nodejs()
    }

    sourceSets["main"].dependencies {
        implementation(kotlin("stdlib-js"))
        implementation(npm("csv-writer", "1.6.0"))
    }

    sourceSets["test"].dependencies {
        implementation(kotlin("test-js"))
    }
}

repositories {
    jcenter()
}
