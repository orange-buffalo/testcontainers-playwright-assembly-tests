// This project does not use kotlin, only java; with custom version of playwright

dependencies {
    constraints {
        testImplementation("com.microsoft.playwright:playwright") {
            version {
                strictly("1.28.0")
            }
        }
    }
}
