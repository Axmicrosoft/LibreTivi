plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "io.libretivi.app"
    compileSdk = 34

    defaultConfig {
        applicationId = "io.libretivi.app"
        minSdk = 26
        targetSdk = 34
        versionCode = 132
        versionName = "1.3.2-ProFree"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
        freeCompilerArgs += listOf("-opt-in=androidx.media3.common.util.UnstableApi")
    }
    lint {
        checkReleaseBuilds = false
        abortOnError = false
    }
}

dependencies {
    val media3Version = "1.4.1"
    implementation("androidx.core:core-ktx:1.13.1")
    implementation("androidx.annotation:annotation:1.8.0")
    implementation("androidx.media3:media3-exoplayer:$media3Version")
    implementation("androidx.media3:media3-exoplayer-hls:$media3Version")
    implementation("androidx.media3:media3-exoplayer-dash:$media3Version")
    implementation("androidx.media3:media3-exoplayer-rtsp:$media3Version")
    implementation("androidx.media3:media3-datasource-rtmp:$media3Version")
    implementation("androidx.media3:media3-ui:$media3Version")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.8.1")
    implementation("org.nanohttpd:nanohttpd:2.3.1")
}
