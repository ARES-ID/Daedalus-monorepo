import org.gradle.internal.jvm.inspection.JvmVendor
import org.gradle.jvm.toolchain.internal.DefaultJvmVendorSpec

plugins {
    alias(libs.plugins.comAndroidLibrary)
    alias(libs.plugins.orgJetbrainsKotlinAndroid)
    alias(libs.plugins.comGoogleDevtoolsKsp)
    alias(libs.plugins.ioGitlabArturboschDetekt)
    alias(libs.plugins.orgJmailenKotlinter)
    alias(libs.plugins.ioGithubAdityahaskarDependencygraph)
}

android {
    namespace = libs.versions.namespace.get() + ".data"
    compileSdk = libs.versions.compileSdk.int()

    defaultConfig {
        minSdk = libs.versions.minSdk.int()
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
            ndk.debugSymbolLevel = "FULL"
        }
    }

    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

kotlin {
    jvmToolchain {
        languageVersion.set(JavaLanguageVersion.of(libs.versions.java.get()))
        vendor.set(DefaultJvmVendorSpec.of(JvmVendor.fromString(libs.versions.javaVendor.get()).knownVendor))
    }

    compilerOptions {
        allWarningsAsErrors.set(true)
        explicitApi()
    }
}

ksp {
    arg("room.schemaLocation", "$projectDir/schemas")
}

dependencies {
    implementation(libs.androidxRoom.roomKtx)
    implementation(libs.androidxRoom.roomRuntime)
    implementation(libs.ioInsertKoin.koinAnnotations)
    implementation(libs.ioInsertKoin.koinCore)
    implementation(libs.comJakewhartonTimer.timber)
    ksp(libs.androidxRoom.roomCompiler)
    ksp(libs.ioInsertKoin.koinKspCompiler)
    testImplementation(libs.orgRoboelectric.roboelectric)
    testImplementation(libs.junit.junit)
    testImplementation(libs.ioKotest.kotestProperty)
    testImplementation(libs.ioInsertKoin.koinTestJunit4)
}

@kotlin.jvm.Throws(NumberFormatException::class)
fun Provider<String>.int() = get().toInt()
