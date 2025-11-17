// Configurações básicas - PODE SER IGUAL para todas extensões
plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "eu.kanade.tachiyomi.extension.pt.meusite"
    compileSdk = 34
    
    defaultConfig {
        applicationId = namespace
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }
}

dependencies {
    implementation("dev.kanade:tachiyomi-anime-extension:1.4")
}
