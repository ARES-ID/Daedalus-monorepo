plugins {
    alias(libs.plugins.comAndroidLibrary)
    alias(libs.plugins.orgJetbrainsKotlinAndroid)
    alias(libs.plugins.ioGitlabArturboschDetekt)
    alias(libs.plugins.orgJmailenKotlinter)
    alias(libs.plugins.orgJetbrainsKotlinPluginCompose)
}

android {
    namespace = libs.versions.namespace.get()
    compileSdk = libs.versions.compileSdk.get().toInt()

    defaultConfig {
        minSdk = libs.versions.minSdk.get().toInt()

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro",
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
    implementation(libs.androidxActivity.activityCompose)
    implementation(libs.androidxComposeFoundation.foundation)
    implementation(libs.androidxCore.coreKtx)
    implementation(libs.androidxAppcompat.appcompat)
    implementation(libs.comGoogleAndroidMaterial.material)
    testImplementation(libs.junit.junit)
    androidTestImplementation(libs.androidxTestExt.junit)
    androidTestImplementation(libs.androidxTestEspresso.espressoCore)
}
