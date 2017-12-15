package me.tnsi.scratchpad

import android.app.Application
import io.realm.Realm
import io.realm.RealmConfiguration
import me.tnsi.scratchpad.migrations.Migrations

class ScratchpadApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Realm.init(this)
        var config = RealmConfiguration.Builder()
                .name("scratchpad.realm")
                .schemaVersion(1)
                .deleteRealmIfMigrationNeeded()
                //.migration(Migrations())
                .build()
        Realm.setDefaultConfiguration(config)

    }
}