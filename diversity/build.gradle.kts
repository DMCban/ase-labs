plugins {
    id("hu.bme.mit.ase.shingler.gradle.java")
}

dependencies {

    api(project(":lib"))
    api(project(":logic"))

    implementation(libs.slf4j.api)
    implementation("info.picocli:picocli:$picoCliVersion")

    runtimeOnly("org.apache.logging.log4j:log4j-slf4j-impl:$log4jVersion")

    testImplementation("org.junit.jupiter:junit-jupiter-api:$junitVersion")

    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:$junitVersion")
}

application {
    mainClass = "hu.bme.mit.ase.shingler.similarity.SimilarityApp"
}
