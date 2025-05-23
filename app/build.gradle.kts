plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.example.countriesapp"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.countriesapp"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }

    buildFeatures { viewBinding = true }
}

dependencies {

    implementation("com.squareup.retrofit2:retrofit:3.0.0")
    implementation ("com.squareup.retrofit2:converter-gson:3.0.0")


    implementation("io.coil-kt:coil:1.3.2")
    implementation("io.coil-kt:coil-svg:1.3.2")

    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.1")
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.1")
    implementation ("androidx.lifecycle:lifecycle-runtime-ktx:2.3.1")

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.ui.android)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}