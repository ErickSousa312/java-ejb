package spring.infrastructure.app

open class AppConfig {

    open fun getDbUrl(): String {
        return System.getenv("DB_URL")
    }

    open fun getDbUser(): String {
        return System.getenv("DB_USER")
    }

    open fun getDbPassword(): String {
        return System.getenv("DB_PASSWORD")
    }

    open fun getApiKey(): String {
        return System.getenv("APP_API_KEY")
    }

    open fun main() {
        println("DB URL: " + getDbUrl())
        println("DB User: " + getDbUser())
        println("DB Password: " + getDbPassword())
        println("API Key: " + getApiKey())
    }
}