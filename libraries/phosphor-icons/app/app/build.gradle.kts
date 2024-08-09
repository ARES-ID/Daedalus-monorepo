plugins {
    alias(libs.plugins.comAndroidApplication)
    alias(libs.plugins.orgJetbrainsKotlinAndroid)
    alias(libs.plugins.ioGitlabArturboschDetekt)
    alias(libs.plugins.orgJmailenKotlinter)
    alias(libs.plugins.orgJetbrainsKotlinPluginCompose)
}

android {
    namespace = libs.versions.namespace.get() + ".app"
    compileSdk = libs.versions.compileSdk.get().toInt()

    defaultConfig {
        applicationId = libs.versions.namespace.get()
        minSdk = libs.versions.minSdk.get().toInt()
        targetSdk = libs.versions.targetSdk.get().toInt()
        versionCode = libs.versions.versionCodeOffset.get().toInt()
        versionName = libs.versions.version.get()

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildFeatures {
        compose = true
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
}

kotlin {
    jvmToolchain {
        languageVersion.set(JavaLanguageVersion.of(libs.versions.javaVersion.get()))
        vendor.set(JvmVendorSpec.matching(libs.versions.javaVendor.get()))
    }
}

detekt {
    baseline = file("$rootDir/../../../config/detekt/baseline.xml")
    config.setFrom("$rootDir/../../../config/detekt/config.yml")
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(libs.versions.javaVersion.get())
        vendor = JvmVendorSpec.matching(libs.versions.javaVendor.get())
    }
}

dependencies {
    implementation(project(":phosphor-icons"))
    implementation(libs.androidxActivity.activityCompose)
    implementation(libs.androidxComposeFoundation.foundation)
    implementation(libs.androidxComposeMaterial3.material3)
    implementation(libs.androidxCore.coreKtx)
    implementation(libs.androidxAppcompat.appcompat)
    implementation(libs.comGoogleAndroidMaterial.material)
    testImplementation(libs.junit.junit)
    androidTestImplementation(libs.androidxTestExt.junit)
    androidTestImplementation(libs.androidxTestEspresso.espressoCore)
}
