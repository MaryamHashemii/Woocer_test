plugins {
    id("java-platform")
    id("maven-publish")
}

val core = "1.6.0"
val androidX = "1.3.1"
val constraintLayout = "2.1.0"
val material = "1.4.0"

val lifeDataLifecycle = "2.2.0"

val hilt = Versions.HILT_VERSION
val coroutine = "1.3.9"

val retrofit = "2.9.0"
val okHttpClient = "5.0.0-alpha.2"
val gson = "2.9.0"

val room = "2.3.0"
val navigation = Versions.NAVIGATION

val play_service = "17.1.0"


val fresco = "2.6.0"


val data = "18.0.0"
val auth = "18.0.0"
val f_core = "17.0.0"
val firestore = "20.1.0"
val storage = "18.0.0"
val messaging = "19.0.1"
val database = "20.0.3"
val bom = "29.0.1"






dependencies {
    constraints {
        api("${Libs.CORE_KTX}:$core")
        api("${Libs.ANDROID_X}:$androidX")
        api("${Libs.CONSTRAINT_LAYOUT}:$constraintLayout")
        api("${Libs.MATERIAL}:$material")

        api("${Libs.LIVE_DATA_LIFECYCLE}:$lifeDataLifecycle")

        api("${Libs.HILT_ANDROID}:$hilt")
        api("${Libs.HILT_COMPILER}:$hilt")

        api("${Libs.COROUTINE}:$coroutine")

        api("${Libs.RETROFIT}:$retrofit")
        api("${Libs.OK_HTTP_CLIENT}:$okHttpClient")
        api("${Libs.LOGGING_INTERCEPTOR}:$okHttpClient")
        api("${Libs.GSON}:$gson")

        api("${Libs.ROOM_KTX}:$room")
        api("${Libs.ROOM_COMPILER}:$room")
        api("${Libs.ROOM_RUNTIME}:$room")

        api("${Libs.NAVIGATION_FRAGMENT}:${navigation}")
        api("${Libs.NAVIGATION_UI}:${navigation}")


        api("${Libs.PLAY_SERVICE}:${play_service}")



        api("${Libs.FRESCO}:$fresco")

        api("${Libs.FIREBASE_DATA}:$data")
        api("${Libs.FIREBASE_AUTH}:$auth")
        api("${Libs.FIREBASE_CORE}:$f_core")
        api("${Libs.FIREBASE_STORAGE}:$storage")
        api("${Libs.FIREBASE_FIRESTORE}:$firestore")
        api("${Libs.FIREBASE_MESSAGING}:$messaging")
        api("${Libs.FIREVASE_DATABASE}:$database")
        api("${Libs.FIREBASE_BOM}:$bom")

    }
}

publishing {
    publications {
        create<MavenPublication>("myPlatform") {
            from(components["javaPlatform"])
        }
    }
}
